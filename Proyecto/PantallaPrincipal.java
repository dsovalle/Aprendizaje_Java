import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener {

  private JMenuBar menubar;
  private JMenu menuOpciones, menuCalcular, menuAcerca, menuColor;
  private JMenuItem itemRojo, itemMorado, itemNegro, itemVacaciones, itemNuevo, itemSalir, itemCreador;
  private JLabel labelLogo, labelTitulo, labelSubtitulo, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento,
      labelAntiguedad, labelResultado, labelFooter;
  private JTextField caja_texto1, caja_texto2, caja_texto3;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JTextArea textarea;
  private JScrollPane scroll;
  String nombreAdministrador = "";

  public PantallaPrincipal() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto;

    menubar = new JMenuBar();
    menubar.setBackground(new Color(255, 0, 0));
    setJMenuBar(menubar);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255, 0, 0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255, 255, 255));
    menubar.add(menuOpciones);

    menuColor = new JMenu("Color de fondo");
    menuColor.setFont(new Font("Andale Mono", 1, 14));
    menuColor.setForeground(new Color(255, 0, 0));
    menuOpciones.add(menuColor);

    itemRojo = new JMenuItem("Rojo");
    itemRojo.setFont(new Font("Andale Mono", 1, 14));
    itemRojo.setForeground(new Color(255, 0, 0));
    itemRojo.addActionListener(this);
    menuColor.add(itemRojo);

    itemMorado = new JMenuItem("Morado");
    itemMorado.setFont(new Font("Andale Mono", 1, 14));
    itemMorado.setForeground(new Color(255, 0, 0));
    itemMorado.addActionListener(this);
    menuColor.add(itemMorado);

    itemNegro = new JMenuItem("Negro");
    itemNegro.setFont(new Font("Andale Mono", 1, 14));
    itemNegro.setForeground(new Color(255, 0, 0));
    itemNegro.addActionListener(this);
    menuColor.add(itemNegro);

    itemNuevo = new JMenuItem("Nuevo");
    itemNuevo.setFont(new Font("Andale Mono", 1, 14));
    itemNuevo.setForeground(new Color(255, 0, 0));
    itemNuevo.addActionListener(this);
    menuOpciones.add(itemNuevo);

    itemSalir = new JMenuItem("Salir");
    itemSalir.setFont(new Font("Andale Mono", 1, 14));
    itemSalir.setForeground(new Color(255, 0, 0));
    itemSalir.addActionListener(this);
    menuOpciones.add(itemSalir);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255, 0, 0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255, 255, 255));
    menubar.add(menuCalcular);

    itemVacaciones = new JMenuItem("Vacaciones");
    itemVacaciones.setFont(new Font("Andale Mono", 1, 14));
    itemVacaciones.setForeground(new Color(255, 0, 0));
    itemVacaciones.addActionListener(this);
    menuCalcular.add(itemVacaciones);

    menuAcerca = new JMenu("Acerca de");
    menuAcerca.setBackground(new Color(255, 0, 0));
    menuAcerca.setFont(new Font("Andale Mono", 1, 14));
    menuAcerca.setForeground(new Color(255, 255, 255));
    menubar.add(menuAcerca);

    itemCreador = new JMenuItem("El creador");
    itemCreador.setFont(new Font("Andale Mono", 1, 14));
    itemCreador.setForeground(new Color(255, 0, 0));
    itemCreador.addActionListener(this);
    menuAcerca.add(itemCreador);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5, 5, 250, 100);
    add(labelLogo);

    labelTitulo = new JLabel("Bienvenido " + nombreAdministrador);
    labelTitulo.setBounds(280, 30, 300, 50);
    labelTitulo.setFont(new Font("Andale Mono", 1, 32));
    labelTitulo.setForeground(new Color(255, 255, 255));
    add(labelTitulo);

    labelSubtitulo = new JLabel("Datos del trabajador para el cálculo de vacaciones");
    labelSubtitulo.setBounds(45, 140, 900, 25);
    labelSubtitulo.setFont(new Font("Andale Mono", 0, 24));
    labelSubtitulo.setForeground(new Color(255, 255, 255));
    add(labelSubtitulo);

    labelNombre = new JLabel("Nombre Completo:");
    labelNombre.setBounds(25, 188, 180, 25);
    labelNombre.setFont(new Font("Andale Mono", 1, 12));
    labelNombre.setForeground(new Color(255, 255, 255));
    add(labelNombre);

    caja_texto1 = new JTextField();
    caja_texto1.setBounds(25, 213, 150, 25);
    caja_texto1.setBackground(new Color(224, 224, 224));
    caja_texto1.setFont(new Font("Andale Mono", 1, 14));
    caja_texto1.setForeground(new Color(255, 0, 0));
    add(caja_texto1);

    labelAPaterno = new JLabel("Apellido Paterno:");
    labelAPaterno.setBounds(25, 248, 180, 25);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAPaterno.setForeground(new Color(255, 255, 255));
    add(labelAPaterno);

    caja_texto2 = new JTextField();
    caja_texto2.setBounds(25, 273, 150, 25);
    caja_texto2.setBackground(new Color(224, 224, 224));
    caja_texto2.setFont(new Font("Andale Mono", 1, 14));
    caja_texto2.setForeground(new Color(255, 0, 0));
    add(caja_texto2);

    labelAMaterno = new JLabel("Apellido Materno:");
    labelAMaterno.setBounds(25, 308, 180, 25);
    labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAMaterno.setForeground(new Color(255, 255, 255));
    add(labelAMaterno);

    caja_texto3 = new JTextField();
    caja_texto3.setBounds(25, 334, 150, 25);
    caja_texto3.setBackground(new Color(224, 224, 224));
    caja_texto3.setFont(new Font("Andale Mono", 1, 14));
    caja_texto3.setForeground(new Color(255, 0, 0));
    add(caja_texto3);

    labelDepartamento = new JLabel("Selecciona el Departamento");
    labelDepartamento.setBounds(220, 188, 180, 25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255, 255, 255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220, 213, 220, 25);
    comboDepartamento.setBackground(new Color(224, 224, 224));
    comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new Color(255, 0, 0));
    add(comboDepartamento);

    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atención al Cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona la antigüedad:");
    labelAntiguedad.setBounds(220, 248, 180, 25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    labelAntiguedad.setForeground(new Color(255, 255, 255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220, 273, 220, 25);
    comboAntiguedad.setBackground(new Color(224, 224, 224));
    comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new Color(255, 0, 0));
    add(comboAntiguedad);

    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o más de servicio");

    labelResultado = new JLabel("Resultado del Cálculo:");
    labelResultado.setBounds(220, 307, 180, 25);
    labelResultado.setFont(new Font("Andale Mono", 1, 12));
    labelResultado.setForeground(new Color(255, 255, 255));
    add(labelResultado);

    textarea = new JTextArea();
    textarea.setEditable(false);
    textarea.setBackground(new Color(224, 224, 224));
    textarea.setFont(new Font("Andale Mono", 1, 11));
    textarea.setForeground(new Color(255, 0, 0));
    textarea.setText("\n   Aquí aparece el resultado del cálculo  de las vacaciones.");
    scroll = new JScrollPane(textarea);
    scroll.setBounds(220, 333, 385, 90);
    add(scroll);

    labelFooter = new JLabel("2017 The Coca-Cola Company | Todos los derechos reservados");
    labelFooter.setBounds(135, 445, 500, 30);
    labelFooter.setFont(new Font("Andale Mono", 1, 12));
    labelFooter.setForeground(new Color(255, 255, 255));
    add(labelFooter);
  }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == itemVacaciones){
     String nombreTrabajador = caja_texto1.getText();
     String ApellidoPaterno= caja_texto2.getText();
     String ApellidoMaterno = caja_texto3.getText();
     String Departamento = comboDepartamento.getSelectedItem().toString();
     String Antiguedad = comboAntiguedad.getSelectedItem().toString();
     
     if(nombreTrabajador.equals("") || ApellidoPaterno.equals("") ||
        ApellidoMaterno.equals("") || Departamento.equals("") || 
        Antiguedad.equals("")){
     	JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
     } else {

       if(Departamento.equals("Atención al Cliente")){

         if(Antiguedad.equals("1 año de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 6 días de vacaciones.");
         }
         if(Antiguedad.equals("2 a 6 años de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 14 días de vacaciones.");
         }
         if(Antiguedad.equals("7 años o más de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " +  ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 20 días de vacaciones.");
         }
       }
     if(Departamento.equals("Departamento de Logística")){

         if(Antiguedad.equals("1 año de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 7 días de vacaciones.");
         }
         if(Antiguedad.equals("2 a 6 años de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 15 días de vacaciones.");
         }
         if(Antiguedad.equals("7 años o más de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 22 días de vacaciones.");
         }
       }
     if(Departamento.equals("Departamento de Gerencia")){

         if(Antiguedad.equals("1 año de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 10 días de vacaciones.");
         }
         if(Antiguedad.equals("2 a 6 años de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 20 días de vacaciones.");
         }
         if(Antiguedad.equals("7 años o más de servicio")){
           textarea.setText("\n  El trabajador " + nombreTrabajador + " " + ApellidoPaterno + " " + ApellidoMaterno +
           "\n quien labora en" + Departamento + "con " + Antiguedad +
           "\n recibe 30 días de vacaciones.");
         }
       }
     }
   }
   if(e.getSource() == itemRojo){
     getContentPane().setBackground(new Color(255, 0, 0));
   }
   if(e.getSource() == itemMorado){
     getContentPane().setBackground(new Color(51, 0, 51));
   }
   if(e.getSource() == itemNegro){
     getContentPane().setBackground(new Color(0, 0, 0));
   }
   if(e.getSource() == itemNuevo){
     caja_texto1.setText("");
     caja_texto2.setText("");
     caja_texto3.setText("");
     comboDepartamento.setSelectedIndex(0);
     comboAntiguedad.setSelectedIndex(0);
     textarea.setText("\n   Aquí aparece el resultado del cálculo  de las vacaciones.");
   }
   if(e.getSource() == itemSalir){
     Bienvenida formulario = new Bienvenida();
     formulario.setBounds(0,0,350,450);
     formulario.setVisible(true);
     formulario.setResizable(false);
     formulario.setLocationRelativeTo(null);
     this.setVisible(false);
   }
   if(e.getSource() == itemCreador){
     JOptionPane.showMessageDialog(null, "Desarrollado por Daniel Ovalle \n" +
                                          "Programador Junior");
   }
 }

  public static void main(String args[]) {
    PantallaPrincipal formulario = new PantallaPrincipal();
    formulario.setBounds(0, 0, 640, 540);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}