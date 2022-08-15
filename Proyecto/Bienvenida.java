import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
 
  private JLabel label1, label2, label3, label4;
  private JTextField caja_texto;
  private JButton boton1;
  public static String texto = "";

  public Bienvenida(){
   setLayout(null);
   //Esta linea nos ayuda a que cuando le demos cerrar a nuestro programa no se quede como demonio, es decir en segundo plano.
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   label1 = new JLabel(imagen);
   label1.setBounds(25,15,300,150);
   add(label1);

   label2 = new JLabel("Sistema de Control Vacacional");
   label2.setBounds(35,135,300,30); 
   label2.setFont(new Font("Andale Mono", 3, 18)); 
   label2.setForeground(new Color(255,255,255));
   add(label2);

   label3 = new JLabel("Ingrese su nombre");
   label3.setBounds(45,212,200,30);
   label3.setFont(new Font("Andale Mono", 1, 12));
   label3.setForeground(new Color(255,255,255));
   add(label3);

   label4 = new JLabel("©2017 The Coca.Cola Company");
   label4.setBounds(85,375,300,30);
   label4.setFont(new Font("Andale Mono", 1, 12));
   label4.setForeground(new Color(255,255,255));
   add(label4);

   caja_texto = new JTextField();
   caja_texto.setBounds(45,240,255,25);
   caja_texto.setBackground(new Color(224,224,224));
   caja_texto.setFont(new Font("Andale Mono", 1, 14));
   caja_texto.setForeground(new Color(255,0,0));
   add(caja_texto);

   boton1 = new JButton("Ingresar");
   boton1.setBounds(125,280,100,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setFont(new Font("Andale Mono", 1, 14));
   boton1.setForeground(new Color(255,0,0));
   add(boton1);
   boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
      texto = caja_texto.getText().trim();
      // El metodo trim() nos ayuda a que en caso dado de que el usuario de espacios antes del texto y depues del texto, este metodo borra todos los espacios.

     if(texto.equals("")){
       //Enviar un mensaje:
       JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
     } else {
       Terminos formulario = new Terminos();
       formulario.setBounds(0, 0, 600, 380);
       formulario.setVisible(true);
       formulario.setResizable(false);
       formulario.setLocationRelativeTo(null);
       this.setVisible(false);
     }
   }
 }
 public static void main(String args[]){
   Bienvenida formulario = new Bienvenida();
   formulario.setBounds(0,0,350,450);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}