import java.util.Scanner;

public class Clase14VectorDinamico{
  public static void main(String args[]){
   int longitud = 0;
   Scanner numero = new Scanner(System.in);

   System.out.print("Ingresa la longitud del vector");
   longitud = numero.nextInt();

   int numeros[] = new int[longitud];

   for(int i = 0; i < numeros.length; i++){
    System.out.println("Por favor dame el valor #" + (i + 1));
    numeros[i] = numero.nextInt();
  }    
   for(int i = 0; i < numeros.length; i++){
    System.out.print("[" + numeros[i] + "]");
  }
 }
}