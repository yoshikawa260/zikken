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
    public String showAgeCalculatorForm(Model model) {
        model.addAttribute("age", null); // 初期値として null を設定
        return "ageCalculator"; // フォームを表示
    }

    @PostMapping("/calculate-age")
    public String calculateAge(@RequestParam("birthday") String birthday, Model model) {
        LocalDate birthDate = LocalDate.parse(birthday);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        model.addAttribute("age", age); // 計算した年齢をモデルに追加
        return "ageCalculator"; // 同じテンプレートを表示
    }
}
