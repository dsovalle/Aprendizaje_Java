import javax.swing.*;

public class Clase22JtextArea extends JFrame{
 
 private JTextField caja_texto;
 private JTextArea caja_area;

  public Clase22JtextArea(){
   setLayout(null);

   caja_texto = new JTextField();
   caja_texto.setBounds(10,10,200,30);
   add(caja_texto);

   caja_area = new JTextArea();
   caja_area.setBounds(10,50,400,300);
   add(caja_area);
 }

 public static void main(String args[]){
   Clase22JtextArea formulario = new Clase22JtextArea();
   formulario.setBounds(0,0,540,400);
   formulario.setTitle("Area");
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}