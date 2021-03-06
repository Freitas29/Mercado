/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;
import models.Produto;
import models.ProdutoDAO;

/**
 *
 * @author aadel
 */
public class InserirProduto extends javax.swing.JFrame {

    /**
     * Creates new form InserirProduto
     */
    public InserirProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        pnlPesquisar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnlCadastrar1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlLoja1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCadastrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(22, 33, 53));
        jPanel6.setPreferredSize(new java.awt.Dimension(220, 710));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPesquisar.setBackground(new java.awt.Color(22, 33, 53));
        pnlPesquisar.setPreferredSize(new java.awt.Dimension(220, 80));
        pnlPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPesquisarMouseClicked(evt);
            }
        });
        pnlPesquisar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Pesquisar");
        pnlPesquisar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/3-search-cat_icon-icons.com_76679.png"))); // NOI18N
        pnlPesquisar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 80, 68));

        jPanel6.add(pnlPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        pnlCadastrar1.setBackground(new java.awt.Color(39, 55, 80));
        pnlCadastrar1.setPreferredSize(new java.awt.Dimension(220, 80));
        pnlCadastrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCadastrar1MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cadastrar");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N

        javax.swing.GroupLayout pnlCadastrar1Layout = new javax.swing.GroupLayout(pnlCadastrar1);
        pnlCadastrar1.setLayout(pnlCadastrar1Layout);
        pnlCadastrar1Layout.setHorizontalGroup(
            pnlCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(21, 21, 21))
        );
        pnlCadastrar1Layout.setVerticalGroup(
            pnlCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(21, 21, 21))
        );

        jPanel6.add(pnlCadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLoja1.setBackground(new java.awt.Color(22, 33, 53));
        pnlLoja1.setPreferredSize(new java.awt.Dimension(220, 80));
        pnlLoja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLoja1MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Loja");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/shoppaymentorderbuy-20_icon-icons.com_73877.png"))); // NOI18N

        javax.swing.GroupLayout pnlLoja1Layout = new javax.swing.GroupLayout(pnlLoja1);
        pnlLoja1.setLayout(pnlLoja1Layout);
        pnlLoja1Layout.setHorizontalGroup(
            pnlLoja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoja1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(36, 36, 36)
                .addComponent(jLabel18)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlLoja1Layout.setVerticalGroup(
            pnlLoja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoja1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlLoja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(20, 20, 20))
        );

        jPanel6.add(pnlLoja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jPanel7.setBackground(new java.awt.Color(22, 33, 53));
        jPanel7.setPreferredSize(new java.awt.Dimension(220, 80));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Editar");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 60));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/draw_line_icon-icons.com_51076 (1).png"))); // NOI18N
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 63, 68));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(35, 68, 50));
        jPanel3.setLayout(null);

        lblCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(240, 240, 240));
        lblCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrar.setText("Cadastrar");
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });
        jPanel3.add(lblCadastrar);
        lblCadastrar.setBounds(320, 587, 140, 50);

        jLabel4.setBackground(new java.awt.Color(255, 57, 127));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Imagens/button (1).png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(170, 520, 320, 130);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 57, 127));
        jLabel1.setText("Nome do Produto");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(80, 180, 140, 22);

        txtProduto.setForeground(new java.awt.Color(255, 57, 127));
        txtProduto.setBorder(null);
        jPanel3.add(txtProduto);
        txtProduto.setBounds(80, 210, 260, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(80, 240, 260, 10);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 57, 127));
        jLabel2.setText("Preço do Produto");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(80, 300, 140, 22);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(80, 360, 260, 10);

        txtPreco.setForeground(new java.awt.Color(255, 57, 127));
        txtPreco.setBorder(null);
        txtPreco.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel3.add(txtPreco);
        txtPreco.setBounds(80, 330, 260, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 57, 127));
        jLabel3.setText("Quantidade do Produto");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(80, 420, 186, 22);

        txtQtd.setForeground(new java.awt.Color(255, 57, 127));
        txtQtd.setBorder(null);
        jPanel3.add(txtQtd);
        txtQtd.setBounds(80, 450, 260, 30);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(80, 480, 260, 10);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 57, 127));
        jLabel11.setText("Nome do Produto");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(80, 180, 140, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 57, 127));
        jLabel12.setText("Código Produto");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(80, 70, 125, 22);

        txtCodigo.setForeground(new java.awt.Color(255, 57, 127));
        txtCodigo.setBorder(null);
        jPanel3.add(txtCodigo);
        txtCodigo.setBounds(80, 100, 260, 30);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(80, 130, 260, 10);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(220, 0, 790, 710);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        if ("".equals(txtCodigo.getText().trim()) || "".equals(txtPreco.getText().trim()) || "".equals(txtProduto.getText().trim()) || "".equals(txtQtd.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            try {

                Produto p = new Produto();
                ProdutoDAO dao = new ProdutoDAO();
                p.setCodigo(txtCodigo.getText());
                boolean produtoExiste = dao.verificaProduto(p.getCodigo());
                if (produtoExiste == true) {
                    JOptionPane.showMessageDialog(null, "Produto já cadastrado");
                } else {
                    p.setNome(txtProduto.getText());
                    p.setPreco(Float.parseFloat(txtPreco.getText()));
                    p.setQtd(Integer.parseInt(txtQtd.getText()));
                    boolean resultado = dao.cadastrar(p);
                    if (resultado == true) {
                        txtCodigo.setText("");
                        txtPreco.setText("");
                        txtProduto.setText("");
                        txtQtd.setText("");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Campo preenchido com valor errado");
            }
        }
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void pnlPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPesquisarMouseClicked
        this.setVisible(false);
        new Pesquisar().setVisible(true);
    }//GEN-LAST:event_pnlPesquisarMouseClicked

    private void pnlCadastrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCadastrar1MouseClicked
        this.setVisible(false);
        new InserirProduto().setVisible(true);
    }//GEN-LAST:event_pnlCadastrar1MouseClicked

    private void pnlLoja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoja1MouseClicked
        this.setVisible(false);
        new Loja().setVisible(true);
    }//GEN-LAST:event_pnlLoja1MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        this.setVisible(false);
        new Editar().setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

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
            java.util.logging.Logger.getLogger(InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JPanel pnlCadastrar1;
    private javax.swing.JPanel pnlLoja1;
    private javax.swing.JPanel pnlPesquisar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
