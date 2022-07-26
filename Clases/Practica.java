import javax.swing.*;
import java.awt.event.*;

public class Practica extends JFrame implements ActionListener{
  int contador = 1;
  int valor = 0;
  int valor2 = 0;
  
  private JLabel titulo, titulo2;
  private JTextField caja_texto, caja_texto2;
  private JButton boton1;
  private JTextArea Cajon;
 
  public Practica(){
   setLayout(null);
   setTitle("Practica");

   titulo = new JLabel("Ingrese número de filas");
   titulo.setBounds(10,10,200,30);
   add(titulo);

   Cajon = new JTextArea();
   Cajon.setBounds(10,200,400,300);
   add(Cajon);
    
   titulo2= new JLabel("Ingrese número de columnas");
   titulo2.setBounds(10,40,200,30);
   add(titulo2);

   caja_texto = new JTextField();
   caja_texto.setBounds(220,10,100,30);
   add(caja_texto);

   caja_texto2 = new JTextField();
   caja_texto2.setBounds(220,40,100,30);
   add(caja_texto2);

   boton1 = new JButton("Enviar");
   boton1.setBounds(10,70,150,30);
   add(boton1);
   boton1.addActionListener(this);
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     String texto =  caja_texto.getText();
     String texto2 = caja_texto2.getText();
     try{  
       valor = Integer.parseInt(texto);
       valor2 = Integer.parseInt(texto2);
     }
     catch (NumberFormatException g){
       System.err.println("No se puede convertit a numero");
       g.printStackTrace();
     }

   Metodo();
 }
}

public void Metodo(){
    int numeros[][] = new int[valor][valor2];
     for(int j=0; j < valor; j++){
      for(int i=0; i < valor2; i++){
       numeros[j][i] = contador;

       Cajon.append("[" + numeros[j][i] + "]");
       contador++;
     }
    }
}
  public static void main(String args[]){
   Practica formulario = new Practica(); 
   formulario.setBounds(0,0,600,600);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 
 }
}