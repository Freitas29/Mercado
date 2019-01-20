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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class ProdutoDAO {

    private Connection con;
    private String sql;
    private PreparedStatement st;
    private ResultSet rs;
    List<Produto> listaP = new ArrayList<>();

    public void cadastrar(Produto p) {
        con = Banco.conectar();
        try {
            sql = "insert into produto(nome,preco,quantidade)values(?,?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, p.getNome());
            st.setFloat(2, p.getPreco());
            st.setInt(3, p.getQtd());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, p.getNome()+" Cadastrado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            Banco.desconectar();
        }

    }

    public List listar() {
        con = Banco.conectar();
        try {
            sql = "SELECT nome,preco FROM produto";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setNome(rs.getString("nome"));

                p.setPreco(rs.getFloat("preco"));
                listaP.add(p);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            Banco.desconectar();
        }

        return listaP;
    }
    

    public Produto buscarProduto(int pesquisa) {
        con = Banco.conectar();
        Produto p = new Produto();
        try {
            sql = "Select nome,preco from produto where id = ?";
            st = con.prepareStatement(sql);
            st.setInt(1, pesquisa);
            rs = st.executeQuery();
            while (rs.next()) {
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
            }
            return p;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }finally{
            Banco.desconectar();
        }
    }

}
