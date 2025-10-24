/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.Task;
import model.TaskManager;
import util.IdGenerator;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class TaskController {
    private TaskManager taskManager;
    private JTable table;

    public TaskController(TaskManager taskManager, JTable table) {
        this.taskManager = taskManager;
        this.table = table;
    }

    public void addTask(String name, String position, String login, String logout){
        int id = IdGenerator.generateId();
        Task task = new Task(id, name, position, LocalDate()new, login, logout);
    }
    
    
}
  
   