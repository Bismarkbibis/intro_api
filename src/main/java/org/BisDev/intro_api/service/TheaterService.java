package org.BisDev.intro_api.service;

import org.BisDev.intro_api.model.Category;
import org.BisDev.intro_api.model.Theater;
import org.BisDev.intro_api.repository.TheaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaterService {

    @Autowired
    private TheaterRepo theaterRepo;

    public List<Theater> findAllTheater(){
        return theaterRepo.findAll();
    }

    public Optional<Theater> findTheaterByID(int id) {
      return theaterRepo.findById(id);
    }

    public Optional<Theater> findTheaterByName(String name){
        return theaterRepo.findByName(name);
    }

    public Optional<Theater> findByAutor(String autor) {
        return theaterRepo.findByAutor( autor);
    }

    public Optional<Category> findByCategoryName(String name) {
        return theaterRepo.findByCategory(name);
    }
}
