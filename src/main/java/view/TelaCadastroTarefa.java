package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import controller.TaskController;
import model.Project;
import model.Task;
/**
 *
 * @author jefferson.silva
 */
public class TelaCadastroTarefa extends javax.swing.JDialog {
    TaskController controller;
    Project projeto;
    
    public TelaCadastroTarefa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogo = new javax.swing.JPanel();
        jLabelLogoTitulo = new javax.swing.JLabel();
        jLabel2LogoIcon = new javax.swing.JLabel();
        jPanelCorpo = new javax.swing.JPanel();
        jLabelCorpoNome = new javax.swing.JLabel();
        jTextFieldCorpoNome = new javax.swing.JTextField();
        jLabelCorpoDescricao = new javax.swing.JLabel();
        jScrollPaneCorpoDescricao = new javax.swing.JScrollPane();
        jTextAreaCorpoDescricao = new javax.swing.JTextArea();
        jLabelCorpoPrazo = new javax.swing.JLabel();
        jFormattedTextFieldCorpoPrazo = new javax.swing.JFormattedTextField();
        jLabelCorpoNotas = new javax.swing.JLabel();
        jScrollPaneCorpoNotas = new javax.swing.JScrollPane();
        jTextAreaCorpoNotas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelLogo.setBackground(new java.awt.Color(0, 153, 102));
        jPanelLogo.setForeground(new java.awt.Color(255, 255, 255));

        jLabelLogoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLogoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoTitulo.setText("Tarefa");

        jLabel2LogoIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\NetBeansProjects\\Inteface Grafica\\resources\\icons\\check\\check (4).png")); // NOI18N
        jLabel2LogoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2LogoIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogoTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2LogoIcon)
                .addGap(14, 14, 14))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2LogoIcon)
                    .addComponent(jLabelLogoTitulo))
                .addGap(16, 16, 16))
        );

        jPanelCorpo.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCorpoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCorpoNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCorpoNome.setText("Nome");

        jTextFieldCorpoNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorpoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCorpoNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCorpoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorpoNomeActionPerformed(evt);
            }
        });

        jLabelCorpoDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCorpoDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCorpoDescricao.setText("Descrição");

        jTextAreaCorpoDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaCorpoDescricao.setColumns(20);
        jTextAreaCorpoDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaCorpoDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaCorpoDescricao.setRows(5);
        jScrollPaneCorpoDescricao.setViewportView(jTextAreaCorpoDescricao);

        jLabelCorpoPrazo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCorpoPrazo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCorpoPrazo.setText("Prazo");

        jFormattedTextFieldCorpoPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldCorpoPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCorpoPrazoActionPerformed(evt);
            }
        });

        jLabelCorpoNotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCorpoNotas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCorpoNotas.setText("Notas");

        jTextAreaCorpoNotas.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaCorpoNotas.setColumns(20);
        jTextAreaCorpoNotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaCorpoNotas.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaCorpoNotas.setRows(5);
        jScrollPaneCorpoNotas.setViewportView(jTextAreaCorpoNotas);

        javax.swing.GroupLayout jPanelCorpoLayout = new javax.swing.GroupLayout(jPanelCorpo);
        jPanelCorpo.setLayout(jPanelCorpoLayout);
        jPanelCorpoLayout.setHorizontalGroup(
            jPanelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneCorpoDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jTextFieldCorpoNome)
                    .addComponent(jLabelCorpoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCorpoPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCorpoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneCorpoNotas)
                    .addGroup(jPanelCorpoLayout.createSequentialGroup()
                        .addComponent(jLabelCorpoNotas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFormattedTextFieldCorpoPrazo))
                .addContainerGap())
        );
        jPanelCorpoLayout.setVerticalGroup(
            jPanelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCorpoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCorpoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCorpoDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneCorpoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCorpoPrazo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCorpoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCorpoNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneCorpoNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCorpoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorpoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorpoNomeActionPerformed

    private void jFormattedTextFieldCorpoPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCorpoPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCorpoPrazoActionPerformed
    
    //Atualiza e mostra as tarefas salvas por projetos
    private void jLabel2LogoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2LogoIconMouseClicked
        
      try {
    	  
    	  if (jTextFieldCorpoNome.getText().isEmpty() || 
    			  jFormattedTextFieldCorpoPrazo.getText().isEmpty()) {
    		  
    		  JOptionPane.showMessageDialog(rootPane, "Tarefa não foi "
    		  		+ "salva, pois existem campos obrigatórios a serem preenchidos!");
			
		} else {
			Task task = new Task();
	          //task.setIdProject(projeto.getId()); //Setando a chave estrangeira
	          
	          task.setIdProject(projeto.getId());
	          task.setName(jTextFieldCorpoNome.getText());
	          task.setDescription(jTextAreaCorpoDescricao.getText());
	          task.setNotes(jTextAreaCorpoNotas.getText());
	          task.setCompleted(false);
	            
	            //Conversão de data
	            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	            Date data = null;
	            data = dataFormatada.parse(jFormattedTextFieldCorpoPrazo.getText());
	            task.setDeadline(data);
	            
	            controller.saveTask(task);
	            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
	            
	            this.dispose();
		}
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());   
        }

    }//GEN-LAST:event_jLabel2LogoIconMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroTarefa dialog = new TelaCadastroTarefa(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jFormattedTextFieldCorpoPrazo;
    private javax.swing.JLabel jLabel2LogoIcon;
    private javax.swing.JLabel jLabelCorpoDescricao;
    private javax.swing.JLabel jLabelCorpoNome;
    private javax.swing.JLabel jLabelCorpoNotas;
    private javax.swing.JLabel jLabelCorpoPrazo;
    private javax.swing.JLabel jLabelLogoTitulo;
    private javax.swing.JPanel jPanelCorpo;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JScrollPane jScrollPaneCorpoDescricao;
    private javax.swing.JScrollPane jScrollPaneCorpoNotas;
    private javax.swing.JTextArea jTextAreaCorpoDescricao;
    private javax.swing.JTextArea jTextAreaCorpoNotas;
    private javax.swing.JTextField jTextFieldCorpoNome;
    // End of variables declaration//GEN-END:variables

    public Project getProjeto() {
        return projeto;
    }

    public void setProjeto(Project projeto) {
        this.projeto = projeto;
    }    
}
