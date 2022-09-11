/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3periodo3clase8semana3;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio3periodo3clase8semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor, exp, i=0, valor2;
    Scanner Teclado = new Scanner (System.in);
    System.out.println("Ingrese su numero ");
    valor=Teclado.nextInt(); 
    valor2=valor;
    System.out.println("Ingrese su exponente ");
    exp=Teclado.nextInt();
    while(i<=exp){
      System.out.println(valor2);
      valor2=valor2*valor;
      i++;
      
    }
  }
}
   