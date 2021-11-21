package org.BisDev.intro_api.controler;

import org.BisDev.intro_api.model.Theater;
import org.BisDev.intro_api.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class TheaterControler {

    @Autowired
    private TheaterService  theaterService;

    @GetMapping("/theater/all")
    public ResponseEntity<List<Theater>> getAll(){ //ResponseEntity represents the whole HTTP response: status code, headers, and body.
        List<Theater>  theaters = theaterService.findAllTheater();
        return ResponseEntity.ok(theaters); //
    }
}
