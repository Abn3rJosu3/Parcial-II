package PARCIAL02;

import java.awt.Color;//COLOR
import java.awt.Font;//FUENTE
import java.awt.Image;//IMAGEN
import java.awt.event.ActionEvent;//ACCION DE EVENTO
import java.awt.event.ActionListener;//OYENTE DE ACTIONLISTENER
import javax.swing.ImageIcon;//ICONO
import javax.swing.JButton;//BOTON
import javax.swing.JComboBox;//CAJA DE OPCIONES
import javax.swing.JFrame;//FORMULARIO
import javax.swing.JLabel;//ETIQUETA
import javax.swing.JMenu;//MENU
import javax.swing.JMenuBar;//BARRA DE MENU
import javax.swing.JMenuItem;//ITEM DEL MENU
import javax.swing.JOptionPane;//TEXTO MEDIANTE VENTANA
import javax.swing.JTextArea;//AREA DE TEXTO
import javax.swing.JTextField;//CAMPO DE TEXTO

public class VENTANA03 extends JFrame {
//ATRIBUTOS

    private JTextField NOMBRE1, NOMBRE2, APELLIDO1, APELLIDO2, EDAD;
    private JComboBox DEPTO, DEPTO2;
    private JLabel IMAGEN, TEXTO1, TEXTO2, TEXTO3, TEXTO4, TEXTO5, TEXTO6, TEXTO7, TEXTO8, TEXTO9, TEXTO10;
    private JMenu MENU01, MENU02, MENU03;
    private JMenuBar BARRAMENU;
    private JMenuItem MENUITEM01, MENUITEM02, MENUITEM03, MENUITEM04, MENUITEM05;
    private JButton BTN1, BTN2, BTN3;
    private JTextArea CUADRO1;
    public String NOMBRE3, NOMBRE01, NOMBRE02, APELLIDO01, APELLIDO02, EDAD01, COMBO1, COMBO2;
//METODOS

