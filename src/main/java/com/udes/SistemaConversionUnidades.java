package com.udes;

import java.util.Scanner;

public class SistemaConversionUnidades {
    public static void conversor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un valor a convertir:");
        double dato = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Selecciona la unidad del dato(metros, Kilogramos, Celcius) :");
        String unidadInicial = scanner.nextLine().toLowerCase();

        System.out.println("Selecciona la unidad a convertir(centimetros, libras, Fahrenheit) :");
        String unidadFinal = scanner.nextLine().toLowerCase();

        boolean conversionValida = true;
        double resultado = 0;

        if(unidadInicial.equals("metros") && unidadFinal.equals("centimetros")){
            resultado = metrosACentimetros(dato);
        }else if(unidadInicial.equals("celcius") && unidadFinal.equals("fahrenheit")){
            resultado =celsiusAFahrenheit(dato);
        }else if(unidadInicial.equals("kilogramos") && unidadFinal.equals("libras")){
            resultado = kilogramosALibras(dato);
        }else{
            conversionValida = false;
        }

        if(!conversionValida){
            System.out.println("Conversion Invalida!");
        }else{
            System.out.println("Resultado de la conversión: " + resultado + " " + unidadFinal);
        }
    }

    public static double metrosACentimetros(double metros) {
        return metros * 100;
    }

    public static double kilogramosALibras(double kilos) {
        return kilos * 2.20462;
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void mostrar() {
        conversor();
    }
}
