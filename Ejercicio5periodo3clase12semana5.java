/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5periodo3clase12semana5;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio5periodo3clase12semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m=1, fact=1;
    Scanner Teclado = new Scanner (System.in);
    System.out.println("Su número");
    n=Teclado.nextInt();
    do {
      fact=fact*m;
      m++;
    } while (m<=n);
    System.out.println("El factorial es "+fact);    
  }
}
    
