/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4periodo1clase9semana3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio4periodo1clase9semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        
        System.out.println("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        
        if (numero1 >= 100){
            System.out.println("El número " + numero1 + " es mayor o igual a 100");
            
        }
        else if (numero1 >= 50){
            System.out.println("El número " + numero1 + " es mayor o igual a 50 pero menor que 100");
            
            
        }
        else if (numero1 >= 0)
            System.out.println("El número " + numero1 + " es mayor o igual 0 pero menor que 50");
        }
    }
    
}
