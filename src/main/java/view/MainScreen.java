package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ButtonColumnCellRederer;
import util.DeadlineColumnCellRenderer;
import util.TaskTableModel;

/**
 *
 * @author jefferson pedro
 */
public class MainScreen extends javax.swing.JFrame {

	ProjectController projectController;
	TaskController taskController;

	DefaultListModel projectsModel; // Carrega os projetos na lista
	TaskTableModel taskModel;       //Carrega as tarefas na lista

	public MainScreen() {
		initComponents();
		initDataController();
		initComponentsModel();
		decorateTableTasks();
		
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanetasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPainelLogo = new javax.swing.JPanel();
        jLabelLogoMainApp = new javax.swing.JLabel();
        jLabelLogoLemaApp = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsLogo = new javax.swing.JLabel();
        jLabelProjectsIcon = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTittle = new javax.swing.JLabel();
        jLabelTasksIcon = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListMessage1 = new javax.swing.JLabel();
        jLabelEmptyListMessage2 = new javax.swing.JLabel();

        jTableTasks.setBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(51, 255, 51));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowGrid(true);
        jTableTasks.setShowVerticalLines(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPanetasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));

        jPainelLogo.setBackground(new java.awt.Color(0, 102, 51));

        jLabelLogoMainApp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogoMainApp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoMainApp.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\GitHub\\ListApp\\src\\main\\resources\\tick.png")); // NOI18N
        jLabelLogoMainApp.setText(" List App");

        jLabelLogoLemaApp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelLogoLemaApp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoLemaApp.setText("Anote tudo, não esqueça nada");

        javax.swing.GroupLayout jPainelLogoLayout = new javax.swing.GroupLayout(jPainelLogo);
        jPainelLogo.setLayout(jPainelLogoLayout);
        jPainelLogoLayout.setHorizontalGroup(
            jPainelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogoMainApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLogoLemaApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPainelLogoLayout.setVerticalGroup(
            jPainelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLogoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelLogoMainApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogoLemaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectsLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectsLogo.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectsLogo.setText("Projetos");

        jLabelProjectsIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\GitHub\\ListApp\\src\\main\\resources\\add.png")); // NOI18N
        jLabelProjectsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelProjectsIcon)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelProjectsLogo)
                    .addComponent(jLabelProjectsIcon))
                .addGap(16, 16, 16))
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTasksTittle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTasksTittle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTasksTittle.setText("Tarefas");
        jLabelTasksTittle.setMaximumSize(new java.awt.Dimension(70, 25));
        jLabelTasksTittle.setMinimumSize(new java.awt.Dimension(70, 25));

        jLabelTasksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelTasksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTasksIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTasksIcon)
                .addGap(14, 14, 14))
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTasksTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTasksIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jPanelProjectList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setBackground(new java.awt.Color(255, 255, 255));
        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 0, 0));
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\GitHub\\ListApp\\src\\main\\resources\\listEmpty.png")); // NOI18N

        jLabelEmptyListMessage1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmptyListMessage1.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListMessage1.setText("Nenhuma tarefa por aqui :D");

        jLabelEmptyListMessage2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmptyListMessage2.setForeground(new java.awt.Color(153, 153, 153));
        jLabelEmptyListMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListMessage2.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelEmptyListMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelEmptyListMessage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabelEmptyListIcon)
                .addGap(39, 39, 39)
                .addComponent(jLabelEmptyListMessage1)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListMessage2)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPainelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Retorna a lista de tarefas com base no Projeto clicado
    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
       
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_jListProjectsMouseClicked

	// Cria uma nova tela de cadastro para Projetos
	private void jLabelProjectsIconMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabelProjectsIconMouseClicked
		TelaCadastroProjeto tcp = new TelaCadastroProjeto(this, rootPaneCheckingEnabled);
		tcp.setVisible(true);

		// Metodo disparado quando a janela da TelaCadastroProjeto for fechada,
		// p/ atualizar lista de projeto
		tcp.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				loadProjects();
			}
		});

	}
	// Cria uma nova tela de cadastro para Tarefas
	private void jLabelTasksIconMouseClicked(java.awt.event.MouseEvent evt) {
		
		TelaCadastroTarefa tct = new TelaCadastroTarefa(this, rootPaneCheckingEnabled);
                
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                tct.setProjeto(project);
                
                tct.setVisible(true);// torna tela visivel para o usuario
                
                tct.addWindowListener(new WindowAdapter(){
                    public void windowClosed(WindowEvent e){
                        int projectIndex = jListProjects.getSelectedIndex();
                        Project project = (Project) projectsModel.get(projectIndex);
                        
                        loadTasks(project.getId());
                    }
                });
	}

	// Pega linha e coluna a partir de um ponto, onde houve um click
	private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableTasksMouseClicked
		int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
		int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
                
                 Task task = taskModel.getTasks().get(rowIndex);
		switch (columnIndex) {
		//Coluna onde existe a tag concluída, e faz uma atualização no BD
		case 3:
                    taskController.updateTask(task);
                    break;
                case 4:
                    break;
                //Coluna de excluir tarefas    
                case 5:
                    taskController.removeTaskById(task.getId());
                    taskModel.getTasks().remove(task);
                    
                    int projectIndex = jListProjects.getSelectedIndex();
                    Project project = (Project) projectsModel.get(projectIndex);
                    loadTasks(project.getId());
                    break;

		default:
			break;
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Java swing".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainScreen().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListMessage1;
    private javax.swing.JLabel jLabelEmptyListMessage2;
    private javax.swing.JLabel jLabelLogoLemaApp;
    private javax.swing.JLabel jLabelLogoMainApp;
    private javax.swing.JLabel jLabelProjectsIcon;
    private javax.swing.JLabel jLabelProjectsLogo;
    private javax.swing.JLabel jLabelTasksIcon;
    private javax.swing.JLabel jLabelTasksTittle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPainelLogo;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JScrollPane jScrollPanetasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

	public void decorateTableTasks() {
		// Customizando o header da table de tarefas
		jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
		jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
		jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
		
		//Rederiza a cor de uma célula
		jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCellRenderer());
		
		//Seta a coluna de edit que irá ser renderizada com um botão
		jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRederer("/edit.png"));
		
		//Seta a coluna de delete que irá ser renderizada com um botão
		jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRederer("/delete.png"));
		
		// Permite que haja ordenadores alfabeticos nas colunas das tabelas
		jTableTasks.setAutoCreateRowSorter(true);
	}

	// Inicia as os Controladores
	public void initDataController() {
		projectController = new ProjectController();
		taskController = new TaskController();
	}

	// Inicia a classe responsavel por carregar os projetos e tarefas na grid
	public void initComponentsModel() {
		projectsModel = new DefaultListModel();
		loadProjects();

		taskModel = new TaskTableModel();
		jTableTasks.setModel(taskModel);
		                
            if (!projectsModel.isEmpty()) {
                jListProjects.setSelectedIndex(0);
                Project project = (Project) projectsModel.get(0);
                loadTasks(project.getId());
            }
	}
        
        private void showJTableTasks(boolean hasTasks){
            if (hasTasks) {
                //Existem tarefas
                if (jPanelEmptyList.isVisible()) {
                    jPanelEmptyList.setVisible(false);
                    jPanel5.remove(jPanelEmptyList);
                }
                
                jPanel5.add(jScrollPanetasks);
                jScrollPanetasks.setVisible(true);
                jScrollPanetasks.setSize(jPanel5.getWidth(), jPanel5.getHeight());
            } else {
                if (jScrollPanetasks.isVisible()) {
                    jScrollPanetasks.setVisible(false);
                    jPanel5.remove(jScrollPanetasks);
                }
                jPanel5.add(jPanelEmptyList);
                jPanelEmptyList.setVisible(true);
                jPanelEmptyList.setSize(jPanel5.getWidth(), jPanel5.getHeight());
            }
        }
        

	// Carrega todos as tarefas do banco de dados para a Lista tasks
	public void loadTasks(int idProject) {
		List<Task> tasks = taskController.getAll(idProject);
		taskModel.setTasks(tasks);
                
                showJTableTasks(!tasks.isEmpty());
	}

	// Carrega todos os projetos do banco de dados para a Lista projects (olhar
	// linha 339)
	public void loadProjects() {
		List<Project> projects = projectController.getAll();

		projectsModel.clear(); // limpa os projetos da Grid

		// Passa os objetos de uma lista para outra lista
		for (int i = 0; i < projects.size(); i++) {
			Project project = projects.get(i);
			projectsModel.addElement(project);
		}
		jListProjects.setModel(projectsModel);
	}
}