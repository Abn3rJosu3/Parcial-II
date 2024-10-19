package PARCIAL02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CONEXION {

    private static final String URL = "jdbc:mysql://localhost:3306/dbjugueteriaaby";
    private static final String USER = "root";
    private static final String PASSWORD = "Abner.1991";
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }// fin conectar()

     public static void añadirproducto(String codigo,String nombre, double precio, int cantidad, String fecha) {
        String query = "INSERT INTO producto (codigoproducto, nombreproducto, preciounitario, cantidadproducto, fechavencimiento) VALUES (?,?, ?, ?, ?)";
        try (Connection con = CONEXION.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, codigo);
            pst.setString(2, nombre);
            pst.setDouble(3, precio); 
            pst.setInt(4, cantidad);
            pst.setDate(5, java.sql.Date.valueOf(fecha));
            pst.executeUpdate();
            System.out.println("PRODUCTO AÑADIDO CORRECTAMENTE");
        } catch (SQLException e) {
    }
    
}// fin insertarProducto()

    public static void mostrarproductos() {
        String query = "select * from producto;";
        try (Connection con = CONEXION.conectar(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(query)) {
            boolean hayResultados = false;
            while (rs.next()) {
                hayResultados = true;
                System.out.println("Código: " + rs.getString("codigoproducto"));
                System.out.println("Nombre: " + rs.getString("nombreproducto"));
                System.out.println("Precio: " + rs.getDouble("preciounitario"));
                System.out.println("Cantidad: " + rs.getInt("cantidadproducto"));
                System.out.println("Fecha de Vencimiento: " + rs.getDate("fechavencimiento"));
                System.out.println("");
            }
            if (!hayResultados) {
                System.out.println("LA BASE DE DATOS ESTA VACIA");
            }//fin if

        } catch (SQLException e) {

        }//fin catch
    }// fin listarProductos()
    
    public static void buscarProducto() {
        String codigo;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese el código de producto a buscar: ");
        codigo= entrada.nextLine(); 
        try {
            Connection con = CONEXION.conectar();
            ps = con.prepareStatement("SELECT * FROM producto WHERE codigoproducto=?");
            ps.setString(1, codigo);

                    
            boolean hayResultados = false;
            
            rs = ps.executeQuery();
            if (rs.next()) {
                hayResultados = true; 
                System.out.println("Código: " + rs.getString("codigoproducto"));
                System.out.println("Nombre: " + rs.getString("nombreproducto"));
                System.out.println("Precio: " + rs.getDouble("preciounitario"));
                System.out.println("Cantidad: " + rs.getInt("cantidadproducto"));
                System.out.println("Fecha de Vencimiento: " + rs.getDate("fechavencimiento"));     
                System.out.println("");
            }
            if (!hayResultados) {
                System.out.println("EL CODIGO INGRESADO NO EXISTE EN LA BASE DE DATOS");
            }//fin if

        } catch (SQLException e) {
        
    }//fin catch
}// fin listarProductos()    

    public static void actualizarProducto() {
        String codigoProducto, nombre, fecha; 
        double precio;
        int cantidad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE CODIGO DEL PRODUCTO A MODIFICAR");
        codigoProducto = entrada.nextLine();
        System.out.println("INGRESE NUEVO NOMBRE");
        nombre = entrada.nextLine();
        System.out.println("INGRESE NUEVO PRECIO");
        precio = entrada.nextDouble();
        System.out.println("INGRESE NUEVA CANTIDAD");
        cantidad = entrada.nextInt();
        System.out.println("INGRESE NUEVA FECHA");
        fecha = entrada.next();
        entrada.nextLine();
        String query = "UPDATE producto SET nombreproducto = ?, preciounitario = ?, cantidadproducto = ?, fechavencimiento = ? WHERE codigoproducto = ?";
        try (Connection con = CONEXION.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, nombre);
            pst.setDouble(2, precio);
             pst.setInt(3, cantidad);
             pst.setDate(4, java.sql.Date.valueOf(fecha));
            pst.setString(5, codigoProducto);
            pst.executeUpdate();
            System.out.println("PRODUCTO ACTUALIZADO CORRECTAMENTE");
        } catch (SQLException e) {
        }
    }// fin actualizarProducto

    public static void eliminarproducto() {
        String codigoProducto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL CODIGO DEL PRODUCTO A ELIMINAR ");
        codigoProducto = entrada.nextLine();
        String query = "DELETE FROM producto WHERE codigoproducto = ?";
        try (Connection con = CONEXION.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, codigoProducto);
            pst.executeUpdate();
            System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }// fin eliminarProducto

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int entrada2, CNP;
        String NP,CP,FP;
        double PP;
        do {
            System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦MENU PRINCIPAL♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
            System.out.println("1••••••••••••INGRESAR PRODUCTO");
            System.out.println("2••••••••••••MOSTRAR PRODUCTO");
            System.out.println("3••••••••••••BUSCAR PRODUCTO");
            System.out.println("4••••••••••••MODIFICAR PRODUCTO");
            System.out.println("5••••••••••••ELIMINAR PRODUCTO");
            System.out.println("6••••••••••••SALIR DEL MENU PRINCIPAL");
            System.out.println("ELIGA UNA OPCION\n");
            entrada2 = entrada.nextInt();
            switch (entrada2) {
                case 1:
                    System.out.println("INGRESE CODIGO DEL PRODUCTO: ");
                entrada.nextLine();
                CP = entrada.nextLine();
                System.out.println("INGRESE EL NOMBRE DEL PRODUCTO: ");
                NP = entrada.nextLine();
                System.out.println("INGRESE EL PRECIO DEL PRODUCTO: ");
                PP = entrada.nextDouble();
                System.out.println("INGRESE LA CANTIDAD DEL PRODUCTO: ");
                CNP = entrada.nextInt();
                System.out.println("INGRESE FECHA DE VENCIMIENTO: ");
                entrada.nextLine();
                FP = entrada.nextLine();            
                añadirproducto(CP, NP, PP, CNP,FP); 
                    break;
                case 2:
                    mostrarproductos();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    actualizarProducto();
                    break;
                case 5:
                    eliminarproducto();

            }
        } while (entrada2 != 6);
    }
}// fin main
