/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1periodo2clase3semana2;

import java.util.Scanner;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio1periodo2clase3semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day;

    Scanner Teclado = new Scanner (System.in);

    System.out.println("Ingrese su numero de dia");
    day=Teclado.nextInt(); 

    switch (day){
      case 1:
        System.out.println("Su dia es lunes");
        break;
      case 2:
        System.out.println("Su dia es martes");
        break;
      case 3:
        System.out.println("Su dia es miercoles");
        break;
      case 4:
        System.out.println("Su dia es jueves");
        break;
      case 5:
        System.out.println("Su dia es viernes");
        break;
      case 6:
        System.out.println("Su dia es sabado");
        break;
      case 7:
        System.out.println("Su dia es domingo");
        break;
      default:
        System.out.println("ese numero no corresponde a un dia");
        break;
    }
}
}
    
