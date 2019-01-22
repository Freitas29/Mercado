/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Familia
 */
public class ModeloTabela extends AbstractTableModel {

    List<Produto> lista = new ArrayList<>();
    String[] colunas = {"CODIGO", "NOME", "PREÇO", "QUANTIDADE"};

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return lista.get(linha).getCodigo();
            case 1:
                return lista.get(linha).getNome();
            case 2:
                return lista.get(linha).getPreco();
            case 3:
                return lista.get(linha).getQtd();
            default:
                return null;
        }
    }

    public void adicionarLinha(List lista) {
        this.lista = lista;

        this.fireTableDataChanged();
    }

    public void atualizar() {
        List listaR = lista;
        listaR.clear();
        adicionarLinha(listaR);
    }

}
