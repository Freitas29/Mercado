/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.ModeloTabela;
import models.Produto;
import models.ProdutoDAO;

/**
 *
 * @author aadel
 */
public class Pesquisar extends javax.swing.JFrame {

    ModeloTabela modeloTabela = new ModeloTabela();

    /**
     * Creates new form Pesquisar
     */
    public Pesquisar() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabelaMercado.setModel(modeloTabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMercado = new javax.swing.JTable();
        txtProduto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        pnlPesquisar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlLoja = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1010, 710));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaMercado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMercado);
        if (tabelaMercado.getColumnModel().getColumnCount() > 0) {
            tabelaMercado.getColumnModel().getColumn(0).setResizable(false);
            tabelaMercado.getColumnModel().getColumn(1).setResizable(false);
            tabelaMercado.getColumnModel().getColumn(2).setResizable(false);
            tabelaMercado.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 620));

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdutoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 800, 710));

        jPanel3.setBackground(new java.awt.Color(22, 33, 53));
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 710));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPesquisar.setBackground(new java.awt.Color(39, 55, 80));
        pnlPesquisar.setPreferredSize(new java.awt.Dimension(220, 80));
        pnlPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPesquisarMouseClicked(evt);
            }
        });
        pnlPesquisar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Pesquisar");
        pnlPesquisar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/3-search-cat_icon-icons.com_76679.png"))); // NOI18N
        pnlPesquisar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 80, 68));

        jPanel3.add(pnlPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        pnlCadastrar.setBackground(new java.awt.Color(22, 33, 53));
        pnlCadastrar.setPreferredSize(new java.awt.Dimension(220, 80));
        pnlCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCadastrarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N

        javax.swing.GroupLayout pnlCadastrarLayout = new javax.swing.GroupLayout(pnlCadastrar);
        pnlCadastrar.setLayout(pnlCadastrarLayout);
        pnlCadastrarLayout.setHorizontalGroup(
            pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        pnlCadastrarLayout.setVerticalGroup(
            pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );

        jPanel3.add(pnlCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLoja.setBackground(new java.awt.Color(22, 33, 53));
        pnlLoja.setPreferredSize(new java.awt.Dimension(220, 80));
        pnlLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLojaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Loja");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/shoppaymentorderbuy-20_icon-icons.com_73877.png"))); // NOI18N

        javax.swing.GroupLayout pnlLojaLayout = new javax.swing.GroupLayout(pnlLoja);
        pnlLoja.setLayout(pnlLojaLayout);
        pnlLojaLayout.setHorizontalGroup(
            pnlLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLojaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlLojaLayout.setVerticalGroup(
            pnlLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLojaLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20))
        );

        jPanel3.add(pnlLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jPanel4.setBackground(new java.awt.Color(22, 33, 53));
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 80));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Editar");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/draw_line_icon-icons.com_51076 (1).png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 63, 68));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked


    }//GEN-LAST:event_formMouseClicked

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyTyped
        ProdutoDAO dao = new ProdutoDAO();
        Produto p = new Produto();
        p.setNome(txtProduto.getText());
        List<Produto> lista = new ArrayList<>();
        lista = dao.pesquisa(p);
        modeloTabela.atualizar();
        modeloTabela.adicionarLinha(lista);

    }//GEN-LAST:event_txtProdutoKeyTyped

    private void pnlPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPesquisarMouseClicked

    }//GEN-LAST:event_pnlPesquisarMouseClicked

    private void pnlCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCadastrarMouseClicked
        this.setVisible(false);
        new InserirProduto().setVisible(true);
    }//GEN-LAST:event_pnlCadastrarMouseClicked

    private void pnlLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLojaMouseClicked
        this.setVisible(false);
        new Loja().setVisible(true);
    }//GEN-LAST:event_pnlLojaMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        this.setVisible(false);
        new Editar().setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCadastrar;
    private javax.swing.JPanel pnlLoja;
    private javax.swing.JPanel pnlPesquisar;
    private javax.swing.JTable tabelaMercado;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
