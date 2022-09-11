/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2periodo2clase7semana3;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio2periodo2clase7semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double sueldo, aumento;
    int categoria;

    Scanner Teclado = new Scanner (System.in);

    System.out.println("Cual es su categoria?");
    categoria=Teclado.nextInt(); 
    System.out.println("Ingrese su sueldo");
    sueldo=Teclado.nextDouble(); 

    switch(categoria){
      case 1: 
        sueldo=sueldo+((sueldo*15)/100);
        System.out.println("Nuevo sueldo: "+sueldo);
        break;
      case 2:
        sueldo=sueldo+((sueldo*10)/100);
        System.out.println("Nuevo sueldo: "+sueldo);
        break;
      case 3: 
        sueldo=sueldo+((sueldo*8)/100);
        System.out.println("Nuevo sueldo: "+sueldo);
        break;
      case 4: 
        sueldo=sueldo+((sueldo*7)/100);
        System.out.println("Nuevo sueldo: "+sueldo);
        break;
      default: System.out.println("no es una categoria valida");
    }
}
}
    
