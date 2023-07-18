package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Iva {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el valor: ");
        double valor = keyboard.nextDouble();

        double iva = calcularIVA(valor);
        System.out.println("El IVA es: " + iva);
    }

    public static double calcularIVA(double valor) {
        double ivaPorcentaje = 0.12; // Cambiar este valor si el IVA es distinto

        double ivaRes = valor * ivaPorcentaje;
        return ivaRes;
    }
}
