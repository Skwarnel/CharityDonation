package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/register")
    public String userRegister() {
        return "register";
    }

}
