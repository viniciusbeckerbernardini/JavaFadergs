/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALU201815570
 */
public class Bike extends Vehicle {

    //Attributes
    private int numberOfMarches;
    private boolean luggageRack;

    public Bike(String brand, int numberOfWheels, String model, int speed, int numberOfMarches, boolean luggageRack) {
        super(brand, numberOfWheels, model, speed);
        this.setNumberOfMarches(numberOfMarches);
        this.setLuggageRack(luggageRack);
    }

    public int getNumberOfMarches() {
        return numberOfMarches;
    }

    public void setNumberOfMarches(int numberOfMarches) {
        this.numberOfMarches = numberOfMarches;
    }

    public boolean isLuggageRack() {
        return luggageRack;
    }

    public void setLuggageRack(boolean luggageRack) {
        this.luggageRack = luggageRack;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Number of marches" + this.getNumberOfMarches());
        if (this.isLuggageRack()) {
            System.out.println("Have a Luggage Rack");
        } else if (!this.isLuggageRack()) {
            System.out.println("Doens't have a Luggage Rack");
        }
    }
}
