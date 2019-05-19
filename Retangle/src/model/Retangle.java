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
public class Retangle {
    private double side;
    private double side2;
    private double area;
    private double perimeter;

    public Retangle(double side, double side2){
        this.setSide(side);
        this.setSide2(side2);
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public void calcArea(){
        this.setArea(this.getSide() * this.getSide2());
        System.out.println("This is the area of the retangle: "+this.getArea());
    }
    
    public void calcPerimeter(){
        this.setPerimeter((2 * this.getSide())+ (2 * this.getSide2()));
        System.out.println("This is the perimeter of the retangle: "+this.getPerimeter());
    }
    
}
