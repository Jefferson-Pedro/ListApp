/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProjectController;
import javax.swing.JOptionPane;
import model.Project;

/**
 *
 * @author jefferson.silva
 */
public class TelaCadastroProjeto extends javax.swing.JDialog {

    ProjectController controller;
    
    public TelaCadastroProjeto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new ProjectController();
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
        jPanelLogo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelLogoIcon = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jCadastroLabelNome = new javax.swing.JLabel();
        jCadastroTextFieldNome = new javax.swing.JTextField();
        jCadastroLabelDescricao = new javax.swing.JLabel();
        jCadastroScrollPaneDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelLogo.setBackground(new java.awt.Color(0, 153, 102));

        jLabelLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setText("Projeto");

        jLabelLogoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\GitHub\\ListApp\\src\\main\\resources\\check.png")); // NOI18N
        jLabelLogoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogoIcon)
                .addGap(15, 15, 15))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addGroup(jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogoIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCadastro.setForeground(new java.awt.Color(0, 0, 0));

        jCadastroLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCadastroLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jCadastroLabelNome.setText("Nome");

        jCadastroTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jCadastroTextFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCadastroTextFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        jCadastroTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroTextFieldNomeActionPerformed(evt);
            }
        });

        jCadastroLabelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCadastroLabelDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jCadastroLabelDescricao.setText("Descrição");

        jTextAreaDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDescricao.setRows(5);
        jCadastroScrollPaneDescricao.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCadastroTextFieldNome)
                    .addComponent(jCadastroScrollPaneDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jCadastroLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCadastroLabelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jCadastroLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCadastroTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCadastroLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCadastroScrollPaneDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastroTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroTextFieldNomeActionPerformed

    private void jLabelLogoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoIconMouseClicked
        
       //Event: Dispara o evento ao clicar no icone "V" da TelaCadastroProjeto
    	
    	try {
    		Project projeto = new Project();
        	
        	//Pega o texto que está dentro do componente e seta no atributo:  
        	projeto.setName(jCadastroTextFieldNome.getText()); //"name" da classe Project
        	projeto.setDescription(jTextAreaDescricao.getText()); //e "description" a classe Project
        	
        	//Salva dentro do banco de dados
        	controller.saveProject(projeto);
        	JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso!");
        	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, e.getMessage());
			
		}finally {
			//Fecha a janela
        	this.dispose();
		}
    }//GEN-LAST:event_jLabelLogoIconMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroProjeto dialog = new TelaCadastroProjeto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCadastroLabelDescricao;
    private javax.swing.JLabel jCadastroLabelNome;
    private javax.swing.JScrollPane jCadastroScrollPaneDescricao;
    private javax.swing.JTextField jCadastroTextFieldNome;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogoIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JTextArea jTextAreaDescricao;
    // End of variables declaration//GEN-END:variables
}
