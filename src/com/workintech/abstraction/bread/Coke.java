package com.workintech.abstraction.bread;

public class Coke extends ProductForSale{

    private boolean hasSugar;

    public Coke(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    public void showDetails(){
        System.out.println(super.toString() +this);
    }

    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                '}';
    }
}
