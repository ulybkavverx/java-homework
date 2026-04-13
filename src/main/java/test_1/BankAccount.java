package test_1;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String someOwner, int someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {
        return this.owner;
    }
    int getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(int amount) {
        this.balance += amount;
    }
    void withdraw(int amount) {
        this.balance -= amount;
    }

    void printBalance() {
        System.out.println("Владелец: " + this.owner + " баланс: " + this.balance);
    }
}
