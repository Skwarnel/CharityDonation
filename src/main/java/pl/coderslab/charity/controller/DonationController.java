package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DonationController {
    InstitutionRepository institutionRepository;

    DonationRepository donationRepository;

    CategoryRepository categoryRepository;

    public DonationController(InstitutionRepository institutionRepository, DonationRepository donationRepository, CategoryRepository categoryRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping("/form")
    public String showForm() {
        return "form";
    }

    @ModelAttribute("donation")
    public Donation createDonation() {
        Donation donation = new Donation();
        return donation;
    }

    @ModelAttribute("institutionsToShow")
    public List<Institution> institutionList() {
        return institutionRepository.findAll();
    }

    @ModelAttribute("categoriesToShow")
    public List<Category> showCategories() {
        return categoryRepository.findAll();
    }

    @RequestMapping("/form-confirmation")
    public String createDonation(Model model, @Valid Donation donation, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        donationRepository.save(donation);
        return "form-confirmation";
    }
}
