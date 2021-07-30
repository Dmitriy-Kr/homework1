package com.homework;

public class PrintFinishedTask implements MenuItem{
    TaskList taskList;

    public PrintFinishedTask(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String getName() {
        return "Вывести список выполненных задач";
    }

    @Override
    public void run() {
        System.out.println("Список выполненных задач: ");
        System.out.println(taskList.printFinishedTasks());
    }
}
