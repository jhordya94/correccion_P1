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

public class TriangularLatas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número natural: ");
        int num = input.nextInt();

        int sum = 0;
        for (int i = 1; sum <= num; i++) {
            sum += i;
            if (sum == num) {
                System.out.println(num + " es adecuado para ser apilado triangularmente.");
                return;
            }
        }
        System.out.println(num + " no es adecuado para ser apilado triangularmente.");
    }
}

