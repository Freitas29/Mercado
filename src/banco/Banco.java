/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aadel
 */
public class Banco {
    final static private String url = "jdbc:mysql://localhost:3306/bancoJava";
    final static private String user = "root";
    final static private String password = "";
    private static Connection con;
    
    
    
    public static Connection conectar(){
        try{
            con = DriverManager.getConnection(url, user, password);
            return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar: "+e);
            return null;
        }
    }
    
    public static void desconectar(){
        try{
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel fechar o banco: "+e);
        }
    }
    
    
}
