package com.example.GritAcademyAPI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public ModelAndView home(Model model) {
        model.addAttribute("message", "Welcome!");
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}
