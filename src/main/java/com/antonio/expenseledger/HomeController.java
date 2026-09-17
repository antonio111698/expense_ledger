package com.antonio.expenseledger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        List<Entry> entries = List.of(
                new Entry(LocalDate.of(2026, 9, 14), "Groceries", new BigDecimal("142.50")),
                new Entry(LocalDate.now(), "Coffee", new BigDecimal("15.00")),
                new Entry(LocalDate.of(2026, 9, 17), "Utilities", new BigDecimal("500")),
                new Entry(LocalDate.of(2026, 9, 17), "Car Repair", new BigDecimal("800"))

        );

        model.addAttribute("entries", entries);

        return "index";
    }

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        String name = "Antonio";

        return "Hello " + name + "!";
    }

}
