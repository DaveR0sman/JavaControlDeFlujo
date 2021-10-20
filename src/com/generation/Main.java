package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* if (condicion) {

        } else if () {

        } else {

        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu edad");
        int edad = sc.nextInt();

        System.out.println("Ingresa tu nombre");
        sc.next();
        String nombre = sc.nextLine();

        if(edad > 18) {
            System.out.println("felicidades " + nombre + " puedes votar");
        } else {
            System.out.println(nombre + " aun no puedes votar");
        }
        sc.close();
    }
}
