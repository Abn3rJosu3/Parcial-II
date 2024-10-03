package PARCIAL02;

import java.awt.Color;//COLOR VENTANA
import java.awt.Font;//TIPO DE TEXTO
import java.awt.Image;//IMAGEN
import java.awt.event.ActionEvent;//ACCION DE EVENTO
import java.awt.event.ActionListener;//OYENTE DE ACCION
import javax.swing.ImageIcon;//ICONO
import javax.swing.JButton;//BOTON
import javax.swing.JCheckBox;//CUADRO DE CHEQUES
import javax.swing.JFrame;//FORMULARIO
import javax.swing.JLabel;//ETIQUETA
import javax.swing.JTextArea;//AREA DE TEXTO
import javax.swing.event.ChangeEvent;//CAMBIO DE EVENTO
import javax.swing.event.ChangeListener;//OYENTE DE CAMBIO

public class VENTANA02 extends JFrame  {//EN ESTE CASO NO SE IMPLEMENTO EL ACTIONLISTENER NI EL CHANGELISTENER PARA REALIZARLO DE OTRA FORMA
//ATRIBUTOS
    private JTextArea Cuadro1;//AREA DE TEXTO
    private JLabel Texto1, Texto2, Texto3, Texto4, Imagen1, Imagen2;//ETIQUETAS
    public String NOMBRE2;//NOMBRE INGRESADO
    private JButton BTN2,BTN3;//BOTONES
    private JCheckBox CHECK1;//CUADRO DE CHEQUE

