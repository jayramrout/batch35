package jrout.tutorial.batch35.dvdapp.controller;

import jrout.tutorial.batch35.dvdapp.domain.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DVDController {

    @PostMapping("/formsubmit")
    public String handleForm(@ModelAttribute("userInfo") UserInformation userInformation, Model model){
        System.out.println(userInformation);
        model.addAttribute("occupation","Software");
        return "final";
    }

    @GetMapping("/")
    public String landingPage(Model model){
        UserInformation userInformation = new UserInformation();
        userInformation.setEmail("default@gmail.com");

        model.addAttribute("userInfo",userInformation);
        System.out.println("Landing Page...");
        return "index"; // index.html
    }
}
