package org.BisDev.intro_api.service;

import org.BisDev.intro_api.exceptionCustomer.CustomedException;
import org.BisDev.intro_api.model.Category;
import org.BisDev.intro_api.model.Theater;
import org.BisDev.intro_api.repository.CategoryRepo;
import org.BisDev.intro_api.repository.TheaterRepo;
import org.BisDev.intro_api.repository.TvaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepo theaterRepo;

    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private TvaRepo tvaRepo;

    public List<Theater> findAllTheater() {
        return theaterRepo.findAll();
    }

    public Optional<Theater> findTheaterByID(int id) {
        return theaterRepo.findById(id);
    }

    public Optional<Theater> findTheaterByName(String name) {
        return theaterRepo.findByName(name);
    }

    public Optional<Theater> findTheaterByAutor(String autor) {
        return theaterRepo.findByAutor(autor);
    }

    public Optional<Category> findByCategoryName(String name) {
        return categoryRepo.findCategoryByName(name);
    }

    public List<Category> findAllCateogry() {
        return categoryRepo.findAll();
    }

    //creaate theater
    public Theater creatTheater(String name, float price, String resume, String image, Date presentationDate, String autor, String categroy, String identifyCode, float tva) throws CustomedException {
        HashMap<String, String> returnMistake = new HashMap<>();

        Optional<Theater> theaterCheck = theaterRepo.findByIdentifyCode(identifyCode);

        if (!theaterCheck.isPresent()) {
            Theater theater1 = new Theater();
            theater1.setIdentifyCode(identifyCode);
            theater1.setName(name);
            theater1.setPrice(price);
            theater1.setResume(resume);
            theater1.setImage(image);
            theater1.setDatePresentation(presentationDate);
            theater1.setAutor(autor);

            Optional<Category> categoryGet = categoryRepo.findCategoryByName(categroy);
            if (categoryGet.isPresent()) {
                Category category1 = categoryGet.get();
                theater1.setCategory(category1);
            } else {
                Category newCategory = new Category();
                newCategory.setName(categroy);
                theater1.setCategory(newCategory);
                categoryRepo.save(newCategory);
                return theater1;
            }

        } else if (theaterCheck.isPresent()) {
            returnMistake.put("theatre present", "Please check the date, it is already present in our database");
            CustomedException ex = new CustomedException("Failure of insertion", returnMistake);
            throw ex;
        }
        return null;
    }
}
