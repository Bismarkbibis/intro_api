/**
 * Bismaek 21 novembre 2021
 */

package org.BisDev.intro_api.controler;

import org.BisDev.intro_api.exceptionCustomer.CustomedException;
import org.BisDev.intro_api.http.TheaterHttp;
import org.BisDev.intro_api.model.Category;
import org.BisDev.intro_api.model.Theater;
import org.BisDev.intro_api.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin()
public class TheaterControler {

    @Autowired
    private TheaterService theaterService;

    /**
     * Les theater
     */
    @GetMapping("/theater/all")
    public ResponseEntity<List<Theater>> getAll() { //ResponseEntity represents the whole HTTP response: status code, headers, and body.
        List<Theater> theaters = theaterService.findAllTheater();
        return ResponseEntity.ok(theaters); //
    }

    // @PathVariable peut être utilisée pour gérer les variables de modèle dans le mappage d'URI de la demande
    @GetMapping("/theater/{id}")
    ResponseEntity<Optional<Theater>> getById(@PathParam("id") int id) {
        Optional<Theater> theaterById = theaterService.findTheaterByID(id);
        return ResponseEntity.ok(theaterById);
    }

    @GetMapping("theater/{name}")
    ResponseEntity<Optional<Theater>> getByName(@PathParam("name") String name) {
        Optional<Theater> theaterByName = theaterService.findTheaterByName(name);
        return ResponseEntity.ok(theaterByName);
    }

    @GetMapping("theater/autor/{name}")
    ResponseEntity<Optional<Theater>> getByAutor(String name) {
        Optional<Theater> theaterByAutor = theaterService.findTheaterByAutor(name);
        return ResponseEntity.ok(theaterByAutor);
    }

    /**
     * Les category
     */
    @GetMapping("theater/category/{name}")
    ResponseEntity<Optional<Category>> getTheaterByCategoryName(@PathParam("name") String name) {
        Optional<Category> theaterByCategoryName = theaterService.findByCategoryName(name);
        return ResponseEntity.ok(theaterByCategoryName);
    }

    @GetMapping("theater/categrory/all")
    ResponseEntity<List<Category>> getAllCategory() {
        List<Category> categoryAll = theaterService.findAllCateogry();
        return ResponseEntity.ok(categoryAll);
    }

    @PostMapping("theater/insert")
    ResponseEntity<Theater> insertTheater(@RequestBody TheaterHttp theaterHttp) {

        try {
            Theater theater = theaterService.creatTheater(
                    theaterHttp.getName(),
                    theaterHttp.getPrice(),
                    theaterHttp.getResume(),
                    theaterHttp.getImage(),
                    theaterHttp.getDatePresentation(),
                    theaterHttp.getAutor(),
                    theaterHttp.getCategory(),
                    theaterHttp.getIdentifyCode(),
                    theaterHttp.getTva()
            );
            return ResponseEntity.ok(theater);
        } catch (CustomedException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
