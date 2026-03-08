package rubenjisan.practicaSpringMVC.logic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Loan {
    @Id
    private String id;
    private String name;
    private int type;
    private double amount;
    private double duration;
    private double interest;

    public double getTotalAmount() {
        return amount + (amount * interest);
    }
}
