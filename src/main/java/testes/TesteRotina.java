package testes;

import java.sql.SQLException;
import java.util.List;

import controller.ProjectController;
import controller.TaskController;
import model.Project;
import model.Task;

public class TesteRotina {

	public static void main(String[] args) throws SQLException {
		
		
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        
        //Cria e salva um novo projeto
        
        /*task.setIdProject(1);
        task.setName("Avançar para aguas mais profundas");
        task.setDescription("Teste para ver se está funcionando -1");
        task.setNotes("Sem notas");
        task.setCompleted(true);
        TaskController.saveTask(task);*/
		
        //Atualiza um novo projeto
        
        /*task.setId(17);
		task.setIdProject(6);
		task.setName("Terceira tarefa criada - Teste de mesa");
		task.setDescription("Mudança de Descrição");
		task.setNotes("Nota de teste de mesa");
		task.setCompleted(true);
		taskController.updateTask(task);*/
		
        //Retorna todas as tarefas
		List<Task> tarefas = TaskController.getAll(6);
		System.out.println("Total de tarefas = " + tarefas.size());
		System.out.println(tarefas.toString());
        
        //Remove uma tarefa
        //taskController.removeTaskById(1);
		
		//-------------------------- CRIAÇÃO DE PROJETOS ------------------
        
    	/*ProjectController projectController = new ProjectController();
    	Project project = new Project();
    	
    	//project.setId(1);
    	project.setName("Novo Projeto");
        project.setDescription("Teste para ver se está funcionando");
        projectController.saveProject(project);
        //projectController.updateProject(project);*/
        
        /*List<Project> projetos = projectController.getAll();
        System.out.println("Total de projetos = " + projetos.size());
        System.out.println(projetos.toString());
        
        projectController.deleteProjectById(3);*/
	}

}
