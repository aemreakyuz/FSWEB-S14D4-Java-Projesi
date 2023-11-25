package com.workintech.abstraction.bread;

public class Chocolate extends ProductForSale {

    private String color;
    private boolean hasSugar;

    public Chocolate(String type, double price, String description, String color, boolean hasSugar) {
        super(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;
    }

    @Override
    public void showDetails() {

        System.out.println(super.toString() + this);

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Color: " + color + "\n");
        builder.append("Has Sugar: " + hasSugar + "\n");
        return builder.toString();
    }
}
