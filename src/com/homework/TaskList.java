package com.homework;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    int getTaskListSize() {
        return taskList.size();
    }

    void addTask(String newTask) {
        taskList.add(new Task(newTask, false));
    }

    String showAllTasks() {
        StringBuilder result = new StringBuilder();
        result.append("Список всех задач: ").append(System.lineSeparator());
        for (int i = 0; i < taskList.size(); i++) {
            result.append(i + 1).append(". ").append(taskList.get(i).getTaskName()).append(" - ");
            result.append(taskList.get(i).isTaskStatus() ? "выполнено" : "не выполнено");
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    String printFinishedTasks() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).isTaskStatus()) {
                result.append(i + 1).append(". ").append(taskList.get(i).getTaskName());
                result.append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    String printUnFinishedTasks() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < taskList.size(); i++) {
            if (!taskList.get(i).isTaskStatus()) {
                result.append(i + 1).append(". ").append(taskList.get(i).getTaskName());
                result.append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    boolean markTaskAsCompleted(int numTask) {
        if (taskList.get(numTask).isTaskStatus()) {
            return false;
        }
        taskList.get(numTask).setTaskStatus(true);
        return true;
    }
}
