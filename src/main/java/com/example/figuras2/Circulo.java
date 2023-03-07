package com.example.figuras2;

public class Circulo extends Figuras{
    private double radio;
    public Circulo(double radio){
        super("Circulo");
        this.radio=radio;
    }
    //public void setArea(double radio){
        //this.area=Math.PI*Math.pow(radio,2);


    public double getArea(){
        return Math.PI*radio*radio;
    }


    public String toString() {
        return "Circulo con radio= " + radio +  "y area= " + this.getArea();
    }
}
