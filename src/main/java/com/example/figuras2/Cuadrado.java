package com.example.figuras2;

public class Cuadrado extends Figuras{
    private double lado;
    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado=lado;
    }
    //public void setArea(double lado){
        //this.area=lado*lado;


    public double getArea(){
        return lado*lado;
    }

    public String toString() {
        return "Cuadrado con lado= " + lado +  " y area= " + this.getArea();
    }


}