    public VENTANA03() {
        setSize(1000, 1000);//TAMAÑO DE VENTANA
        setTitle("CALCULAR VACACIONES");//TITULO
        setDefaultCloseOperation(EXIT_ON_CLOSE);//TERMINA LA EJECUCION AL CERRAR LA VENTANA
        setLocationRelativeTo(null);//CENTRA LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/PARCIAL02/SKYE.png")).getImage());//ICONO EN LA CARPETA DEL PROYECTO
        getContentPane().setBackground(Color.YELLOW);//OTRA FORMA DE COLOCAR UN COLOR

//HABILITA LA SALIDA EN EL PANEL PARA ETIQUETAS O CAMPOS DE TEXTO
        setLayout(null);
        //CUADRO DE TEXTO 01
        NOMBRE1 = new JTextField();//CUADRO DE TEXTO
        NOMBRE1.setBounds(135, 50, 150, 20);//COLUMNA, FILA, ANCHO, ALTO
        add(NOMBRE1);  //AÑADIR AL PANEL
        //CUADRO DE TEXTO 02
        NOMBRE2 = new JTextField();//CUADRO DE TEXTO
        NOMBRE2.setBounds(135, 100, 150, 20);//COLUMNA, FILA, ANCHO, ALTO
        add(NOMBRE2);  //AÑADIR AL PANEL
        //CUADRO DE TEXTO 03
        APELLIDO1 = new JTextField();//CUADRO DE TEXTO
        APELLIDO1.setBounds(135, 150, 150, 20);//COLUMNA, FILA, ANCHO, ALTO
        add(APELLIDO1);  //AÑADIR AL PANEL
        //CUADRO DE TEXTO 04
        APELLIDO2 = new JTextField();//CUADRO DE TEXTO
        APELLIDO2.setBounds(135, 200, 150, 20);//COLUMNA, FILA, ANCHO, ALTO
        add(APELLIDO2);  //AÑADIR AL PANEL
        //CUADRO DE TEXTO 05
        EDAD = new JTextField();//CUADRO DE TEXTO
        EDAD.setBounds(135, 250, 150, 20);//COLUMNA, FILA, ANCHO, ALTO
        add(EDAD);  //AÑADIR AL PANEL

//BOTON REGRESAR
        BTN1 = new JButton("REGRESAR");//AÑADIR BOTON
        BTN1.setBounds(185, 300, 100, 30);//COLUMNA, FILA, ANCHO, ALTO
        add(BTN1);//AÑADIR AL PANEL
//BOTON LIMPIAR
        BTN2 = new JButton("LIMPIAR");//AÑADIR BOTON
        BTN2.setBounds(10, 300, 100, 30);//COLUMNA, FILA, ANCHO, ALTO
        add(BTN2);//AÑADIR AL PANEL
//BOTON LIMPIAR
        BTN3 = new JButton("CALCULAR");//AÑADIR BOTON
        BTN3.setBounds(350, 225, 100, 30);//COLUMNA, FILA, ANCHO, ALTO
        add(BTN3);//AÑADIR AL PANEL
//COMBO 01
        DEPTO = new JComboBox();
        DEPTO.setBounds(500, 50, 400, 25);
        DEPTO.setBackground(new Color(224, 224, 224));
        DEPTO.setFont(new Font("ARIAL", 1, 20));//FORMATO//
        DEPTO.setForeground(Color.DARK_GRAY);//COLOR DE TEXTO
        DEPTO.addItem("");
        DEPTO.addItem("ATENCION AL CLIENTE");//AÑADIR OPCION AL COMBOBOX
        DEPTO.addItem("DEPARTAMENTO DE LOGISTICA");
        DEPTO.addItem("DEPARTAMENTO DE GERENCIA");
        add(DEPTO);
//COMBO 02
        DEPTO2 = new JComboBox();
        DEPTO2.setBounds(500, 150, 400, 25);
        DEPTO2.setBackground(new Color(224, 224, 224));
        DEPTO2.setFont(new Font("ARIAL", 1, 20));//FORMATO//
        DEPTO2.setForeground(Color.DARK_GRAY);//COLOR DE TEXTO
        DEPTO2.addItem("");
        DEPTO2.addItem("1 AÑO DE SERVICIO");//AÑADIR OPCION AL COMBOBOX
        DEPTO2.addItem("2 A 6 AÑOS DE SERVICIO");
        DEPTO2.addItem("7 O MAS AÑOS DE SERVICIO");
        add(DEPTO2);
//IMAGEN EN ETIQUETA SKYE
        IMAGEN = new JLabel();
        ImageIcon TEAM = new ImageIcon("TEAM.png");
        IMAGEN.setBounds(150, 360, 500, 500);//COLUMNA, FILA, ANCHO, ALTO
        IMAGEN.setIcon(new ImageIcon(TEAM.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));//ANCHO,ALTO - CAMBIA LA ESCALA DE LA IMAGEN
        IMAGEN.setOpaque(false);//HABILITAR FONDO DE ETIQUETA
        add(IMAGEN);//AÑADIR AL PANEL  

        //TEXTO 1 PRIMERO NOMBRE
        TEXTO1 = new JLabel("PRIMER NOMBRE:");
        TEXTO1.setBounds(1, 50, 150, 10);
        TEXTO1.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO1.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO1);

        //TEXTO 2 SEGUNDO NOMBRE
        TEXTO2 = new JLabel("SEGUNDO NOMBRE:");
        TEXTO2.setBounds(1, 100, 150, 10);
        TEXTO2.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO2.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO2);

        //TEXTO 3 PRIMERO APELLIDO
        TEXTO3 = new JLabel("PRIMER APELLIDO:");
        TEXTO3.setBounds(1, 150, 150, 10);
        TEXTO3.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO3.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO3);

        //TEXTO 4 SEGUNDO APELLIDO
        TEXTO4 = new JLabel("SEGUNDO APELLIDO:");
        TEXTO4.setBounds(1, 200, 150, 10);
        TEXTO4.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO4.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO4);

        //TEXTO 5 EDAD
        TEXTO5 = new JLabel("EDAD:");
        TEXTO5.setBounds(1, 250, 150, 10);
        TEXTO5.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO5.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO5);
        //TEXTO 6 DEPARTAMENTO
        TEXTO6 = new JLabel("DEPARTAMENTO:");
        TEXTO6.setBounds(375, 50, 150, 10);
        TEXTO6.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO6.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO6);

        //TEXTO 7 TRABAJO
        TEXTO7 = new JLabel("TIEMPO LABORADO:");
        TEXTO7.setBounds(375, 150, 150, 10);
        TEXTO7.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO7.setFont(new Font("Arial Black", 1, 10));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO7);
        //TEXTO 8 RESULTADO
        TEXTO8 = new JLabel("RESULTADOS:");
        TEXTO8.setBounds(445, 200, 150, 15);
        TEXTO8.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        TEXTO8.setFont(new Font("Arial Black", 1, 15));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(TEXTO8);
        //TEXTO 9 PARA EXTRAER EL NOMBRE Y SALUDAR        
        this.NOMBRE3 = VENTANA01.NOMBRE;//SE IGUALA LAS VARIABLES PARA OBTENER EN ESTA VENTANA
        TEXTO9 = new JLabel("HOLA " + this.NOMBRE3 + " INGRESA TUS DATOS");//TEXTO DE SALUDO CON NOMBRE
        TEXTO9.setBounds(1, 1, 1000, 50);//COLUMNA, FILA, ANCHO, ALTO
        TEXTO9.setFont(new Font("COOPER BLACK", 1, 30));
        TEXTO9.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(TEXTO9);//AÑADIR AL PANEL
        //TEXTO 10 NOMBRE DE LA EMPRESA
        TEXTO10 = new JLabel("JUGUETERIA ABY");
        TEXTO10.setBounds(500, 875, 800, 50);//COLUMNA, FILA, ANCHO, ALTO
        TEXTO10.setFont(new Font("COOPER BLACK", 1, 40));
        TEXTO10.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(TEXTO10);//AÑADIR AL PANEL
