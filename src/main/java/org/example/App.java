package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Product1 p1=new Product1(1,2.3,"Cola");
        Product2 p2=new Product2(2,5,"Pizza");
        Product3 p3=new Product3(3,8,"Gum");
        Product p[]={p1,p2,p3};
        VendingMachineImpl ob= new VendingMachineImpl(p);
        System.out.println( "Hello World!" );
    }
}
