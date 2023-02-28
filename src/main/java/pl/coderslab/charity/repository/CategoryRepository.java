package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.entity.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);

    List<Category> findAllByName(String name);

    Category findById(int id);

    @Query("SELECT c FROM Category c")
    List<Category> findAll();
}
