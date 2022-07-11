package model;

import java.util.Arrays;

public class VendingMachineImpl implements VendingMachine {


    protected Product[] product;
    protected int depositPool;

    public VendingMachineImpl(Product[] product) {
        this.product = product;
    }

    @Override
    public void addCurrency(int amount) {
        int[] acceptedValues =  {1,2,5,10,20,50,100,200,500,1000};
        String message = "";

        for (int i = 0; i < acceptedValues.length; i++) {
            if(acceptedValues[i] == amount){
                depositPool = amount;
                System.out.println(depositPool);
            }
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        Product newProduct = null;

    for(int i = 0; i< product.length; i++)
        if (product[i].getId() == id) {
            if (product[i].getPrice() <= depositPool) {
                newProduct = product[i];
               // System.out.println(newProduct.getProductName());
            }
        }

    if (newProduct == null){
        throw new NullPointerException("Product Not Found");
    }

        return newProduct;
    }

    @Override
    public int endSession() {
        depositPool = 0;
        System.out.println("Session ended!÷");
        return depositPool;

    }

    @Override
    public String getDescription(int id) {
        String description = "";

        for (int i = 0; i < product.length; i++) {
            if (product[i].getId() == id) {
                description = product[i].examine();
            }
        }

        System.out.println(description);
        return description;
    }

    @Override
    public String[] getProducts() {
        String[] foundProducts = new String[product.length];

        for (int i = 0; i < product.length; i++) {
            foundProducts[i] =product[i].examine();
        }

        System.out.println(Arrays.toString(foundProducts));
        return foundProducts;
    }
}