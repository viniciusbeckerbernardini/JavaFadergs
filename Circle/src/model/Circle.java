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
public class Circle {
    private double ray;
    private double area;
    private double perimeter;

    public Circle(double ray) {
        this.setRay(ray);
    }
    
    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
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
        this.setArea((this.getRay() * this.getRay()) * 3.14);
        System.out.println("The area of the circle is "+ this.getArea());
    }
    
    public void calcPerimeter(){
        this.setPerimeter((2 * 3.14) * this.getRay());
        System.out.println("The perimeter of the circle is "+this.getPerimeter());
    }
}
