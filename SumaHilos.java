package Hilo_Ejercicio1;

import java.util.Random; //Libreria para generar numeros aleatorios

public class SumaHilos {

    public static void main(String[] args) {
        //Instancia de la clase Random
        Random numAle = new Random();

        //Declarar variables
        int ng1, ng2;
        int suma_h1, suma_h2;

        //Generar números aleatorios
        ng1 = numAle.nextInt(150) + 1; //Se le agrega +1 porque si no comenzara a generar los numeros de 0 a 149
        ng2 = numAle.nextInt(150) + 1;

        System.out.println("El numero generado para h1 es: " + ng1);
        System.out.println("El numero generado para h2 es: " + ng2);
        System.out.println("");

        // Proceso de h1
        if (ng1 >= 1 && ng1 <= 100) {
            System.out.println("Proceso generado por h1");
            suma_h1 = 0;
            int i = 1;
            while (i <= ng1) {
                suma_h1 = suma_h1 + i;
                i = i + 1;
            }
            System.out.println("La suma de 1 hasta " + ng1 + " es: " + suma_h1);
        } else {
            System.out.println("La suma no puede ser generada por h1, ya que " + ng1 + " esta fuera del rango (1-100)");
        }

        System.out.println("");

        // Proceso de h2
        if (ng2 >= 100 && ng2 <= 150) {
            System.out.println("Proceso generado por h2");
            suma_h2 = 0;
            int j = 100;
            while (j <= ng2) {
                suma_h2 = suma_h2 + j;
                j = j + 1;
            }
            if (ng2 == 100) {
                System.out.println("La suma total es: " + suma_h2);
            } else {
                System.out.println("La suma de 100 hasta " + ng2 + " es: " + suma_h2);
            }
        } else {
            System.out.println("La suma no puede ser generada por h2 ya que " + ng2 + " esta fuera del rango (100-150)");
        }
    }
}
