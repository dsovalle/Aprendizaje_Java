import javax.swing.*;
import javax.swing.event.*;

public class Clase30CheckBox extends JFrame implements ChangeListener{
 
 private JCheckBox check1,check2,check3;
 
 public Clase30CheckBox(){
   setLayout(null);
  
   check1 = new JCheckBox("Ingles");
   check1.setBounds(10,10,150,30);
   add(check1);
   check1.addChangeListener(this);

   check2 = new JCheckBox("Frances");
   check2.setBounds(10,50,150,30);
   add(check2);
   check2.addChangeListener(this);

   check3 = new JCheckBox("Aleman");
   check3.setBounds(10,90,150,30);
   add(check3);
   check3.addChangeListener(this);
 }

 public void stateChanged(ChangeEvent e){
   String cadena = "";
 
  if(check1.isSelected() == true){  
    cadena = cadena + "Inglés-";
    setTitle(cadena);
  }else{
    setTitle("");
  }
  if(check2.isSelected() == true){
    cadena = cadena + "Francés-"; 
    setTitle(cadena);   
  }
  if(check3.isSelected() == true){
    cadena = cadena + "Alemán-";  
    setTitle(cadena);
  }
 }
 public static void main(String args[]){
   Clase30CheckBox formulario = new Clase30CheckBox();
   formulario.setBounds(0,0,350,200);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
} 