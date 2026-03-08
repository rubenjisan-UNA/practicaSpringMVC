package rubenjisan.practicaSpringMVC.logic;

import org.springframework.beans.factory.annotation.Autowired;
import rubenjisan.practicaSpringMVC.data.LoanRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public void addLoan(Loan loan) {
        if(loanRepository.existsById(loan.getId())){
            throw new RuntimeException("Loan already exists");
        }
        loanRepository.save(loan);
    }
}
