package com.algaworks.matematica;

public class CalculadoraArea {

    public static final double PI = 3.14159;

    public static double calcularAreaQuadrado(double medidoDoLado) {
        return medidoDoLado * medidoDoLado;
    }
    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }

}
