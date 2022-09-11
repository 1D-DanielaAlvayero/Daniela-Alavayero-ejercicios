/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7periodo3clase14semana7;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio7periodo3clase14semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, cont, ans;
    Scanner Teclado = new Scanner (System.in);
    System.out.println("Ingrese su primer numero");
    n=Teclado.nextInt();
    System.out.println("Ingrese su segundo numero");
    m=Teclado.nextInt();
    cont=n;
    while(cont>m){
      System.out.println(cont);
      cont--;
    }
  }
}
