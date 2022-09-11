/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6periodo1clase11semana5;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio6periodo1clase11semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, exponente, total;

    Scanner Teclado = new Scanner (System.in);

    System.out.println("Ingrese su base");
    base=Teclado.nextDouble(); 
    System.out.println("Ingrese su exponente");
    exponente=Teclado.nextInt(); 
     
    total=Math.pow(base, exponente);

    System.out.println("El resultado es " +total);
}
}
    
