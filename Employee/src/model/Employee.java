/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vbkJi
 */
public class Employee {
    private String name;
    private String subname;
    private int workHours;
    private double pricePerHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    
    public void setCompleteName(){
        System.out.println("Name of the employee: "+this.getName()+" "+this.getSubname()); 
    }
    
    public void calcSalary(){   
        double salary = this.getWorkHours() * this.getPricePerHour();
        System.out.println("His(er) salary is: $"+salary);
    }
    
    public  void setExtraHours(int extraHours){
        int totalHours = getWorkHours() + extraHours;
        this.setWorkHours(totalHours);
        System.out.print("Now, with the extra hours ");
        this.calcSalary();
    }
    
    
}
