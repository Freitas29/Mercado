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

    public boolean cadastrar(Produto p) {
        con = Banco.conectar();
        try {
            sql = "insert into produto(codigo,nome,preco,quatidade)values(?,?,?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, p.getCodigo());
            st.setString(2, p.getNome());
            st.setFloat(3, p.getPreco());
            st.setInt(4, p.getQtd());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, p.getNome() + " Cadastrado");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no banco: " + e.getMessage());
            return false;
        } finally {
            Banco.desconectar();
        }
    }

    public boolean deletar(String produto) {
        con = Banco.conectar();
        try {
            sql = "delete from produto where codigo = ?";
            st = con.prepareStatement(sql);
            st.setString(1, produto);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no banco: " + e.getMessage());
            return false;
        } finally {
            Banco.desconectar();
        }
    }

    public List listar() {
        con = Banco.conectar();
        try {
            sql = "SELECT nome,preco,quatidade,codigo FROM produto";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setNome(rs.getString("nome"));
                p.setQtd(rs.getInt("quatidade"));
                p.setCodigo(rs.getString("codigo"));
                p.setPreco(rs.getFloat("preco"));
                listaP.add(p);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Banco.desconectar();
        }

        return listaP;
    }

    public Produto buscarProduto(String pesquisa) {
        con = Banco.conectar();
        Produto p = new Produto();
        try {
            sql = "Select nome,preco,quatidade,codigo from produto where codigo = ?";
            st = con.prepareStatement(sql);
            st.setString(1, pesquisa);
            rs = st.executeQuery();
            while (rs.next()) {
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                p.setQtd(rs.getInt("quatidade"));
                p.setCodigo(rs.getString("codigo"));
            }
            return p;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } finally {
            Banco.desconectar();
        }
    }

    public boolean verificaProduto(String pesquisa) {
        con = Banco.conectar();
        Produto p = new Produto();
        try {
            sql = "select nome,codigo from produto where codigo = ?";
            st = con.prepareStatement(sql);
            st.setString(1, pesquisa);
            ResultSet rs = st.executeQuery();
            return rs.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no babco " + e);
            return false;
        } finally {
            Banco.desconectar();
        }
    }

    public boolean retiraEstoque(String codigo, int qtd) {
        con = Banco.conectar();
        try {
            sql = "update produto set quatidade = quatidade-? where codigo = ?";
            st = con.prepareStatement(sql);
            st.setInt(1, qtd);
            st.setString(2, codigo);
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no banco" + e);
            return false;
        } finally {
            Banco.desconectar();
        }
    }

    public boolean atualiza(Produto p) {
        con = Banco.conectar();
        try {
            sql = "update produto set nome = ?, preco = ?,quatidade = ?,codigo = ? where codigo = ?";
            st = con.prepareStatement(sql);
            st.setString(1, p.getNome());
            st.setFloat(2, p.getPreco());
            st.setInt(3, p.getQtd());
            st.setString(4, p.getCodigo());
            st.setString(5, p.getCodigo());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro no banco" + e);
             return false;
        }finally{
            Banco.desconectar();
        }
    }
    
    public List pesquisa(Produto p){
        con = Banco.conectar();
        try{
            sql = "select nome,quatidade,preco,codigo from produto where nome like ?";
            st = con.prepareStatement(sql);
            st.setString(1, p.getNome()+'%');
            rs = st.executeQuery();
             while (rs.next()) {
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                p.setQtd(rs.getInt("quatidade"));
                p.setCodigo(rs.getString("codigo"));
                listaP.add(p);
            }
            return listaP;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro no banco"+e);
            return null;
        }
    }

}
