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
public class estructura2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese la edad del cliente:\n ");
        int edad = sc.nextInt();

        System.out.print("Tiene membresia premium?:\n ");
        char respuestaMembresia = sc.next().toUpperCase().charAt(0);
        boolean tieneMembresia = (respuestaMembresia == 'S');

        System.out.print("Ingrese el precio original del juego:\n ");
        double precioOriginal = sc.nextDouble();

        double porcentajeDescuento = 0;

       
        if (edad >= 18) {
            
            if (edad > 65 || tieneMembresia) {
                porcentajeDescuento = 0.20; 
            } else {
                porcentajeDescuento = 0.10; 
            }
        } else {
            
            if (tieneMembresia && edad > 12) {
                porcentajeDescuento = 0.15; 
            } else {
                porcentajeDescuento = 0.00; 
            }
        }

        
        double montoDescuento = precioOriginal * porcentajeDescuento;
        double precioFinal = precioOriginal - montoDescuento;

        
        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.printf("Precio original: L. %.2f%n", precioOriginal);
        System.out.printf("Descuento aplicado: %.0f%% (L. %.2f)%n", (porcentajeDescuento * 100), montoDescuento);
        System.out.printf("Total a pagar: L. %.2f%n", precioFinal);
    }
    
}
    

