import javax.swing.*;

public class Clase23Scroll extends JFrame{
 
 private JTextField caja_texto;
 private JScrollPane scroll;
 private JTextArea caja_area; 

 public Clase23Scroll(){
   setLayout(null);
   
   caja_texto = new JTextField();
   caja_texto.setBounds(10,10,200,30);
   add(caja_texto);

   caja_area = new JTextArea();
   scroll = new JScrollPane(caja_area);
   scroll.setBounds(10,50,400,300);
   add(scroll);  
 }

 public static void main(String args[]){
   Clase23Scroll formulario = new Clase23Scroll();
   formulario.setBounds(0,0,540,400);
   formulario.setTitle("Scroll");
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}