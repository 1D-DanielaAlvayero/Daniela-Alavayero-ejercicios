/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3periodo1clase9semana3;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio3periodo1clase9semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Escriba el primer número entero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Escriba el segundo número entero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 == numero2)
        System.out.println("El numero " + numero1 + " es igual a " + numero2);
        
        if (numero1 != numero2)
        System.out.println("El numero " + numero1 + " es distinto a " + numero2);
        
        if (numero1 < numero2)
        System.out.println("El numero " + numero1 + " es menor a " + numero2);
        
        if (numero1 > numero2)
        System.out.println("El numero " + numero1 + " es mayor a " + numero2);
        
        if (numero1 <= numero2)
        System.out.println("El numero " + numero1 + " es menor o igual a " + numero2);
        
        if (numero1 >= numero2)
        System.out.println("El numero " + numero1 + " es mayor o igual a " + numero2);
    }
    
}
