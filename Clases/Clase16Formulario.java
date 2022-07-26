import javax.swing.*;

public class Clase16Formulario extends JFrame{
  private JLabel titulo;

  public Clase16Formulario(){
   setLayout(null);
   titulo = new JLabel("Java desde cero");
   titulo.setBounds(10,20,200,300);
   add(titulo);
  }

  public static void main(String args[]){
   Clase16Formulario formulario = new Clase16Formulario();
   formulario.setBounds(0,0,400,300);
   formulario.setVisible(true);
   formulario.setLocationRelativeTo(null);
 }
}