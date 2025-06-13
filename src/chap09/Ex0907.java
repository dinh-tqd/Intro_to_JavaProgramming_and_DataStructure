package chap09;

import java.util.Date;

public class Ex0907 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20_000);

        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println(account1.getBalance());
        System.out.println(account1.getMonthlyInterest());
        System.out.println(account1.getDateCreated());
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
    }
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

//    get/set
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

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
    }
}
