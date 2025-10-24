/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author User
 */
public class TaskTableModel extends AbstractTableModel {
    private List<Task> tasks;
    private final String[] COLUMN_NAMES = {"Task ID","Description",
        "Date Created", "Deadline", "Status"};

    public TaskTableModel(){
        this.tasks = new ArrayList<>();
    }    
    @Override
    public int getRowCount() {
        return this.tasks.size();
    }
    @Override
    public int getColumnCount() {
        return this.COLUMN_NAMES.length;
    }        
    @Override
    public String getColumnName(int index) {
        return COLUMN_NAMES[index]; 
    }    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Task task = tasks.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> task.getId();
            case 1 -> task.getDate();
            default -> null;
        };
    }
    
    public void setTasks(List<Task> tasks){
        this.tasks = tasks;
        fireTableDataChanged();
    }
    
    public String getTaskId(int rowIndex, String getTaskId){
        return tasks.get(rowIndex).getTaskId();
    }
    
}
