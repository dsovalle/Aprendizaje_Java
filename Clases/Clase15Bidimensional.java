public class Clase15Bidimensional{
 public static void main(String args[]){
  int numero [][] = new int [2][2];
   
  numero [0][0] = 5;
  numero [0][1] = 2;
  numero [1][0] = 2;
  numero [1][1] = 1;

  System.out.print("[" + numero [0][0]+ "]");
  System.out.println("[" + numero [0][1]+ "]");
  System.out.print("[" + numero [1][0]+ "]");
  System.out.print("[" + numero [1][1]+ "]");
 }
}