package com.homework;

public class PrintUnfinishedTasks implements MenuItem{
    TaskList taskList;

    public PrintUnfinishedTasks(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String getName() {
        return "Вывести список не выполненных задач";
    }

    @Override
    public void run() {
        System.out.println("Список не выполненных задач: ");
        System.out.println(taskList.printUnFinishedTasks());
    }
}
