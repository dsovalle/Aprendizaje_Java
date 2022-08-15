import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener{

 private JLabel label1,label2;
 private JTextArea caja_Area;
 private JScrollPane scroll;
 private JCheckBox check;
 private JButton boton1, boton2;
 String nombre = "";

 public Terminos(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    //Llamar una variable que se encuentra en otra clase.
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;

    label1 = new JLabel("TÉRMINOS Y CONDICIONES");
    label1.setBounds(215, 5, 200, 30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);
    label2.setBounds(315, 135, 300, 300);
    label2.setFont(new Font("Andale Mono", 1, 14));
    label2.setForeground(new Color(0,0,0));
    add(label2);
    
    caja_Area = new JTextArea();
    caja_Area.setEditable(false);
    caja_Area.setFont(new Font("Andale Mono", 0, 9));
    caja_Area.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                      "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                      "\n          B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                      "\n          C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE. " +
                      "\n\n        LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE " +
                      "\n        (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED " +
                      "\n        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO) " +
                      "\n        SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE. " +
                      "\n\n        PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE " +
                      "\n        http://www.youtube.com/ernestoperezm ");
    scroll = new JScrollPane(caja_Area);
    scroll.setBounds(10,40,575,200);
    add(scroll);

    check = new JCheckBox("Yo " + nombre + " Acepto");
    check.setBounds(10,250, 300, 30);
    add(check);
    check.addChangeListener(this);

    boton1 = new JButton("Acepto");
    boton1.setBounds(10, 290,100,30);
    boton1.setEnabled(false);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120, 290, 100, 30);
    add(boton2);
    boton2.addActionListener(this);

 }

  public void stateChanged(ChangeEvent e){
    if(check.isSelected() == true){
       boton1.setEnabled(true);
       boton2.setEnabled(false);
    } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      PantallaPrincipal formulario = new PantallaPrincipal();
      formulario.setBounds(0,0,640,540);
      formulario.setVisible(true);
      formulario.setResizable(false);
      formulario.setLocationRelativeTo(null);
      //Le decimos que apague la pantalla de Términos
      this.setVisible(false);

    } else if(e.getSource() == boton2){
      Bienvenida formulario = new Bienvenida();
      formulario.setBounds(0,0,350,450);
      formulario.setVisible(true);
      formulario.setResizable(false);
      formulario.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String args[]){
    Terminos formulario = new Terminos();
    formulario.setBounds(0, 0, 600, 380);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}