//MENU
        BARRAMENU = new JMenuBar();//BARRA
        setJMenuBar(BARRAMENU);
//COLORES
        MENU01 = new JMenu("CAMBIO DE COLORES");//MENU
        BARRAMENU.add(MENU01);

        MENUITEM01 = new JMenuItem("COLOR AZUL");//OPCIONES
        MENU01.add(MENUITEM01);

        MENUITEM02 = new JMenuItem("COLOR CYAN");

        MENU01.add(MENUITEM02);

        MENUITEM03 = new JMenuItem("COLOR MAGENTA");

        MENU01.add(MENUITEM03);

//MENU SALIR
        MENU02 = new JMenu("SALIR");//MENU 2
        BARRAMENU.add(MENU02);

        MENUITEM05 = new JMenuItem("SALIR");
        MENU02.add(MENUITEM05);
//MENU INFORMACION
        MENU03 = new JMenu("INFORMACION");//MENU 3
        BARRAMENU.add(MENU03);

        MENUITEM04 = new JMenuItem("PROGRAMADOR");
        MENU03.add(MENUITEM04);

//CUADRO DE TEXTO
        VENTANA01 V1 = new VENTANA01();
        CUADRO1 = new JTextArea();//CUADRO DE TEXTO
        CUADRO1.setBounds(575, 200, 325, 250);//DIMENSIONES
        CUADRO1.setEditable(false);//NO PERMITE EDITAR EL TEXTO
        CUADRO1.setText("AQUI SE MOSTRARAN LOS RESULTADOS");
        CUADRO1.setFont(new Font("Arial", 0, 15));//FORMATO
        CUADRO1.setForeground(Color.BLACK);//COLOR DE TEXTO
        CUADRO1.setOpaque(true);//VISIBILIDAD DEL AREADETEXTO
        add(CUADRO1);
