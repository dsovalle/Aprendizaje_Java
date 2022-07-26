import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clase27Menu extends JFrame implements ActionListener{
 
 //Para crear la barra 
 private JMenuBar menubar; 
 //Para crear las pestañas desplegables 
 private JMenu menu1;
 //Para crear los ítem desplegables
 private JMenuItem menuitem1, menuitem2, menuitem3;

 public Clase27Menu(){
  setLayout(null);

  menubar = new JMenuBar();
  setJMenuBar(menubar); //indicarle al programa que debe agregar una barra dentro de la interfaz, no hay ponerle coordenadas ya que java se encarga de adaptarlos a las medidas de nuestra interfaz.

  menu1 = new JMenu("opciones");
  menubar.add(menu1); //menu1 se va a guardar dentro de la barra 

  menuitem1 = new JMenuItem("Rojo"); 
  menuitem1.addActionListener(this);
  menu1.add(menuitem1); //menuitem se va a guardar dentro de menu1

  menuitem2 = new JMenuItem("Verde");
  menuitem2.addActionListener(this);
  menu1.add(menuitem2);
 
  menuitem3 = new JMenuItem("Azul");
  menuitem3.addActionListener(this);
  menu1.add(menuitem3);
 }

 public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane(); // creamos un contenedor y que debe adaptarse a la interfaz gráfica y con el metodo getContentPane() le indico al programa que debe ver todas las dimensiones de la interfaz gráfica y guardarlas en el contenedor en este caso fondo.

   if(e.getSource() == menuitem1){
      fondo.setBackground(new Color(255,0,0)); 
   }
   if(e.getSource() == menuitem2){
      fondo.setBackground(new Color(0,255,0)); 
   }
   if(e.getSource() == menuitem3){
      fondo.setBackground(new Color(0,0,255)); 
   }
 }
  
 public static void main(String args[]){
   Clase27Menu formulario = new Clase27Menu();
   formulario.setTitle("Menu");
   formulario.setBounds(0,0,400,300); 
   formulario.setVisible(true);
   formulario.setLocationRelativeTo(null);
 }
}