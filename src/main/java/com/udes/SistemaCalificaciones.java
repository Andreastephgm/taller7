package com.udes;

import java.util.Scanner;

public class SistemaCalificaciones {

    public static void calificaciones() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la primera nota: ");
        double primeraNota = scanner.nextDouble();

        System.out.println("Ingresa la segunda nota: ");
        double segundaNota = scanner.nextDouble();

        System.out.println("Ingresa la tercera nota: ");
        double terceraNota = scanner.nextDouble();

        double promedio = calcularPromedio(primeraNota, segundaNota, terceraNota);
        String resultado = validarAprobacionCurso(promedio);

        System.out.println("El promedio es: " + promedio);
        System.out.println("Resultado: " + resultado);
    }

    public static double calcularPromedio(double primeraNota, double segundaNota, double terceranota) {
        return (primeraNota + segundaNota +terceranota) / 3;
    }

    public static String validarAprobacionCurso(double promedio) {
        if(promedio > 60.0){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }

    public static void mostrarResult() {
        calificaciones();
    }

}

