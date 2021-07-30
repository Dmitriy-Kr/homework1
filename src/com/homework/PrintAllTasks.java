package com.homework;

public class PrintAllTasks implements MenuItem{
    TaskList taskList;

    public PrintAllTasks(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String getName() {
        return "Вывести список всех задач.";
    }

    @Override
    public void run() {
        System.out.println(taskList.showAllTasks());
    }
}
