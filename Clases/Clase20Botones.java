import javax.swing.*;
import java.awt.event.*;

public class Clase20Botones extends JFrame implements ActionListener{
  private JLabel titulo;
  private JButton boton1, boton2, boton3;

  public Clase20Botones(){
   setLayout(null);

   boton1 = new JButton("1");
   boton1.setBounds(10, 100, 90, 30);
   add(boton1);
   boton1.addActionListener(this);

   boton2 = new JButton("2");
   boton2.setBounds(110,100,90,30);
   add(boton2);
   boton2.addActionListener(this);
  
   boton3 = new JButton("3");
   boton3.setBounds(210,100,90,30);
   add(boton3);
   boton3.addActionListener(this);
 
   titulo = new JLabel("En espera...");
   titulo.setBounds(10,10,300,30);
   add(titulo);
 } 

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     titulo.setText("Has precionado el botón 1");
  } if(e.getSource() == boton2){
     titulo.setText("Has precionado el botón 2");
  } if(e.getSource() == boton3){
     titulo.setText("Has precionado el botón 3");
  }  
 }

  public static void main(String args[]){
   Clase20Botones formulario = new Clase20Botones();
   formulario.setBounds(0,0, 350,200);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}