package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@Controller
public class HomeController {

    InstitutionRepository institutionRepository;

    DonationRepository donationRepository;

    public HomeController(InstitutionRepository institutionRepository, DonationRepository donationRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
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

}
