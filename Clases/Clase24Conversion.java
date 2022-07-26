import javax.swing.*;
import java.awt.event.*;

public class Clase24Conversion extends JFrame implements ActionListener{
  
 private JTextField caja_texto1, caja_texto2;  
 private JLabel valor1, valor2, Resultado;
 private JButton boton1;

 public Clase24Conversion(){
   setLayout(null);
     
   valor1 = new JLabel("Valor 1:");
   valor1.setBounds(50,5,100,30);
   add(valor1);

   valor2 = new JLabel("Valor 2:");  
   valor2.setBounds(50,35,100,30);
   add(valor2);

   Resultado = new JLabel("Resultado");  
   Resultado.setBounds(120,80,100,30);
   add(Resultado);

   caja_texto1 = new JTextField();
   caja_texto1.setBounds(120,10,150,20);
   add(caja_texto1);   
   
   caja_texto2 = new JTextField();
   caja_texto2.setBounds(120,40,150,20);
   add(caja_texto2);

   boton1 = new JButton("Sumar");
   boton1.setBounds(10,80,100,30);
   add(boton1);
   boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    int valor_1 = 0, valor_2 = 0, Resultado_2 = 0;
    
    valor_1 = Integer.parseInt(caja_texto1.getText());
    valor_2 = Integer.parseInt(caja_texto2.getText());

    Resultado_2 = valor_1 + valor_2;

    Resultado.setText("Resultado: " + Resultado_2);
  }
 }
 public static void main(String args[]){
   Clase24Conversion formulario = new Clase24Conversion(); 
   formulario.setTitle("Conversión");
   formulario.setBounds(0,0,300,160);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}