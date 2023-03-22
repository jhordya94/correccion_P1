/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.correccionparcial;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class TrianguloRectangulo {
   public static void main(String[] args) {
       // Pedir al usuario el número de asteriscos de la base
       Scanner sc = new Scanner(System.in);
       System.out.print("Introduce el número de asteriscos de la base del triángulo: ");
       int n = sc.nextInt();
       
       // Dibujar el triángulo rectángulo
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

