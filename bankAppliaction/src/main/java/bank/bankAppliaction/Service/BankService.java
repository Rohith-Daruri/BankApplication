package bank.bankAppliaction.Service;

import bank.bankAppliaction.Model.Bank;
import bank.bankAppliaction.Repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;
    public void addCustomer(Bank bank) {
        bank.setAccountNumber(UUID.randomUUID().toString());
        Bank savedAccount = bankRepository.save(bank);
        System.out.println(savedAccount.getName()+" "+savedAccount.getBalance());
    }

    public List<String> getCustomers() {
        List<Bank> bankList = bankRepository.findAll();
        List<String> names = new ArrayList<>();
        for(Bank bank:bankList){
            if(bank.getBalance()>=1000){
                names.add(bank.getName());
            }
        }
        return names;
    }
}
