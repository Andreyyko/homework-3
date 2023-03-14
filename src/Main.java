import account.Account;

import bank.Bank;
import user.BankClient;
import account.DebitAccount;
import account.CreditAccount;

public class Main {
    public static void main(String[] args) {

        BankClient user1 = new BankClient(1, "Petro", 15, "Petro228@gmail.com", "+380688371228", "petropetro007", "Petlury 37 street");
        BankClient user2 = new BankClient(2, "Ivan", 23, "Ivan228@gmail.com", "+380975491562", "ivanchik007", "Doroshenka 3 street");
        BankClient user3 = new BankClient(3, "Maksym", 57, "Maksym57@gmail.com", "+380967280963", "maksiusha35", "Vernad'skogo 56 street");
        BankClient user4 = new BankClient(4, "Danylo", 24, "DanyloWaterPool2007@gmail.com", "+380688951080", "14032007DP", "Vernad'skogo 14 street");
        BankClient user5 = new BankClient(5, "Bohdan", 14, "BodyaLubitVodu@gmail.com", "+380973439544", "BC4049BA", "Trilovskogo 28 street");
        BankClient user6 = new BankClient(6, "Sofia", 19, "SofiaMur@gmail.com", "+380988949473", "SofiaMi0et", "Bohdana street");

        Bank firstBank = new Bank("PrivateBank", "7900892", 5000.00);
        Bank secondBank = new Bank("CredoBank", "7900872", 5000.00);

        DebitAccount account1 = new DebitAccount("4234-1241-2424", 2000.00, user1, firstBank, 1);
        CreditAccount account2 = new CreditAccount("4524-1241-2424", 600.0, user2, secondBank, 7000.0, 2);
        CreditAccount account3 = new CreditAccount("4512-1241-2424", 400.0, user3, secondBank, 3000.0, 3);
        CreditAccount account4 = new CreditAccount("4632-1241-2424", 3000.00, user4, firstBank, 6000.0, 4);
        DebitAccount account5 = new DebitAccount("4123-1241-2424", 250.00, user5, secondBank, 5);
        CreditAccount account6 = new CreditAccount("4113-4145-2574", 100.00, user6, firstBank, 1000.0, 6);

        firstBank.AddAccount(account1);
        firstBank.AddAccount(account2);
        firstBank.AddAccount(account3);
        secondBank.AddAccount(account4);
        secondBank.AddAccount(account5);
        secondBank.AddAccount(account6);

        firstBank.RemoveAccount(account6);

        firstBank.getTotalAmountOfClients();

        secondBank.getMoneyAmountInfo();

        account1.withdraw(10.0);
    }
}