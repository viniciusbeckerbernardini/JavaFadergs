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
public class MotorVehicle extends Vehicle {

    private double engineForce;

    public MotorVehicle(String brand, int numberOfWheels, String model, int speed, double engineForce) {
        super(brand, numberOfWheels, model, speed);
        this.setEngineForce(engineForce);
    }

    public double getEngineForce() {
        return engineForce;
    }

    public void setEngineForce(double engineForce) {
        this.engineForce = engineForce;
    }
    
    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Engine force: "+ this.getEngineForce());
    }
}
