package account;

import bank.Bank;
import user.BankClient;

public class DebitAccount extends Account {
    public DebitAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank, Integer Id) {
        super(accountNumber, accountBalance, user, bank, Id);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("You have no money in your account");
        } else if (getAccountBalance() - amount < 0) {
            System.out.println("You don't have enough funds in your account");
        } else {
            System.out.println("You will get money without any commission");
            setAccountBalance(getAccountBalance() - amount);
        }

    }

    @Override
    public String toString() {
        return "DebitAccount{}" + super.toString();
    }
}