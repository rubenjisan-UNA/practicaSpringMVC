package rubenjisan.practicaSpringMVC.data;

import org.springframework.data.jpa.repository.JpaRepository;
import rubenjisan.practicaSpringMVC.logic.Loan;

public interface LoanRepository extends JpaRepository<Loan, String> {
}
