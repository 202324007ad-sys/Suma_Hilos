package Hilo_Ejercicio1;

import java.util.Random;

public class SumaHilos {

    public static void main(String[] args) {
        Random numAle = new Random();
        
        // Generar números aleatorios
        int ng1 = numAle.nextInt(150) + 1;
        int ng2 = numAle.nextInt(150) + 1;

        System.out.println("El numero generado para h1 es: " + ng1);
        System.out.println("El numero generado para h2 es: " + ng2);

        // Crear e iniciar los hilos
        Thread hilo1 = new HiloSuma(ng1, "h1");
        Thread hilo2 = new HiloSuma(ng2, "h2");
        
        hilo1.start();
        hilo2.start();
        
        // Esperar a que ambos hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Ambos hilos han terminado su ejecución");
    }
    
    // Clase interna que representa un hilo de suma
    static class HiloSuma extends Thread {
        private int numero;
        private String nombreHilo;
        
        public HiloSuma(int numero, String nombreHilo) {
            this.numero = numero;
            this.nombreHilo = nombreHilo;
        }
        
        @Override
        public void run() {
            if (nombreHilo.equals("h1")) {
                // Proceso de h1
                if (numero >= 1 && numero <= 100) {
                    System.out.println("Proceso generado por " + nombreHilo);
                    int suma = 0;
                    for (int i = 1; i <= numero; i++) {
                        suma += i;
                    }
                    System.out.println("La suma de 1 hasta " + numero + " es: " + suma);
                } else {
                    System.out.println("La suma no puede ser generada por " + nombreHilo + 
                                     ", ya que " + numero + " esta fuera del rango (1-100)");
                }
            } else if (nombreHilo.equals("h2")) {
                // Proceso de h2
                if (numero >= 100 && numero <= 150) {
                    System.out.println("Proceso generado por " + nombreHilo);
                    int suma = 0;
                    for (int j = 100; j <= numero; j++) {
                        suma += j;
                    }
                    if (numero == 100) {
                        System.out.println("La suma total es: " + suma);
                    } else {
                        System.out.println("La suma de 100 hasta " + numero + " es: " + suma);
                    }
                } else {
                    System.out.println("La suma no puede ser generada por " + nombreHilo + 
                                     " ya que " + numero + " esta fuera del rango (100-150)");
                }
            }
            System.out.println("");
        }
    }
}
