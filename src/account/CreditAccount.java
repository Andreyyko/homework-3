package account;

import bank.Bank;
import user.BankClient;

public class CreditAccount extends Account {
    private Double accountLimit;


    public CreditAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank, Double accountLimit, Integer Id) {
        super(accountNumber, accountBalance, user, bank, Id);
        if (BankClient.getAge() < 18) {
            this.accountLimit = 0.0;
        } else {
            this.accountLimit = 10000.0;
        }
    }


    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }


    @Override
    public String toString() {
        return "CreditAccount{" +
                "accountLimit=" + accountLimit +
                '}';
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("The fee of credit account withdraw is 10 % and you will get an amount that is less than 10 % and  " + (amount - (amount * 0.1)));
    }
}
