/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Task {
    private int id;
    private String name ;
    private String position ;
    private LocalDate date;
    private String LogIn;
    private String LogOut;

    public Task(int id, String name, String position, LocalDate date, String LogIn, String LogOut) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.date = date;
        this.LogIn = LogIn;
        this.LogOut = LogOut;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogIn() {
        return LogIn;
    }

    public String getLogOut() {
        return LogOut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLogIn(String LogIn) {
        this.LogIn = LogIn;
    }

    public void setLogOut(String LogOut) {
        this.LogOut = LogOut;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name=" + name + ", position=" + position + ", date=" + date + ", LogIn=" + LogIn + ", LogOut=" + LogOut + '}';
    }

    
}
