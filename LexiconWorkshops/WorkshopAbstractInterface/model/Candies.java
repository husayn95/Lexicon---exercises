package model;

public class Candies extends Product{

    private String type;

    public Candies(int id, double price, String productName, String type) {
        super(id, price, productName);
        this.type = type;
    }

    @Override
    public String examine(){
        return    " Product id: " + getId()
                + " Product name: " + getProductName()
                + " Product Price: " + getPrice()
                + " Product type: " + type;
    }


    @Override
    public String use(){

        return "Open the " + getProductName() + " package and enjoy the different amazing flavours of candy!";
    }
}