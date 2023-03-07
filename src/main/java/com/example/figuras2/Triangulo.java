package com.example.figuras2;

public class Triangulo extends Figuras{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base=base;
        this.altura=altura;
    }
    //public void setArea(double base, double altura){
        //this.area=base*altura/2;


    public double getArea(){
        return (base*altura)/2;
    }
    public String toString() {
        return "Triangulo con base= " + base + ", altura= " + altura + "y area= " + this.getArea();
    }
}
