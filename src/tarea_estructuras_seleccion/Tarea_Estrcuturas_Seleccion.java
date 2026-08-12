/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_estructuras_seleccion;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tarea_Estrcuturas_Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Aqui solicitamos nombre del estudiante
        System.out.print("Ingrese Nombre del Estudiante\n");
        String nombre = sc.nextLine();
        //Aqui solicitamos las calificaciones del estudiante.
        
        System.out.print("Ingrese calificacion del primer parcial:\n");
        double parcial1 = sc.nextDouble();
        System.out.print("Ingrese calificacion del segundo parcial:\n");
        double parcial2 = sc.nextDouble();
        
        double promedio = (parcial1 + parcial2) / 2;
        
        System.out.println("\n-----------------");
        System.out.println("Estudiante:"+nombre);
        System.out.printf("promedio:%.2f%n",promedio);
        
        //Y por ultimo la estructura de "if" y "else"
        if (promedio >= 65){
            System.out.println("Felicidades, has aprobado el curso");
        }else{
            System.out.println("Lo siente, usted a reprobado el curso");
        }
        // TODO code application logic here
    }
    
}