    public VENTANA02() {
        setSize(500, 600);
        setTitle("BIENVENIDO");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/PARCIAL02/SKYE.png")).getImage());
        getContentPane().setBackground(new Color(97, 14, 246));

//HABILITA LA SALIDA EN EL PANEL PARA ETIQUETAS O CAMPOS DE TEXTO
        setLayout(null);
//TEXTO 1 TERMINOS Y CONDICIONES
        Texto1 = new JLabel("TERMINOS Y CONDICIONES:");
        Texto1.setBounds(75, 2, 350, 75);
        Texto1.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        Texto1.setFont(new Font("Arial Black", 1, 19));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
        add(Texto1);
//IMAGEN EN ETIQUETA RAYDER
        Imagen1 = new JLabel();
        ImageIcon Rayder = new ImageIcon("TEAM.png");
        Imagen1.setBounds(1, 1, 75, 150);//COLUMNA, FILA, ANCHO, ALTO
        Imagen1.setIcon(new ImageIcon(Rayder.getImage().getScaledInstance(75, 150, Image.SCALE_SMOOTH)));//ANCHO,ALTO - CAMBIA LA ESCALA DE LA IMAGEN
        Imagen1.setOpaque(false);//HABILITAR FONDO DE ETIQUETA
        add(Imagen1);//AÑADIR AL PANEL
//IMAGEN EN ETIQUETA SKYE
        Imagen2 = new JLabel();
        ImageIcon Skye = new ImageIcon("S.png");
        Imagen2.setBounds(385, 1, 100, 150);//COLUMNA, FILA, ANCHO, ALTO
        Imagen2.setIcon(new ImageIcon(Skye.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));//ANCHO,ALTO - CAMBIA LA ESCALA DE LA IMAGEN
        Imagen2.setOpaque(false);//HABILITAR FONDO DE ETIQUETA
        add(Imagen2);//AÑADIR AL PANEL  
//TEXTO 2 PARA EXTRAER EL NOMBRE Y SALUDAR        
        this.NOMBRE2 = VENTANA01.NOMBRE;//SE IGUALA LAS VARIABLES PARA OBTENER EN ESTA VENTANA
        Texto2 = new JLabel("HOLA: " + this.NOMBRE2 + " SALUDOS");//TEXTO DE SALUDO CON NOMBRE
        Texto2.setBounds(100, 40, 150, 50);//COLUMNA, FILA, ANCHO, ALTO
        Texto2.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(Texto2);//AÑADIR AL PANEL
//TEXTO 3 MENSAJE DE AVISO        
        Texto3 = new JLabel("NO PODRAS AVANZAR SI NO ACEPTAS LOS TERMINOS Y CONDICIONES");//TEXTO DE SALUDO CON NOMBRE
        Texto3.setBounds(50, 330, 450, 50);//COLUMNA, FILA, ANCHO, ALTO
        Texto3.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(Texto3);//AÑADIR AL PANEL    
//TEXTO 3 DATOS COMO PIE DE VENTANA      
        Texto4 = new JLabel("PROGRAMADOR: ABNER JOSUE ESQUIT BARRENO - 1990-17-15299");//TEXTO DE SALUDO CON NOMBRE
        Texto4.setBounds(50, 500, 450, 50);//COLUMNA, FILA, ANCHO, ALTO
        Texto4.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(Texto4);//AÑADIR AL PANEL 

//CUADRO DE TEXTO
        VENTANA01 V1 = new VENTANA01();
        Cuadro1 = new JTextArea();//CUADRO DE TEXTO
        Cuadro1.setBounds(80, 75, 325, 250);//DIMENSIONES
        Cuadro1.setEditable(false);//NO PERMITE EDITAR EL TEXTO
        Cuadro1.setText("\nSomos una empresa comercial que inicio labores "
                + "\nen 2024, somos una cadena de juguetes creativos"
                + "\ny convencionales de alta calidad y reconocidas"
                + "\nmarcas internacionales, Nuestro mercado objetivo"
                + "\nson padres de familia y niños de 0 a 12 años."
                + "\n\nEL USO DE ESTE SOFTWARE ES EXCLUSIVO"
                + "\nPARA EMPLEADOS DE NUESTRA JUGUETERIA"
                + "\n\nCONTACTANOS"
                + "\n47789366 Y 54203823"
                + "\n\nSIGUENOS EN REDES SOCIALES"
        );
        Cuadro1.setFont(new Font("Arial", 0, 15));//FORMATO
        Cuadro1.setForeground(Color.yellow);//COLOR DE TEXTO
        Cuadro1.setOpaque(false);//VISIBILIDAD DEL AREADETEXTO
        add(Cuadro1);
//CAJA DE CHEQUES
        CHECK1 = new JCheckBox("YO "+this.NOMBRE2+" ACEPTO");//TEXTO CON NOMBRE INGRESADO
        CHECK1.setBounds(100, 365, 250,15);//DIMENSIONES DEL CHECK
        add(CHECK1);//AÑADIR AL PANEL
//BOTON REGRESAR
        BTN2 = new JButton("NO ACEPTAR");//AÑADIR BOTON
        BTN2.setBounds(185, 450, 120, 30);//COLUMNA, FILA, ANCHO, ALTO
        add(BTN2);//AÑADIR AL PANEL
//BOTON SIGUIENTE
        BTN3 = new JButton("CONTINUAR");//AÑADIR BOTON
        BTN3.setBounds(185, 400, 120, 30);//COLUMNA, FILA, ANCHO, ALTO
        add(BTN3);//AÑADIR AL PANEL    
        
        ActionListener Accion02 = new ActionListener(){//ACCION DEL OYENTE
        @Override//SOBREESCRITURA
        public void actionPerformed(ActionEvent ae) {//METODO ABSTRACTO
        VENTANA03 ADELANTE = new VENTANA03();//INSTANCIAR VENTANA 3
        ADELANTE.setVisible(true);//MUESTRA LA VENTANA
        dispose();//CIERRA EL PROCESO
//        setVisible(false);//OTRA FORMA DE OCULTAR LA VENTANA PARA QUE NO SE ACUMULEN
        }
    };   
   BTN3.addActionListener(Accion02);//AÑADIR ACCION AL BOTON
        
        ActionListener Accion = new ActionListener() {//REGRESAR
        @Override//SOBREESCRITURA
        public void actionPerformed(ActionEvent ae) {//METODO ABSTRACTO
        VENTANA01 REGRESO = new VENTANA01();//INSTANCIAR VENTANA 2
        REGRESO.setVisible(true);//MUESTRA LA VENTANA
        dispose();//CIERRA EL PROCESO
//        setVisible(false);//OTRA FORMA DE OCULTAR LA VENTANA PARA QUE NO SE ACUMULEN
        }
    };   
   BTN2.addActionListener(Accion);//AÑADIR ACCION AL BOTON
   ChangeListener Accion03 = new ChangeListener() {//CAMBIO DE ACCION
            @Override//SOBREESCRITURA
            public void stateChanged(ChangeEvent ce) {//METODO ABSTRACTO
   if (CHECK1.isSelected() == false) {//CONDICION PARA INHABILITAR LOS BOTONES SI SE COLOCA EL CHEQUESITO O NO
      BTN2.setEnabled(true);//BOTON ACTIVO
      BTN3.setEnabled(false);//BOTON INACTIVO
    } else {
      BTN2.setEnabled(false);
      BTN3.setEnabled(true);
    } 
            }
            
        };
   CHECK1.addChangeListener(Accion03);//AÑADIR CAMBIO DE ACCION AL CHECK
    
           }
    
//METODO PRINCIPAL
    public static void main(String[] args) {
        VENTANA02 V2 = new VENTANA02();//OBJETO DE LA VENTANA 
        V2.setVisible(true);//SIRVE PARA MOSTRAR LA VENTANA U OBJETO
        V2.setResizable(false);//NO PERMITE MODIFICAR EL TAMAÑO DE LA VENTANA
    }

 



}
