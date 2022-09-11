/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7periodo1clase13semana6;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio7periodo1clase13semana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;

    Scanner Teclado = new Scanner (System.in);

    System.out.println("Ingrese su primer cateto");
    cateto1=Teclado.nextDouble(); 
    System.out.println("Ingrese su segundo cateto");
    cateto2=Teclado.nextDouble(); 
    
    cateto1=Math.pow(cateto1, 2);
    cateto2=Math.pow(cateto2, 2);
    hipotenusa=Math.sqrt(cateto1+cateto2);

    System.out.println("Su hipotenusa es " +hipotenusa);
}
}
    