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

public class ValidarFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        boolean fechaValida = false;
        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) {
                        fechaValida = true;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        fechaValida = true;
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    fechaValida = true;
                }
            } else {
                if (dia >= 1 && dia <= 31) {
                    fechaValida = true;
                }
            }
        }

        if (fechaValida) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
}

