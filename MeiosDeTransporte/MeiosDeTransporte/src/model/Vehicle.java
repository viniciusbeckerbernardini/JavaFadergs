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
public class Vehicle {

    //Attributes
    private String brand;
    private int numberOfWheels;
    private String model;
    private int speed = 0;

    public Vehicle(String brand, int numberOfWheels, String model, int speed) {
        this.setBrand(brand);
        this.setNumberOfWheels(numberOfWheels);
        this.setModel(model);
        this.setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printInformation() {
        System.out.println("Brand: " + this.getBrand()+
                           "\nNumber of wheels: " + this.getNumberOfWheels() +
                           "\nModel: " + this.getModel()+
                           "\nActual Speed: " + this.getSpeed()
                );
    }

    public void speedUp(int value) {
        int actualSpeed = this.getSpeed();
        int speedUp = actualSpeed + value;
        this.setSpeed(speedUp);
    }

    public void speedDown(int value) {
        int actualSpeed = this.getSpeed();
        int speedDown = actualSpeed - value;
        this.setSpeed(speedDown);
    }

}
