package org.example;

import java.util.Random;

public class Aleatorios {
    public void aleatorios(){


        Random aleatorio = new Random();


        int num = aleatorio.nextInt();
        System.out.println(num);

        num = aleatorio.nextInt(3) +100;
        System.out.println(num);

        double numero_decimal = aleatorio.nextDouble()*100;
        System.out.println(numero_decimal);

            //Math.random(), me devuelve un double

        double num_math = Math.random()+3*100;
        System.out.println(num_math);















    }

    public void dados(){

        Random ale = new Random();

        int dado1 = ale.nextInt(6)+1;
        System.out.println("Dado 1 "+ dado1);

        int dado2 = ale.nextInt(6)+1;
        System.out.println("Dado 2 "+ dado2);



        System.out.println("suma " +(dado1+dado2));









    }

    public void ejercicio3(){

        Random ej3 = new Random();

        String caracteres = "ABCDEFGHIJKLMÑOPQRSTU";

        int longitud = 10;

        String contraseña = "";

        int posicion;

        for(int i=0;i<longitud;i++){

            posicion = ej3.nextInt(caracteres.length());
            contraseña += caracteres.charAt(posicion);

        }
         System.out.println("La contraseña generada es :  " + contraseña);




    }





}
