package rubenjisan.practicaSpringMVC.presentation.loans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rubenjisan.practicaSpringMVC.logic.Loan;
import rubenjisan.practicaSpringMVC.logic.Service;

@org.springframework.stereotype.Controller("loans")
@RequestMapping("/presentation/loans")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("loans", service.getAllLoans());
        return "presentation/loans/ViewList";
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("loan", new Loan());
        return "presentation/loans/ViewEdit";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Loan loan){
        service.addLoan(loan);
        return "redirect:/presentation/loans/list";
    }
}
