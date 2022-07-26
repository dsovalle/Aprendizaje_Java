import javax.swing.*;

public class Clase18InterfazLabel extends JFrame{
 
  private JLabel titulo;
  private JLabel titulo2;
  
  public Clase18InterfazLabel(){
   setLayout(null);
   
   titulo = new JLabel("Interfaz gráfica");
   titulo.setBounds(10,20,300,30);
   add(titulo);

   titulo2 = new JLabel("Versión 1.0");
   titulo2.setBounds(10, 100, 100,30);
   add(titulo2);     
 }

  public static void main(String args[]){
   Clase18InterfazLabel formulario = new Clase18InterfazLabel();
   formulario.setBounds(0,0,300,200);
   formulario.setLocationRelativeTo(null);
   formulario.setVisible(true);
   formulario.setResizable(false);
 }
}