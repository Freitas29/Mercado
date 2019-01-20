/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import banco.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author aadel
 */
public class FuncionarioDAO {
    private String sql;
    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;
    private String resultado;
    public void cadastrar(Funcionario func){
        try{
            con = Banco.conectar();
            sql = "insert into funcionario(nome,cargo)values(?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, func.getNome());
            st.setString(2, func.getCargo());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar: "+e);
        }finally{
            Banco.desconectar();
        }
    }
    
    public boolean realizarLogin(Funcionario func){
        try{
            con = Banco.conectar();
            sql = "select nome,senha from funcionario where nome = ? and senha = ?";
            st = con.prepareStatement(sql);
            st.setString(1, func.getNome());
            st.setString(2, func.getSenha());
            rs = st.executeQuery();
            return rs.next();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar login: "+e);
            return false;
        }finally{
            Banco.desconectar();
        }
            
    }
}
