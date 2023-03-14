package bank;

import account.Account;

public class Bank {

    private String bankName;
    private String bankCode;
    private Double moneyAmount;
    private static int amountOfAccounts = 0;


    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public static int getAmountOfAccounts() {
        return amountOfAccounts;
    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    public void AddAccount(Account account) {
        amountOfAccounts++;
        moneyAmount = moneyAmount + account.getAccountBalance();
        System.out.println("Account was added " + " '" + account.getAccountNumber() + "'");
    }

    public void RemoveAccount(Account account) {
        if (account.getAccountBalance() < 0) {
            System.out.println("Account can not be removed. This client has a credit.");
            return;
        }
        amountOfAccounts--;
        moneyAmount = moneyAmount + account.getAccountBalance();
        System.out.println("Account was removed " + " '" + account.getAccountNumber() + "'");
    }

    public void getMoneyAmountInfo() {
        System.out.println("Total amount of money in " + this.bankName + " is " + moneyAmount);
    }

    public void getTotalAmountOfClients() {
        System.out.println("Total amount of accounts is " + amountOfAccounts);
    }


    public Bank(String bankName, String bankCode, Double moneyAmount) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.moneyAmount = 5000.00;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
