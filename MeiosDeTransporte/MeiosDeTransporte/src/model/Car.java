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
public class Car extends MotorVehicle{
    //Attributes
    private int numberOfPorts;
    public Car(String brand, int numberOfWheels, String model, int speed, double engineForce,int numberOfPorts){
        super(brand, numberOfWheels, model, speed, engineForce);
        this.setNumberOfPorts(numberOfPorts);
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }
    
    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Number of ports: "+this.getNumberOfPorts());
    }
    

}
