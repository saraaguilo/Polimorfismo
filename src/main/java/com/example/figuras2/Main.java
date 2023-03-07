package com.example.figuras2;


import java.util.Arrays;


public class Main {
    public static void ordenar(Figuras[] v){
        Arrays.sort(v);
    }

    //public static void printInfo(Figuras[] v){
        //for (Figuras figura:v){
            //System.out.println("La figura es " + figura.toString()+ "y tiene una area de " + figura.getArea()+ "m^2");
        //}
    //}
    public static double sumaArea(Figuras[] v){
        double total = 0;
        for (Figuras f:v){
            System.out.println(f);
            total+=f.getArea();
        }

        return total;
    }

    public static void main(String[] args) {
        Figuras[] v = new Figuras[3];

        v[0] = new Triangulo(5,9);
        v[1] = new Circulo(3);
        v[2] = new Cuadrado(6);

        double r = sumaArea(v);

        System.out.println("Area total es: "+ r);









    }
}