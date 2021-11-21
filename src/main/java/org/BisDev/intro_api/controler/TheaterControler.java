/**
 * Bismaek 21 novembre 2021
 */

package org.BisDev.intro_api.controler;

import org.BisDev.intro_api.model.Category;
import org.BisDev.intro_api.model.Theater;
import org.BisDev.intro_api.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin()
public class TheaterControler {

    @Autowired
    private TheaterService  theaterService;

    /**
     *
     * @return theater id
     */
    @GetMapping("/theater/all")
    public ResponseEntity<List<Theater>> getAll(){ //ResponseEntity represents the whole HTTP response: status code, headers, and body.
        List<Theater>  theaters = theaterService.findAllTheater();
        return ResponseEntity.ok(theaters); //
    }

    // @PathVariable peut être utilisée pour gérer les variables de modèle dans le mappage d'URI de la demande
    @GetMapping("/theater/{id}")
    ResponseEntity<Optional<Theater>> getById(@PathParam("id") int id){
        Optional<Theater> theaterById = theaterService.findTheaterByID(id);
        return ResponseEntity.ok(theaterById);
    }
    @GetMapping("theater/{name}")
    ResponseEntity<Optional<Theater>> getByName(@PathParam("name") String name){
        Optional<Theater> theaterByName= theaterService.findTheaterByName(name);
        return ResponseEntity.ok(theaterByName);
    }
    @GetMapping("theater/category/{name}")
    ResponseEntity<Optional<Category>> getTheaterByCategoryName(@PathParam("name") String  name){
        Optional<Category> theaterByCategoryName=theaterService.findByCategoryName(name);

    }

}
