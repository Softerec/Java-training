package com.kodilla.kodillaspring.portfolio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private ArrayList<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTasks(ArrayList<String> tasksList) {
        tasks.addAll(tasksList);
    }

    public ArrayList getAllTasks() {
        return tasks;
    }
}
