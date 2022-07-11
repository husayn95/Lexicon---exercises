package model;

public class Main {

    public static void main(String[] args) {
        Cars newCar = new Cars(1, 100, "BMW E34","Red");

        Candies newCandies = new Candies(2, 200, "marabou","chocolate");

        TeddyBears teddyBear = new TeddyBears(10,50,"NiceBear", "soft");

        Product[] myProduct = new Product[3];
        myProduct[0] = newCar;
        myProduct[1] = newCandies;
        myProduct[2] = teddyBear;

        VendingMachineImpl vendingMachine = new VendingMachineImpl(myProduct);

        vendingMachine.addCurrency(200); // return
        //vendingMachine.addCurrency(199); // return IllegalArgumentException


        //Handled exception
        try{
            System.out.println(vendingMachine.request(23941234).getProductName());
        } catch (Exception exception){
            exception.printStackTrace();
        }


        //vendingMachine.endSession(); //ends the session and sets the deposit to 0

        vendingMachine.getDescription(10);

        vendingMachine.getProducts();
    }
}