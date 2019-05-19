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
public class Motorcycle extends MotorVehicle {

    //Attributes
    private boolean eletricIgnition;

    //Constructor 
    public Motorcycle(String brand, int numberOfWheels, String model, int speed, double engineForce, boolean eletricIgnition) {
        super(brand, numberOfWheels, model, speed, engineForce);
        this.setEletricIgnition(eletricIgnition);
    }

    public boolean isEletricIgnition() {
        return eletricIgnition;
    }

    public void setEletricIgnition(boolean eletricIgnition) {
        this.eletricIgnition = eletricIgnition;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        if (this.isEletricIgnition()) {
            System.out.println("Have eletric ignition");
        }else if (!this.isEletricIgnition()){
            System.out.println("Doens't have eletric ignition");
        }
    }
}
