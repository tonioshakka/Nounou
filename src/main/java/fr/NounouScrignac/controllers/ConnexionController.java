package fr.NounouScrignac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"utilisateurSession"})
public class ConnexionController {




@GetMapping("/contact")
public String contact() {
	return "contact";
}

@GetMapping("/experience")
public String experience() {
    return "experience";
}

@GetMapping("/visite")
public String visite() {
    return "visite";
}

@GetMapping("/index")
public String index() {
    return "index";
}

}
