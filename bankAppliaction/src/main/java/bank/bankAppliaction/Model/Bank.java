package bank.bankAppliaction.Model;

import bank.bankAppliaction.Enum.Account;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    String name;
    String AccountNumber;
    double balance;
    String mobile;
    @Enumerated(EnumType.STRING)
    Account account;

}
