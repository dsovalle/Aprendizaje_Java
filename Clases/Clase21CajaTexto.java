import javax.swing.*;
import java.awt.event.*;

public class Clase21CajaTexto extends JFrame implements ActionListener{

 private JLabel titulo;
 private JTextField caja_texto;
 private JButton boton1;

 public Clase21CajaTexto(){
   setLayout(null);

   titulo = new JLabel("Usuario");
   titulo.setBounds(10,10,100,30);
   add(titulo);
 
   caja_texto = new JTextField();
   caja_texto.setBounds(120,17,150,20);
   add(caja_texto);
  
   boton1 = new JButton("Enviar");  
   boton1.setBounds(10,70,100,30);
   add(boton1);
   boton1.addActionListener(this);
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    String texto = caja_texto.getText();
    setTitle(texto);
  }
 }

  public static void main(String args[]){
   Clase21CajaTexto formulario = new Clase21CajaTexto();
   formulario.setBounds(0,0,300,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}