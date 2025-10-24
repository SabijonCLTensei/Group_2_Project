/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }
    private static final System.Logger LOG = System.getLogger(TaskManager.class.getName());
    
    
    public void addTask(Task task){
        tasks.add(task);
    }
    
    public void deleteTask(int index){
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
    
    public Task getTaskById(int id){
        for (Task t : tasks) {
            if (t.getId() == id) return t; 
            }
            return null;
        }
        public int getCount(){
            return tasks.size();
    }  
}

