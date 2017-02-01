/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.conexion;

//import com.app.utils.StringEncrypt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ContabilidadPC
 */
public class ConexionSQL {

    //static String clave = "yU7eywfXILoZjtaD";
    static String clave = "";
    static Statement ST = null;
    static Connection cn = null;
    static String user = "";
    static String url = "";
    static String db = "";

    public static Statement conexion() throws SQLException {

        try {

            try {
                // CLASE USADA PARA EL DRIVER
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            // RUTA DE LA BASE DE DATOS
            //  149.56.93.6
              String url = "jdbc:mysql://149.56.93.6:3306/smsrenta_actualizada";
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=SadRBM";
            // CONECCION A LA BASE DE DATOS
            cn = DriverManager.getConnection(url, "root", clave);
            // TRAE LOS DATOS
            Statement st = cn.createStatement();

            ST = st;

            System.out.print("-------------------consulta BD:" + ST);

        } catch (ClassNotFoundException ex) {
            System.out.print("Error en el Driver");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
//		finally {
//			cerrarConexion();
//		   }
        return ST;

    }
    public static Connection CerrarConexion() throws SQLException {

        try {
            if (cn != null) {
                cn.close();
                cn = null;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return null;

    }

    public static void main(String arg[]) throws SQLException {
        conexion();
    }

//    public static Statement conexion() {
//
////        LeerArchivoTxt();
//
//        try {
//
//            try {
//                // CLASE USADA PARA EL DRIVER
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//            } catch (InstantiationException ex) {
//                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            // RUTA DE LA BASE DE DATOS
//            //  149.56.93.6
//            //  String url = "jdbc:mysql://149.56.93.6:3306/smsrenta_actualizada";
//            url = "jdbc:sqlserver://" + url + ";databaseName=" + db;
//            // CONECCION A LA BASE DE DATOS
//            cn = DriverManager.getConnection(url, user, clave);
//            // TRAE LOS DATOS
//            Statement st = cn.createStatement();
//
//            ST = st;
//
//            System.out.print("-------------------consulta BD:" + ST);
//
//        } catch (ClassNotFoundException ex) {
//            System.out.print("Error en el Driver");
//        } catch (SQLException e) {
//            System.out.print(e.getMessage());
//        }
////		finally {
////			cerrarConexion();
////		   }
//        return ST;
//
//    }

//    public static void LeerArchivoTxt() {
//        //Creamos un String que va a contener todo el texto del archivo
//        String texto = "";
//
//        String key = "92AE31A79FEEB2A3"; //llave
//        String iv = "0123456789ABCDEF"; // vector de inicialización
//
//        try {
////Creamos un archivo FileReader que obtiene lo que tenga el archivo
//            FileReader lector = new FileReader("C:\\RRHH\\Conexion.txt");
//
////El contenido de lector se guarda en un BufferedReader
//            BufferedReader contenido = new BufferedReader(lector);
//
////Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
//            while ((texto = contenido.readLine()) != null) {
//                String[] Con = texto.split(":");
//                if (Con[0].equals("url")) {
//                    url = Con[1];
//                    url = StringEncrypt.decrypt(key, iv,url );
//                }
//                if (Con[0].equals("user")) {
//                    user = Con[1];
//                    user = StringEncrypt.decrypt(key, iv,user );
//                }
//                if (Con[0].equals("password")) {
//                    clave = Con[1];
//                    clave = StringEncrypt.decrypt(key, iv,clave );
//                }
//
//                if (Con[0].equals("db")) {
//                    db = Con[1];
//                    db = StringEncrypt.decrypt(key, iv,db );
//                }
//
//                System.out.println("url " + url + " user: " + user + " clave " + clave);
//            }
//        } //Si se causa un error al leer cae aqui
//        catch (Exception e) {
//            System.out.println("Error al leer");
//        }
//    }

//    public static void ActualizarConexion(String url, String user, String password, String nameDb) {
//
//        System.out.println("----" + url + user + password + nameDb);
//        FileWriter fichero = null;
//        PrintWriter pw = null;
//        try {
//            fichero = new FileWriter("C:\\RRHH\\Conexion.txt");
//            pw = new PrintWriter(fichero);
//
//            pw.println("url:" + url);
//            pw.println("user:" + user);
//            pw.println("password:" + password);
//            pw.println("db:" + nameDb);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                // Nuevamente aprovechamos el finally para 
//                // asegurarnos que se cierra el fichero.
//                if (null != fichero) {
//                    fichero.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//    }

}
