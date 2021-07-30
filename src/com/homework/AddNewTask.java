package com.homework;

import java.util.Scanner;

public class AddNewTask implements MenuItem{
    Scanner scanner;
    TaskList taskList;

    public AddNewTask(Scanner scanner, TaskList taskList) {
        this.scanner = scanner;
        this.taskList = taskList;
    }

    @Override
    public String getName() {
        return "Добавить новую задачу";
    }

    @Override
    public void run() {
        System.out.print("Введите название новой задачи: ");
        String taskName = scanner.nextLine();
        taskList.addTask(taskName);
        System.out.println(taskList.showAllTasks());
    }
}
