/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Familia
 */
public class Produto {
    private String nome,cateogoria;
    private String codigo;

    public String getCateogoria() {
        return cateogoria;   
    }

    public void setCateogoria(String cateogoria) {
        this.cateogoria = cateogoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private float preco;
    private int qtd; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return cateogoria;
    }

    public void setCategoria(String cateogoria) {
        this.cateogoria = cateogoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
    
}