package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

import javax.persistence.Cache;
import javax.persistence.criteria.CriteriaBuilder;
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

    @ModelAttribute("institutions")
    public List<Institution> institutionList() {
        return institutionRepository.findAll();
    }

    @RequestMapping("/")
    public String homeAction(Model model) {
        return "index";
    }

    @ModelAttribute("bagsQnt")
    public String countBagsQuantity() {
        int bagsQuantity = donationRepository.countBags();
        return String.valueOf(bagsQuantity);
    }

    @ModelAttribute("donationQnt")
    public String countDonationQuantity() {
        int donationQuantity = donationRepository.countDonation();
        return String.valueOf(donationQuantity);
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

    @ModelAttribute("categoriesToShow")
    public List<Category> showCategories() {
        return categoryRepository.findAll();
    }

    @RequestMapping("/form-confirmation")
    public String createDonation(Donation donation) {
        donationRepository.save(donation);
        return "form-confirmation";
    }
}
