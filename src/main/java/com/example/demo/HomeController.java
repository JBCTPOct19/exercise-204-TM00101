package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/Carform")
    public String loadCarForm(Model model) {
        model.addAttribute("Car", new Car());
        return "carform";
    }

@PostMapping("/carform")
public String processcarForm(Model model){
    model.addAttribute("car", new Car());
    return "carform";
}
}
