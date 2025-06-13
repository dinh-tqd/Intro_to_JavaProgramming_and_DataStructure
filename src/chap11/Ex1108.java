package chap11;

import java.util.Date;
import java.util.ArrayList;

public class Ex1108 {
    public static void main(String[] args) {
        Account acc1 = new Account("George", 1122, 1_000);
        System.out.println(acc1.getName());
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getId());

        acc1.setAnnualInterestRate(1.5);
        acc1.deposit(30, "January Salary");
        acc1.deposit(40, "February Salary");
        acc1.deposit(50, "March Salary");

        acc1.withdraw(500, "Iphone");
        acc1.withdraw(42, "new Tesla Cybertruck");
        acc1.withdraw(21, "restaurant");

        System.out.println("Acc 1 balance now: " + acc1.getBalance());

        System.out.println();
        System.out.println("All transactions: ");
        for (int i = 0; i < acc1.getTransactions().size(); i++) {
            System.out.println(acc1.getTransactions().get(i));
        }
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    Account() {
    }

    Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    //    get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance / 100;
    }

    public void deposit(double depositAmount, String description) {
        balance = balance + depositAmount;
        transactions.add(new Transaction('D', depositAmount, balance, description));
    }

    public void withdraw(double withdrawAmount, String description) {
        balance = balance - withdrawAmount;
        transactions.add(new Transaction('W', withdrawAmount, balance, description));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}

class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type == 'D' || type == 'W')
            this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    // ChatGPT hướng dẫn in thế này cho đẹp
    @Override
    public String toString() {
        return String.format("[%s] %s: $%10.2f, Balance: $%10.2f, Note: %s",
                date, (type == 'D' ? "Deposit " : "Withdraw"),
                amount, balance, description);
    }
}