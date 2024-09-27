package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;

@Controller
public class AgeCalculatorController {

    @GetMapping("/age-calculator")
    public String showAgeCalculatorForm() {
        return "ageCalculator";
    }

    @PostMapping("/calculate-age")
    public String calculateAge(@RequestParam("birthday") String birthday, Model model) {
        LocalDate birthDate = LocalDate.parse(birthday);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        model.addAttribute("age", age);
        return "ageCalculator";
    }
}
