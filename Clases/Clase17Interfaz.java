import javax.swing.*;

public class Clase17Interfaz extends JFrame{

  public Clase17Interfaz(){
   setLayout(null);
 }
  
  public static void main(String argas[]){
   Clase17Interfaz formulario = new Clase17Interfaz();
   formulario.setBounds(0,0,400,550);
   formulario.setVisible(true);
   formulario.setLocationRelativeTo(null);
   formulario.setResizable(false);
 } 
}