//ACCIONES Y METODOS ABSTRACTOS
        ActionListener ITEM1 = new ActionListener() {//COLOR AZUL
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == MENUITEM01) {
                    getContentPane().setBackground(Color.BLUE);
                }
            }
        };
        MENUITEM01.addActionListener(ITEM1);
        //COLOR CYAN
        ActionListener ITEM2 = new ActionListener() {//COLOR CYAN
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == MENUITEM02) {
                    getContentPane().setBackground(Color.CYAN);
                }
            }
        };
        MENUITEM02.addActionListener(ITEM2);
        //COLOR MAGENTA
        ActionListener ITEM3 = new ActionListener() {//COLOR MAGENTA
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == MENUITEM03) {
                    getContentPane().setBackground(Color.MAGENTA);
                }
            }
        };
        MENUITEM03.addActionListener(ITEM3);
        //MENU INFORMACION
        ActionListener ITEM4 = new ActionListener() {//COLOR MAGENTA
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "PROGRAMADOR: ABNER JOSUÉ ESQUIT BARRENO\nESTUDIANTE DE INGENIERIA EN SISTEMAS\nCARNE: 1990 17 15299\nSECCION: B\nCURSO: PROGRAMACION II");
            }
        };
        MENUITEM04.addActionListener(ITEM4);

        //MENU SALIR
        ActionListener ITEM5 = new ActionListener() {//COLOR MAGENTA
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();//CERRAR VENTANA
            }
        };
        MENUITEM05.addActionListener(ITEM5);

        //BOTON REGRESAR
        ActionListener REGRESAR = new ActionListener() {//REGRESAR
            @Override
            public void actionPerformed(ActionEvent e) {
                VENTANA02 REGRESO = new VENTANA02();
                REGRESO.setVisible(true);
                dispose();//CIERRA LA VENTANA        
                //setVisible(false);//OCULTA LA VENTANA
            }
        };
        BTN1.addActionListener(REGRESAR);
        //BOTON LIMPIAR
        ActionListener LIMPIAR = new ActionListener() {//LIMPIAR CAMPOS
            @Override
            public void actionPerformed(ActionEvent e) {
                NOMBRE1.setText("");//REEMPLAZA LOS DATOS POR UN ESPACIO VACIO
                NOMBRE2.setText("");
                APELLIDO1.setText("");
                APELLIDO2.setText("");
                EDAD.setText("");
                DEPTO.setSelectedIndex(0);
                DEPTO2.setSelectedIndex(0);
                CUADRO1.setText("");
            }
        };
        BTN2.addActionListener(LIMPIAR);
        //BOTON CALCULAR
        ActionListener CALCULAR;
        CALCULAR = new ActionListener() {//LIMPIAR CAMPOS
            @Override
            public void actionPerformed(ActionEvent e) {
                COMBO1 = DEPTO.getSelectedItem().toString();//CONVIERTE EL COMBO EN CADENA
                COMBO2 = DEPTO2.getSelectedItem().toString();
                NOMBRE01 = NOMBRE1.getText();
                NOMBRE02 = NOMBRE2.getText();
                APELLIDO01 = APELLIDO1.getText();
                APELLIDO02 = APELLIDO2.getText();
                EDAD01 = EDAD.getText();
                if (NOMBRE01.equals("") || NOMBRE02.equals("") || APELLIDO01.equals("") || APELLIDO02.equals("") || EDAD01.equals("") || COMBO1.equals("") || COMBO2.equals("")) {
                    JOptionPane.showMessageDialog(null, "ALGUN CAMPO QUEDO VACIO, DEBES LLENAR TODO");
                } else {//ATENCION AL CLIENTE
                    if (COMBO1.equals("ATENCION AL CLIENTE")) {
                        if (COMBO2.equals("1 AÑO DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n6 DIAS");
                        }
                        if (COMBO2.equals("2 A 6 AÑOS DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO:\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n14 DIAS");
                        }
                        if (COMBO2.equals("7 O MAS AÑOS DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO:\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n20 DIAS");
                        }
                    }//LOGISTICA
                    if (COMBO1.equals("DEPARTAMENTO DE LOGISTICA")) {
                        if (COMBO2.equals("1 AÑO DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n7 DIAS");
                        }
                        if (COMBO2.equals("2 A 6 AÑOS DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO:\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n15 DIAS");
                        }
                        if (COMBO2.equals("7 O MAS AÑOS DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO:\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n22 DIAS");
                        }
                    }//GERENCIA
                    if (COMBO1.equals("DEPARTAMENTO DE GERENCIA")) {
                        if (COMBO2.equals("1 AÑO DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n10 DIAS");
                        }
                        if (COMBO2.equals("2 A 6 AÑOS DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO:\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n20 DIAS");
                        }
                        if (COMBO2.equals("7 O MAS AÑOS DE SERVICIO")) {
                            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE");
                            CUADRO1.setText("TRABAJADOR:\n" + NOMBRE01 + " " + NOMBRE02 + " " + APELLIDO01 + " " + APELLIDO02 + "\nEDAD:\n" + EDAD01 + " AÑOS\n" + "\nPUESTO:\n" + COMBO1 + "\nTIEMPO LABORADO:\n" + COMBO2 + "\n\nVACACIONES AUTORIZADAS:\n30 DIAS");
                        }
                    }
                }
            }

        };
        BTN3.addActionListener(CALCULAR);
    }

//METODO PRINCIPAL
    public static void main(String[] args) {
        VENTANA03 V3 = new VENTANA03();//OBJETO DE LA VENTANA 
        V3.setVisible(true);//SIRVE PARA MOSTRAR LA VENTANA U OBJETO
        V3.setResizable(false);//NO PERMITE MODIFICAR EL TAMAÑO DE LA VENTANA
    }
}
