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

public class ContarPalabras {
   public static void main(String[] args) {
       // Pedir al usuario que introduzca la frase
       Scanner sc = new Scanner(System.in);
       System.out.print("Introduce una frase: ");
       String frase = sc.nextLine();
       
       // Contar el número de palabras de la frase
       int numPalabras = contarPalabras(frase);
       
       // Mostrar el resultado
       System.out.println("La frase introducida tiene " + numPalabras + " palabras.");
   }
   
   public static int contarPalabras(String frase) {
       // Eliminar los espacios en blanco al principio y al final de la frase
       frase = frase.trim();
       
       // Si la frase está vacía, retornar 0
       if (frase.isEmpty()) {
           return 0;
       }
       
       // Contar el número de palabras de la frase
       int numPalabras = 1;
       for (int i = 0; i < frase.length(); i++) {
           char c = frase.charAt(i);
           if (c == ' ') {
               numPalabras++;
           }
       }
       
       return numPalabras;
   }
}

