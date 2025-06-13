package chap11;

import java.util.Date;

public class Ex1103 {
    public static void main(String[] args) {
        CheckingAccount acc1 = new CheckingAccount(1210, 1_500);
        acc1.withdraw(1000);
        acc1.withdraw(1500);
        acc1.withdraw(20000);
        System.out.println("///////////////////");
        System.out.println(acc1);

        SavingsAccount acc2 = new SavingsAccount(1995, 2_340);
        acc2.withdraw(100);
        acc2.withdraw(1000);
        acc2.withdraw(1000);
        acc2.withdraw(1000);
        System.out.println("///////////////////");
        System.out.println(acc2);
    }
}

class Account2 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account2() {
    }

    Account2(int id, double balance) {
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

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Balance: " + balance + "\n" +
                "Date created: " + dateCreated + "\n";
    }
}

class CheckingAccount extends Account2 {
    public final static double OVERDRAFT_LIMIT = -2000;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, int balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (this.getBalance() - withdrawAmount < OVERDRAFT_LIMIT) {
            System.out.println("YOU SHALL NOT PASS!");
            System.out.println("Your balance is: " + this.getBalance());
        } else {
            this.setBalance(this.getBalance() - withdrawAmount);
        }
    }
}

class SavingsAccount extends Account2 {
    public SavingsAccount() {

    }

    public SavingsAccount(int id, int balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (this.getBalance() - withdrawAmount < 0) {
            System.out.println("YOU SHALL NOT PASS!");
            System.out.println("Your balance is: " + this.getBalance());
        } else {
            this.setBalance(this.getBalance() - withdrawAmount);
        }
    }
}