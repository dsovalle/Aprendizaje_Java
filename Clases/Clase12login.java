import java.util.Scanner;

public class Clase12login{
  public static void main(String args[]){
   String  usuario = "", password = "";
   Scanner entrada = new Scanner(System.in);
   
   System.out.print("Ingresa nombre de usuario: ");
   usuario = entrada.nextLine();

   System.out.print("Ingresa tu contraseña: ");
   password= entrada.nextLine();

   if(usuario.equals("Daniel") && password.equals("123456") ){
    System.out.println("inicio de sesión correcto");
  } else {
    System.out.println("nombre de usuario o password incorrectos");
  }
 }
}