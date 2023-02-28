package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.entity.Donation;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    Donation save(Donation donation);

    Donation findById(int id);

    @Query("SELECT d FROM Donation d")
    List<Donation> findAll();
}
