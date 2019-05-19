/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import model.Bike;
import model.Car;
import model.MotorVehicle;
import model.Motorcycle;
import model.Vehicle;

/**
 *
 * @author ALU201815570
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Vehicle v[] = new Vehicle[5];

        // Vehicle
        System.out.println("First, let's gonna create a vehicle.");
        System.out.print("Tell the brand of your vehicle: ");
        String vehicleBrand = scan.next();
        System.out.print("Now, tell me how much wheels the " + vehicleBrand + " vehicle has: ");
        int nWheelsVehicle = scan.nextInt();
        System.out.print("Ok, very good, now, tell me the model of this vehicle: ");
        String vehicleModel = scan.next();
        System.out.print("Very well, now, tell me the speed of this vehicle: ");
        int vehicleSpeed = scan.nextInt();
        v[0] = new Vehicle(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed);
        // Bike
        System.out.println("Well done, now, let's gonna create a bike.");
        System.out.print("Tell the brand of your bike: ");
        vehicleBrand = scan.next();
        System.out.print("Now, tell me how much wheels the " + vehicleBrand + " bike has: ");
        nWheelsVehicle = scan.nextInt();
        System.out.print("Ok, very good, now, tell me the model of this bike: ");
        vehicleModel = scan.next();
        System.out.print("Very well, now, tell me the speed of this bike: ");
        vehicleSpeed = scan.nextInt();
        System.out.print("Now, tell me the number os marches of this bike: ");
        int bikeNMarches = scan.nextInt();
        System.out.print("For we finish, tell me if this bike has a Luggage Rack (Y/N): ");
        String bikeLuggageRack = scan.next();
        if (bikeLuggageRack.equals("Y")) {
            v[1] = new Bike(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed, bikeNMarches, true);
        } else if (bikeLuggageRack.equals("N")) {
            v[1] = new Bike(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed, bikeNMarches, false);
        }
        // Motor vehicle
        System.out.println("Now, let's gonna create a motor vehicle.");
        System.out.print("Tell the brand of your motor vehicle: ");
        vehicleBrand = scan.next();
        System.out.print("Now, tell me how much wheels the " + vehicleBrand + " motor vehicle has: ");
        nWheelsVehicle = scan.nextInt();
        System.out.print("Ok, very good, now, tell me the model of this motor vehicle: ");
        vehicleModel = scan.next();
        System.out.print("Very well, now, tell me the speed of this motor vehicle: ");
        vehicleSpeed = scan.nextInt();
        System.out.print("Tell me the engine force of the motor vehicle: ");
        double engineForce = scan.nextDouble();
        v[2] = new MotorVehicle(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed, engineForce);
        // Motorcycle
        System.out.println("Almost done buddy, let's gonna create a motorcycle now.");
        System.out.print("Tell the brand of your motorcycle: ");
        vehicleBrand = scan.next();
        System.out.print("Now, tell me how much wheels the " + vehicleBrand + " motorcycle has: ");
        nWheelsVehicle = scan.nextInt();
        System.out.print("Ok, very good, now, tell me the model of this motorcycle: ");
        vehicleModel = scan.next();
        System.out.print("Very well, now, tell me the speed of this motorcycle: ");
        vehicleSpeed = scan.nextInt();
        System.out.print("Tell me the engine force of the motorcycle: ");
        engineForce = scan.nextDouble();
        System.out.print("For we finish, tell me if this bike has a eletric ignition (Y/N): ");
        String motorcycleEletricIgnition = scan.next();
        if (motorcycleEletricIgnition.equals("Y")) {
            v[3] = new Motorcycle(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed, engineForce, true);
        } else if (motorcycleEletricIgnition.equals("N")) {
            v[3] = new Motorcycle(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed, engineForce, false);
        }
        // Car
        System.out.println("The last one, let's gonna create a car.");
        System.out.print("Tell the brand of your car: ");
        vehicleBrand = scan.next();
        System.out.print("Now, tell me how much wheels the " + vehicleBrand + " car has: ");
        nWheelsVehicle = scan.nextInt();
        System.out.print("Ok, very good, now, tell me the model of this car: ");
        vehicleModel = scan.next();
        System.out.print("Very well, now, tell me the speed of this car: ");
        vehicleSpeed = scan.nextInt();
        System.out.print("Tell me the engine force of the car: ");
        engineForce = scan.nextDouble();
        System.out.println("For we finish, tell me the number of ports of this car: ");
        int carNPorts = scan.nextInt();
        v[4] = new Car(vehicleBrand, nWheelsVehicle, vehicleModel, vehicleSpeed, engineForce, carNPorts);
        
        
        System.out.println("Registry's info's: ");
        System.out.println("======================================");
        for (int i = 0; i < v.length; i++) {
            System.out.println("======================================");
            v[i].printInformation();
        }
    }

}
