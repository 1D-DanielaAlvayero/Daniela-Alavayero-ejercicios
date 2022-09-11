/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5perido1clase10semana4;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio5perido1clase10semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3, prom;

    Scanner Teclado = new Scanner (System.in);

    System.out.println("Ingrese su primera nota");
    nota1=Teclado.nextInt(); 
    System.out.println("Ingrese su segunda nota");
    nota2=Teclado.nextInt(); 
    System.out.println("Ingrese su tercera nota");
    nota3=Teclado.nextInt(); 
    prom=(nota1+nota2+nota3)/3;

    if (prom<4) {System.out.println("Reprobado");}
    if (prom>=4&&prom<7) {System.out.println("Regular");}
    if (prom>=7) {System.out.println("Promocionado");}
}
}


    
