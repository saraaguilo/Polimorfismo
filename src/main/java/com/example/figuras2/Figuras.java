package com.example.figuras2;

public class Figuras {
    protected String nombre;
    protected double area;
    public Figuras (String nombre){
        this.nombre=nombre;

    }
    public String getNombre(){
        return nombre;
    }
    public double getArea(){
        return area;
    }
    public abstract class Figura implements Comparable<Figura> {

        public abstract double area();

        public int compareTo(Figura f) {
            return (int)(this.area()-f.area());//retorna cero si son iguales; retorna 1 si es mayor
        }


    }




}
