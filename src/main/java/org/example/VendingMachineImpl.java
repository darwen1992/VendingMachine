package org.example;

public class VendingMachineImpl implements VendingMachine {

    Product[] products;
    double depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) {
if (amount==1||amount==2||amount==5||amount==10||amount==20||amount==50||amount==100||amount==200||amount==500||amount==1000){
     depositPool=depositPool+amount;
    }

    else{
        System.out.println("Amount not accepted");
    }}
    //Add money to the deposit pool. Only accepts the following values:
      //      1,2,5,10,20,50,100,200,500,1000


    @Override
    public Product request(int id) {
        boolean fin=false;
        for (int i=0;i<products.length;i++){
            if (products[i].getId()==id){
                if(products[i].getPrice()>=depositPool){
                    fin=true;
                    return products[i];
                }
                else {
                    System.out.println("not enugh money");
                    return null;
                }
            }

        }
            System.out.println("id not found");
        return null;
    }


    @Override
    public double endSession() {
        double x=depositPool;
        depositPool=0.0;
        return x;

    }

    @Override
    public String getDescription(int id) {
String disc="";
        for (int i=0;i<products.length;i++){
            if (products[i].getId()==id){
                disc=products[i].getId()+products[i].getProductName()+products[i].getPrice();
            }}
        return disc;
    }


    @Override
    public double getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProduct() {
        String st[]=new String[3];
        st[0]=products[0].getId()+products[0].getProductName()+products[0].getPrice();
        st[1]=products[1].getId()+products[1].getProductName()+products[1].getPrice();
        st[2]=products[2].getId()+products[2].getProductName()+products[2].getPrice();

        return st;
    }
}
