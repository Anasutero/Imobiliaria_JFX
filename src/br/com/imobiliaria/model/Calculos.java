package br.com.imobiliaria.model;

public class Calculos {
    public double calcularAreaQuadrado(double lado){
        return lado*lado;
    }

    public double calcularAreaRetangulo(double ladoA, double ladoB){
        return ladoA*ladoB;
    }

    public double calcularAreaTriangulo(double altura, double base){
        return (base*altura)/2;
    }

    public double calcularAreaCirculo(double raio){
        return (raio*raio)*3.14;
    }
    public double calcularAreaLosango(double diagonalMaior, double diagonalMenor){
        return (diagonalMaior*diagonalMenor)/2;
    }

}
