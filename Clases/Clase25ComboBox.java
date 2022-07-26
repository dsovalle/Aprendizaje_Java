import javax.swing.*;
import java.awt.event.*;

public class Clase25ComboBox extends JFrame implements ItemListener{

 private JComboBox lista;

 public Clase25ComboBox(){
   setLayout(null);

   lista = new JComboBox();
   lista.setBounds(10,10,80,20);
   add(lista);

   lista.addItem("rojo");
   lista.addItem("verde");
   lista.addItem("azul");
   lista.addItem("Amarillo");
   lista.addItem("Negro");
   lista.addItemListener(this);
 }

 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == lista){
    String seleccion = lista.getSelectedItem().toString();
    
    setTitle(seleccion);
  }
 }

 public static void main(String args[]){
   Clase25ComboBox formulario = new Clase25ComboBox();
   formulario.setBounds(0,0,300,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}