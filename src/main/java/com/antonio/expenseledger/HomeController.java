package com.antonio.expenseledger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class HomeController {

    private final FinancialEntryRepository financialEntryRepository;

    HomeController(FinancialEntryRepository financialEntryRepository){
        this.financialEntryRepository = financialEntryRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        List<FinancialEntry> financialEntries = financialEntryRepository.findAll();

        model.addAttribute("entries", financialEntries);

        return "index";
    }

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        String name = "Antonio";

        return "Hello " + name + "!";
    }

}
