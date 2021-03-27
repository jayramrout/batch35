package jrout.tutorial.batch35.dvdapp.controller;

import jrout.tutorial.batch35.dvdapp.domain.Actor;
import jrout.tutorial.batch35.dvdapp.domain.UserInformation;
import jrout.tutorial.batch35.dvdapp.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DVDController {

    @Autowired
    private IActorService iActorService;

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

    @GetMapping("/actor")
    public String fetchActor(@ModelAttribute("actorInfo") Actor actorModel, Model model){
        Actor actor = iActorService.fetchActor(actorModel.getActorId());
        model.addAttribute("actor", actor);

        return "actordetails"; // index.html
    }

}
