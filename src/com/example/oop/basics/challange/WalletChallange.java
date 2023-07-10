package com.example.oop.basics.challange;

public class WalletChallange {
    public static void main(String[] args) {
        float profit = 5000f;
        float expense = 2000f;
        float expense2 = 1000f;

        Wallet wallet = new Wallet();
        for (int i = 0; i < 6; i++) {
            wallet.addMoney(profit);
            wallet.removeMoney(expense);
            wallet.removeMoney(expense2);
        }
        wallet.printAmount();
    }
}

class Wallet {
    float money;

    public Wallet() {
        this.money = 3000f;
    }

    public void addMoney(float amount) {
        this.money += amount;
    }

    public void removeMoney(float amount) {
        this.money -= amount;
    }

    public void printAmount() {
        System.out.println(this.money);
    }
}
