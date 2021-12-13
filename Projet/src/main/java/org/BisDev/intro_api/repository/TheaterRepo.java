package org.BisDev.intro_api.repository;

import org.BisDev.intro_api.model.Category;
import org.BisDev.intro_api.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TheaterRepo extends JpaRepository<Theater,Integer> {

    @Query("SELECT T FROM Theater  T WHERE T.name = :name")
    Optional<Theater> findByName(String name);

    @Query("SELECT A FROM Theater A WHERE A.autor = :autor")
    Optional<Theater> findByAutor(String autor);

    @Query("SELECT A FROM Theater A WHERE A.identifyCode = :code")
    Optional<Theater> findByIdentifyCode(String code);
}
