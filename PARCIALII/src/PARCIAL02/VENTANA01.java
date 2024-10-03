package PARCIAL02;


import java.awt.Color;//COLOR DE VENTANA
import java.awt.Font;//TIPO DE FUENTE Y TAMAÑO
import java.awt.Image;//IMAGEN
import java.awt.event.ActionEvent;//COMPLEMENTO DE ACCION
import java.awt.event.ActionListener;//OYENTE DE ACCION
import javax.swing.ImageIcon;//ICONO BARRA DE TAREA
import javax.swing.JButton;//BOTON
import javax.swing.JFrame;//VENTANA
import javax.swing.JLabel;//TEXTO
import javax.swing.JOptionPane;//INGRESO Y SALIDA DE TEXTO MEDIANTE VENTANA
import javax.swing.JTextField;//CUADRO DE TEXTO

public class VENTANA01 extends JFrame implements ActionListener{//SE IMPLEMENTA LA ACCION DE OYENTE PARA QUE EL BOTON FUNCIONE

    private JLabel jLabel1, jLabel2, jLabel3, jLabel4,jLabel5;//VARIABLES PARA ETIQUETAS
    private JTextField JTF1;//VARIABLE PARA CAMPO DE TEXTO
    private JButton BTN1;//VARIABLE PARA BOTON
    protected static String NOMBRE;//SE UTILIZA UNA VARIABLE ESTATICA Y PROTEGIDA PARA ACCEDER MEDIANTE OTRA CLASE DEL MISMO PAQUETE

