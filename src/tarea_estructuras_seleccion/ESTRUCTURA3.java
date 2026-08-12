/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_estructuras_seleccion;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class ESTRUCTURA3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese la operacion a realizar (+, -, *, /, %): ");
        char operador = sc.next().charAt(0);

        System.out.println("\n=== Resultado de la operacion ===");

        switch (operador) {
            case '+':
                double suma = num1 + num2;
                System.out.printf("%d + %d = %.2f%n", num1, num2, suma);
                break;

            case '-':
                double resta = num1 - num2;
                System.out.printf("%d - %d = %.2f%n", num1, num2, resta);
                break;

            case '*':
                double multiplicacion = (double) num1 * num2;
                System.out.printf("%d * %d = %.2f%n", num1, num2, multiplicacion);
                break;

            case '/':
                if (num2 != 0) {
                    double division = (double) num1 / num2;
                    System.out.printf("%d / %d = %.2f%n", num1, num2, division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    double modulo = (double) (num1 % num2);
                    System.out.printf("%d %% %d = %.2f%n", num1, num2, modulo);
                } else {
                    System.out.println("Error: No se puede calcular el módulo con divisor cero.");
                }
                break;

            default:
                System.out.println("Operador no reconocido.");
                break;
        }
    }
    
}
