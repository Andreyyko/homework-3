package account;

import bank.Bank;
import user.BankClient;


public class Account {
    public void withdraw(double amount) {
    }

    private String accountNumber;
    private Double accountBalance;
    private BankClient user;
    private Bank bank;
    private Integer Id;

    public Account(String accountNumber, Double accountBalance, BankClient user, Bank bank, Integer Id) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.user = user;
        this.bank = bank;
        this.Id = Id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankClient getUser() {
        return user;
    }

    public void setUser(BankClient user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Account " + Id + "{\n" + "   accountNumber='" + accountNumber + '\'' +
                "\n   accountBalance=" + accountBalance +
                "\n   user=" + user +
                "\n   bank=" + bank +
                "\n}";
    }
}