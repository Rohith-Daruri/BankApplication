package bank.bankAppliaction.Controller;

import bank.bankAppliaction.Model.Bank;
import bank.bankAppliaction.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankService bankService;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody  Bank bank){
        bankService.addCustomer(bank);
        return "Details Added Successfully";
    }
    @GetMapping("/BalanceGreaterThan1000")
    public List<String> getCustomers(){
        List<String> list = bankService.getCustomers();
        return list;
    }
}
