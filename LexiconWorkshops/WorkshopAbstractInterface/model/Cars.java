package model;


public class Cars extends Product{

    private String color;

    public Cars(int id, double price, String productName, String color) {
        super(id, price, productName);
        this.color = color;
    }

    @Override
    public String examine(){
        return  " Product id: " + getId()
                + " Product name: " + getProductName()
                + " Product Price: " + getPrice()
                + " Product color: " + color;
    }

    @Override
    public String use(){

        return "Product use: playing, decoration";
    }
}