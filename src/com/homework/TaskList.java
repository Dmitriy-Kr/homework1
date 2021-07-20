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
        for (int i = 0; i < taskList.size(); i++) {
            result.append((i + 1) + ". " + taskList.get(i).getTaskName() + " - " +
                    (taskList.get(i).isTaskStatus() ? "выполнено" : "не выполнено"));
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    String showCompletedTasks() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).isTaskStatus()) {
                result.append((i + 1) + ". " + taskList.get(i).getTaskName());
                result.append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    String showNotCompletedTasks() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < taskList.size(); i++) {
            if (!taskList.get(i).isTaskStatus()) {
                result.append((i + 1) + ". " + taskList.get(i).getTaskName());
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

    static void fillTestData(TaskList tl) {
        tl.addTask("Помыть посуду");
        tl.addTask("Убрать в квартире");
        tl.addTask("Выгулять собаку");
        tl.addTask("Сходить за продуктами");
        tl.addTask("Вынести мусор");
        tl.addTask("Помыть голову");
        tl.markTaskAsCompleted(0);
        tl.markTaskAsCompleted(2);
        tl.markTaskAsCompleted(4);
    }

}
