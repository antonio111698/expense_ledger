package com.antonio.expenseledger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController {

    private final FinancialEntryRepository financialEntryRepository;

    HomeController(FinancialEntryRepository financialEntryRepository) {
        this.financialEntryRepository = financialEntryRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        List<FinancialEntry> financialEntries = financialEntryRepository.findAll();

        model.addAttribute("entries", financialEntries);

        return "index";
    }

    @PostMapping("/entries")
    public String addEntry(@RequestParam(name = "entryDate") LocalDate entryDate, @RequestParam(name = "description") String description, @RequestParam(name = "amount") BigDecimal amount) {
        FinancialEntry financialEntry = new FinancialEntry(entryDate, description, amount);
        financialEntryRepository.save(financialEntry);

        return "redirect:/";
    }

    @PostMapping("/entries/delete")
    public String deleteEntry(@RequestParam(name = "id") Long id) {
        financialEntryRepository.deleteById(id);

        return "redirect:/";
    }

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        String name = "Antonio";

        return "Hello " + name + "!";
    }

}
