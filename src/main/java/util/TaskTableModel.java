package util;

import java.text.SimpleDateFormat;
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
    List<Task> tasks = new ArrayList<>();
    
    
    //Retorna q qtde linhas a tabela vai ter
    @Override
    public int getRowCount() {
        return tasks.size();
    }
    
    //Retorna a qtde colunas a tabela vai ter
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    //Retorna o nome da coluna definido na linha 15
     @Override
     public String getColumnName(int columnIndex) {
         return columns[columnIndex];
     }
    
     //Permite editar celula
     public boolean isCellEditable(int rowIndex, int columnIndex){
         
         return columnIndex == 3;
     }
     
     //Retorna o tipo de cada item da coluna
     @Override
     public Class<?> getColumnClass(int columnIndex){
         
         if(tasks.isEmpty()){
             return Object.class;
         }
         return this.getValueAt(0, columnIndex).getClass();
     }
    
    //Retorna uma informação de uma linha e coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       switch(columnIndex){
           case 0:
               return tasks.get(rowIndex).getName();
               
           case 1:
              return tasks.get(rowIndex).getDescription();
               
           case 2:
               SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
               return dateFormat.format(tasks.get(rowIndex).getDeadline());
               
           case 3:
              return tasks.get(rowIndex).isCompleted();
               
           case 4:
               return "";
               
           case 5:
               return "";
            
           default:
                return "Dados não encontrados!";
       }
    }
    
    //Altera a tarefa no banco de dados, marcando se está completa ou não
    @Override
     public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         tasks.get(rowIndex).setCompleted((boolean) aValue);
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
