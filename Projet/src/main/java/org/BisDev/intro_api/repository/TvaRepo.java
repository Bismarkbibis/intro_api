package org.BisDev.intro_api.repository;

import org.BisDev.intro_api.model.TVA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TvaRepo extends JpaRepository<TVA,Integer> {

    @Query("SELECT T.rate FROM TVA T WHERE T.rate=:taux")
    Optional<TVA> findByRate(float taux);
}
