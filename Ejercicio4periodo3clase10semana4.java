/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4periodo3clase10semana4;

/**
 *
 * @author majoalvayero
 */
public class Ejercicio4periodo3clase10semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m;
    double altura, prom, sum=0;
    Scanner Teclado = new Scanner (System.in);
    System.out.println("Ingrese las cantidades de altura ");
    n=Teclado.nextInt();
    m=n;
    while(n>=0){
      System.out.println("Ingrese la altura ");
      altura=Teclado.nextDouble();
      sum=sum+altura;
      n--;
    }
    prom=sum/m;
    System.out.println("El promedio de alturas es "+prom);
  }
}
    