    public VENTANA01 () {//EL METODO TIENE QUE TENER EL MISMO NOMBRE QUE LA CLASE
        setSize(500, 600);//TAMAÑO DE LA VENTANA(ANCHO,ALTO)
        setTitle("JUGUETERIA ABY");//COLOCA TITULO A LA BARRA DE TITULOS
        setDefaultCloseOperation(EXIT_ON_CLOSE);//TERMINA LA EJECUCION AL CERRAR LA VENTANA
        setLocationRelativeTo(null);//CENTRA VENTANA EN LA PANTALLA
        setIconImage(new ImageIcon(getClass().getResource("/PARCIAL02/SKYE.png")).getImage());//AÑADIR ICONO
        getContentPane().setBackground(new Color(244, 74, 159));//CAMBIAR COLOR DE FONDO(ROJO,VERDE,AZUL) WORD

//HABILITA LA SALIDA EN EL PANEL PARA ETIQUETAS O CAMPOS DE TEXTO
        setLayout(null);
//ETIQUETA 01 NOMBRE DE EMPRESA
        jLabel1 = new JLabel("JUGUETERIA ABY");//TEXTO 
        jLabel1.setBounds(15, 1, 500, 40);//COLUMNA, FILA, ANCHO, ALTO
        add(jLabel1);//AÑADIR AL PANEL
        jLabel1.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        //jLabel1.setForeground(Color.green);//COLOR DE TEXTO 2
        jLabel1.setBackground(new Color(155, 1, 8));//COLOR DE FONDO DE ETIQUETA
        //jLabel1.setBackground(Color.CYAN);//COLOR DE FONDO ETIQUETA 2
        jLabel1.setOpaque(false);//HABILITAR FONDO DE ETIQUETA
        jLabel1.setFont(new Font("COOPER BLACK", 1, 40));//CAMBIAR FORMATO DE TEXTO - TIPO DE LETRA, ESTILO, TAMAÑO
//ETIQUETA 02 INGRESO DE NOMBRE
        jLabel2 = new JLabel("INGRESE SU NOMBRE:");//TEXTO
        jLabel2.setBounds(3, 40, 150, 50);//COLUMNA, FILA, ANCHO, ALTO
        jLabel2.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(jLabel2);//AÑADIR AL PANEL
        
//ETIQUETA 04 CON DATOS PERSONALES
        jLabel4 = new JLabel("JUGUETERIA ABY                                 Abner Josué Esquit Barreno - 1990 17 15299");//TEXTO
        jLabel4.setBounds(20, 500, 450, 50);//COLUMNA, FILA, ANCHO, ALTO
        jLabel4.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(jLabel4);//AÑADIR AL PANEL
        
//ETIQUETA 05 CON DATOS DEL CURSO
        jLabel5 = new JLabel("PROGRAMACION II - SECCION B");//TEXTO
        jLabel5.setBounds(290, 515, 400, 50);//COLUMNA, FILA, ANCHO, ALTO
        jLabel5.setForeground(new Color(255, 255, 255));//COLOR DE TEXTO
        add(jLabel5);//AÑADIR AL PANEL

//CUADRO DE TEXTO 01 PARA AÑADIR NOMBRE
        JTF1 = new JTextField();//CUADRO DE TEXTO
        JTF1.setBounds(135, 50, 150, 20);//COLUMNA, FILA, ANCHO, ALTO
        add(JTF1);  //AÑADIR AL PANEL
//BOTON INGRESAR
        BTN1 = new JButton("ACCEDER");//AÑADIR BOTON
        BTN1.setBounds(350, 45, 100, 30);//COLUMNA, FILA, ANCHO, ALTO
        BTN1.addActionListener(this);//AGREGA EL OYENTE AL BOTON
        add(BTN1);//AÑADIR AL PANEL
//IMAGEN MEDIANTE ETIQUETA
        jLabel3 = new JLabel();//ETIQUETA PARA IMAGEN
        ImageIcon imagen = new ImageIcon("TEAM.png");//IMAGEN COLOCADA EN CARPETA DEL PROYECTO PARCIAL II
        jLabel3.setBounds(15, 70, 450, 450);//COLUMNA, FILA, ANCHO, ALTO
        jLabel3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(450, 450, Image.SCALE_SMOOTH)));//ANCHO,ALTO - CAMBIA LA ESCALA DE LA IMAGEN
        jLabel3.setOpaque(false);//HABILITAR FONDO DE ETIQUETA
        add(jLabel3);//AÑADIR AL PANEL

    }

    @Override//SOBREESCRITURA
    public void actionPerformed(ActionEvent paramActionEvent) {
        if (paramActionEvent.getSource() == this.BTN1) {//ACTIVA LA ACCION OBTENIDA EN EL BOTON
            NOMBRE = JTF1.getText().trim();//OBTIENE EL TEXTO DEL CAMPO DE TEXTO
            if (NOMBRE.contentEquals("")) {//SI EL CAMPO QUEDA VACIA MUSTRA UN ERROR 
                JOptionPane.showMessageDialog(null, "ESTE CAMPO NO PUEDE QUEDAR VACIO, INGRESA TU NOMBRE POR FAVOR");//MENSAJE DE ERROR POR NO INGRESAR CODIGO
            } else {//SI SE CUMPLE LA CONDICION MUESTRA LA SIGUIENTE VENTANA
                VENTANA02 V2 = new VENTANA02();//INSTANCIAMOS AL OBJETO 2
                JOptionPane.showMessageDialog(null, "BIENVENIDO: "+ NOMBRE);//MSJ DE BIENVENIDA + NOMBRE
                V2.setVisible(true);//MUESTRA LA VENTANA SIGUIENTE
                V2.setResizable(false);//INHABILITA EL CAMBIO DE TAMAÑO
                this.dispose();//OCULTA LA VENTANA PARA QUE NO SE ACUMULEN
                //setVisible(false);//OCULTA LA VENTANA ANTERIOR
            }
        }
    }
//METODO PRINCIPAL
    public static void main(String[] args) {
        VENTANA01 V1 = new VENTANA01();//OBJETO DE LA VENTANA 
        V1.setVisible(true);//SIRVE PARA MOSTRAR LA VENTANA U OBJETO
        V1.setResizable(false);//NO PERMITE MODIFICAR EL TAMAÑO DE LA VENTANA
    }
}
