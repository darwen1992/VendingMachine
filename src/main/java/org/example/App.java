package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Product1 p1=new Product1(1,2.3,"Cola");
        Product2 p2=new Product2(2,6,"Pizza");
        Product3 p3=new Product3(3,8,"Gum");
        Product p[]={p1,p2,p3};
        VendingMachineImpl ob= new VendingMachineImpl(p);


        String s[]=ob.getProduct();
        System.out.println("List of Pruduct");
        for (int i=0;i<s.length;i++){
            System.out.println( s[i]);
        }
        System.out.println("_________________________________");

        ob.addCurrency(10);
        System.out.println("_________________________________");

        System.out.println("Description is  "+ ob.getDescription(1));
        System.out.println("_________________________________");

        Product re=ob.request(2);
        System.out.println( "Requested  "+ re.getId()+"  "+re.getProductName()+"  "+re.getPrice());
        System.out.println("_________________________________");

        System.out.println("Your balance is  "+ ob.getBalance());
        System.out.println("_________________________________");

        System.out.println("Endedd and your Change is  "+ ob.endSession());
        System.out.println("_________________________________");



        System.out.println( "Bye Bye");
    }
}
