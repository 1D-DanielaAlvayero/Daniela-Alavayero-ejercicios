/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2periodo1clase8semana3;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio2periodo1clase8semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        
        System.out.println("Escriba el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Escriba el segundo número: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2; 
        
        System.out.println("La suma es " + suma);
    }
    
}
