package ao.com.devdario.SpringOauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to /home";
    }

    @GetMapping("/private")
    public String privateRoute(){
        return "You're inside a private route, meaning that you're authenticated !";
    }


}
