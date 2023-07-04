package com.company;

public class TipoDatosMain {

    public static void main(String[] args){
        ImprimirDatos();
    }
    public static void ImprimirDatos(){
        // Enteros
        byte nbyte = 127;
        short nshort = 256;
        int nint = 512;
        long nlong = 1024;

        // Punto flotante
        float nfloat = 4.9f;
        double ndouble = 2.4;

        // Caracter
        char nchar = 'a';

        // Booleanos
        boolean ntrue = true;
        boolean nfalse = false;

        // Cadenas de texto
        String nstring = "Hola";

        //Envoltorio
        Integer ninteger = null;
        Long nLong = 2L;

        System.out.println("Numeros enteros: \n" +
                "byte: "+nbyte+"\n"+
                "short: "+nshort+"\n"+
                "int: "+nint+"\n"+
                "long: "+nlong+"\n"+
                "Punto Flotante\n"+
                "float: "+nfloat+"\n"+
                "double: "+ndouble+"\n"+
                "De caracter\n"+
                "char: "+nchar+"\n"+
                "Logicos\n"+
                "booleano 0: "+nfalse+"\n"+
                "booleano 1: "+ntrue+"\n"+
                "Cadenas de Texto\n"+
                "String: "+nstring+"\n"+
                "Envoltorios\n"+
                "Integer: "+ninteger+"\n"+
                "Long: "+nLong);
    }
}
