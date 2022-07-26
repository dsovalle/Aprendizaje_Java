import javax.swing.*;
import java.awt.event.*;

public class ClaseEjercicio extends JFrame implements ActionListener{
 
 String texto = "";
 private JTextField caja_texto;
 private JTextArea caja_area;
 private JScrollPane scroll;
 private JButton boton1;

 public ClaseEjercicio(){
   setLayout(null);

   caja_texto = new JTextField();
   caja_texto.setBounds(10,10,200,30);
   add(caja_texto);

   caja_area = new JTextArea(); 
   scroll = new JScrollPane(caja_area);
   scroll.setBounds(10,50,400,300);
   add(scroll);

   boton1 = new JButton("Agregar");
   boton1.setBounds(250,10,100,30);
   add(boton1);
   boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){

    texto += caja_texto.getText() + "\n";
    
    caja_texto.setText(""); 
    caja_area.setText(texto);  
  }
 }

 public static void main(String args[]){
   ClaseEjercicio formulario = new ClaseEjercicio();
   formulario.setTitle("Combinado");
   formulario.setBounds(0,0,540,400);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}