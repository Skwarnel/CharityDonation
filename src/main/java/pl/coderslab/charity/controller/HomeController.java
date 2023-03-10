package pl.coderslab.charity.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;


@Controller
public class HomeController {

    InstitutionRepository institutionRepository;
    DonationRepository donationRepository;
    CategoryRepository categoryRepository;

    public HomeController(InstitutionRepository institutionRepository, DonationRepository donationRepository, CategoryRepository categoryRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
        this.categoryRepository = categoryRepository;
    }

    @ModelAttribute("institutionsToShow")
    public List<Institution> institutionList() {
        return institutionRepository.findAll(Pageable.ofSize(4)).getContent();
    }

    @RequestMapping("/")
    public String homeAction(Model model) {
        return "index";
    }

    @ModelAttribute("bagsQnt")
    public int countBagsQuantity() {
        return donationRepository.countBags().orElse(0);
    }

    @ModelAttribute("donationQnt")
    public long countDonationQuantity() {
        return  donationRepository.count();
    }
}
