/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice_3_tdd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rajpu
 */
public class TodoList {

    private List<TodoItem> tasks;
    private int nextId;

    public TodoList() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    // INITIAL FUNCTIONALITY
    public TodoItem addTask(String title) {
        TodoItem item = new TodoItem(nextId++, title);
        tasks.add(item);
        return item;
    }

    // ADDITIONAL FUNCTIONALITY
    public boolean updateTaskTitle(int id, String newTitle) {
        for (TodoItem item : tasks) {
            if (item.getId() == id) {
                item.setTitle(newTitle);
                return true;
            }
        }
        return false;
    }

    // ADDITIONAL FUNCTIONALITY
    public boolean markTaskCompleted(int id) {
        for (TodoItem item : tasks) {
            if (item.getId() == id) {
                item.markCompleted();
                return true;
            }
        }
        return false;
    }

    // ADDITIONAL FUNCTIONALITY
    public boolean deleteTask(int id) {
        return tasks.removeIf(item -> item.getId() == id);
    }

    // ? THIS IS WHAT YOUR TEST NEEDS
    public List<TodoItem> getAllTasks() {
        return tasks;
    }
}

