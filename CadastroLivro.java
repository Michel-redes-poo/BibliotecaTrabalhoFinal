/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.LivrosDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author miguel
 */
public class CadastroLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivro
     */
    public CadastroLivro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldTitulo = new javax.swing.JTextField();
        textFieldAutor = new javax.swing.JTextField();
        textFieldISBN = new javax.swing.JTextField();
        textFieldDescricao = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Retornar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LivrosS = new javax.swing.JList<>();
        ExcluirLivro = new javax.swing.JButton();
        VisualizarLivros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Título:");

        jLabel2.setText("Autor:");

        jLabel3.setText("ISBN:");

        jLabel4.setText("Descrição:");

        textFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldISBNActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Retornar.setText("Retornar");
        Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(LivrosS);

        ExcluirLivro.setText("Excluir Livro");
        ExcluirLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirLivroMouseClicked(evt);
            }
        });
        ExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirLivroActionPerformed(evt);
            }
        });

        VisualizarLivros.setText("Visualizar Livros");
        VisualizarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarLivrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(textFieldAutor)
                        .addComponent(textFieldDescricao)))
                .addGap(160, 160, 160)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(Retornar))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VisualizarLivros)
                .addGap(105, 105, 105)
                .addComponent(ExcluirLivro)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retornar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Cadastrar)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VisualizarLivros)
                    .addComponent(ExcluirLivro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldISBNActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Livro livro1 = new Livro(textFieldTitulo.getText(), textFieldAutor.getText(), textFieldISBN.getText(), textFieldDescricao.getText());
        LivrosDAO livros = new LivrosDAO();
        LivrosDAO.cadastrarLivro(livro1);
        
        textFieldTitulo.setText("");
        textFieldAutor.setText("");
        textFieldISBN.setText("");
        textFieldDescricao.setText("");
        
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornarActionPerformed
        new TelaFuncionário().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetornarActionPerformed

    private void VisualizarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarLivrosActionPerformed
        DefaultListModel listaLivros = new DefaultListModel();
        if (LivrosDAO.retornarTamanhoDaLista() > 0)  { for (int c = 0; c < LivrosDAO.retornarTamanhoDaLista(); c++){
                listaLivros.addElement(LivrosDAO.getLivros(c));
            }; 
        }else{
            listaLivros.addElement("Não existem livros cadastrados!");
        }
        LivrosS.setModel(listaLivros);
    }//GEN-LAST:event_VisualizarLivrosActionPerformed

    private void ExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirLivroActionPerformed
        ExcluirLivro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                DefaultListModel listaLivros = new DefaultListModel();
                if (LivrosDAO.retornarTamanhoDaLista() > 0)  {
                    LivrosDAO.excluirLivro(LivrosS.getSelectedIndex());
                    
                    JOptionPane.showMessageDialog(null, "Livro excluído!");
                    for (int c = 0; c < LivrosDAO.retornarTamanhoDaLista(); c++){
                    listaLivros.addElement(LivrosDAO.getLivros(c));
                    }; 
                }
                LivrosS.setModel(listaLivros);
            }            
        });
    }//GEN-LAST:event_ExcluirLivroActionPerformed

    private void ExcluirLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirLivroMouseClicked
        
    }//GEN-LAST:event_ExcluirLivroMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton ExcluirLivro;
    private javax.swing.JList<String> LivrosS;
    private javax.swing.JButton Retornar;
    private javax.swing.JButton VisualizarLivros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldISBN;
    private javax.swing.JTextField textFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
