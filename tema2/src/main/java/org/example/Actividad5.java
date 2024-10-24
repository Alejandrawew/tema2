package org.example;

import java.util.Scanner;

public class Actividad5 {

        public  void  actividad5 (){
            Scanner teclado = new Scanner(System.in);

            // Pide al usuario que introduzca un número
            System.out.println("Introduce un número para mostrar su tabla de multiplicar:");
            int numero = teclado.nextInt();

            // Imprime la tabla de multiplicar del número
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

