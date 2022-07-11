package model;

public class TeddyBears extends Product{

    private String sort;

    public TeddyBears(int id, double price, String productName, String sort) {
        super(id, price, productName);
        this.sort = sort;
    }

    @Override
    public String examine() {
        return  " Product id: " + getId()
                + " Product name: " + getProductName()
                + " Product Price: " + getPrice()
                + " Product sort: " + sort;
    }


    @Override
    public String use() {
        return "You can hug it, play with it and why not also sleep together!";
    }
}