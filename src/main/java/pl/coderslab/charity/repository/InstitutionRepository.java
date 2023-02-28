package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.entity.Institution;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    Institution save(Institution institution);

    List<Institution> findAllByName(String name);

    Institution findById(int id);

    @Query("SELECT i FROM Institution i")
    List<Institution> findAll();
}
