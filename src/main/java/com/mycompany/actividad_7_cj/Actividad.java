
package com.mycompany.actividad_7_cj;

/**
 *
 * @author AlanEduardo
 */
public class Actividad {

    public static void main(String[] args) {
        
        sucesionFibonacci(20);
        primo(20);
    }
    
    
     public static void sucesionFibonacci (int serie) {
        int num1 = 0, num2 = 1, suma = 1;
        int [] arreglo = new int[serie];
        
        System.out.println("Sucesión de Fibonacci:");
         
        for (int i = 1; i < serie; i++) {
             
            arreglo[i]=suma;
             
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print(arreglo[i] + ", ");
         }
    }

    public static void primo(int numero) {
        
        int[] arreglo = new int[numero];
        int n = 2;
        int total = 0;

        while (total < numero) {

            boolean esPrimo = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                arreglo[total] = n;
                total++;
            }
            n++;
        }
        System.out.println("\n\nNumeros Primos:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
    }

}
