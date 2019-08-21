package com.example.demo;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class TODO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String taskName;

    @NotNull
    private int dueDate;

    //private String priorties;


    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }
}
