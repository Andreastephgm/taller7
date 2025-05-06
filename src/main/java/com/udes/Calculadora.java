package com.udes;

import java.util.Scanner;

public class Calculadora {

    public static void menuCalculadora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingresa otro número:");
        double numero2 = scanner.nextDouble();

        int seleccion;

            System.out.println("\n=== Calculadora ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Resultado: " + sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(numero1, numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + dividir(numero1, numero2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("Resultado: " + potencia(numero1, numero2));
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("¡Operación inválida!");
            }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void mostrarCalculadora() {
        menuCalculadora();
    }
}

