package org.example;

public interface VendingMachine {
    void addCurrency(double amount);
    double getBalance();
    Product request(int id);
    double endSession();
    String getDescription(int id);
    String [] getProduct();
}
