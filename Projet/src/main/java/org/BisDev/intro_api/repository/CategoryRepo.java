package org.BisDev.intro_api.repository;

import org.BisDev.intro_api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

    @Query("SELECT c.name FROM Category c INNER JOIN c.theaters t WHERE t.category.name = :name")
    Optional<Category> findCategoryByName(String name);

}
