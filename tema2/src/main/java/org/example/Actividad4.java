package org.example;

import java.util.Scanner;

public class Actividad4 {

    public void Hola(){

                Scanner teclado = new Scanner(System.in);

                // Pide al usuario que introduzca una cadena
                System.out.println("Introduce una cadena:");
                String cadena = teclado.nextLine();

                // Recorre cada carácter de la cadena
                for (int i = 0; i < cadena.length(); i++) {
                    // Imprime cada carácter en una nueva línea
                    System.out.println(cadena.charAt(i));
                }
            }
        }






