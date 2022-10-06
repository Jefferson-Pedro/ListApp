package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author jefferson.silva
 */
public class TaskTableModel extends AbstractTableModel {
    
    String[] columns = {"Nome", "Decrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();
    
    
    //Retorna q qtde linhas a tabela vai ter
    @Override
    public int getRowCount() {
        return tasks.size();
    }
    
    //Retorna q qtde colunas a tabela vai ter
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    //Retorna uma informação de uma linha e coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       switch(columnIndex){
           case 1:
               return tasks.get(rowIndex).getName();
               
           case 2:
              return tasks.get(rowIndex).getDescription();
               
           case 3:
               return tasks.get(rowIndex).getDeadline();
               
           case 4:
              return tasks.get(rowIndex).isCompleted();
               
           case 5:
               return "";
               
           case 6:
               return "";
            
           default:
                return "Dados não encontrados!";
       }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}
