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

public class Fibonacci {
   public static void main(String[] args) {
       // Pedir al usuario el número de elementos a mostrar
       Scanner sc = new Scanner(System.in);
       System.out.print("Introduce el número de elementos de la serie de Fibonacci que quieres mostrar: ");
       int n = sc.nextInt();
       
       // Declarar variables para guardar los dos primeros números de la serie
       int a = 0, b = 1;
       
       // Mostrar los primeros n elementos de la serie de Fibonacci
       System.out.print("Serie de Fibonacci: ");
       for (int i = 1; i <= n; i++) {
           System.out.print(a + " ");
           int sum = a + b;
           a = b;
           b = sum;
       }
   }
}

