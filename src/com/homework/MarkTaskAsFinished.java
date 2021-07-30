package com.homework;

import java.util.Scanner;

public class MarkTaskAsFinished implements MenuItem {
    Scanner scanner;
    TaskList taskList;

    public MarkTaskAsFinished(Scanner scanner, TaskList taskList) {
        this.scanner = scanner;
        this.taskList = taskList;
    }

    @Override
    public String getName() {
        return "Отметить задачу как выполненную";
    }

    @Override
    public void run() {
        System.out.println(taskList.showAllTasks());
        System.out.print("Выберите задачу для отметки как выпонено (введите номер задачи): ");
        if (scanner.hasNextInt()) {
            int taskNumber = scanner.nextInt() - 1;
            scanner.nextLine();
            if (taskNumber >= 0 && taskNumber < taskList.getTaskListSize()) {
                if (taskList.markTaskAsCompleted(taskNumber)) {
                    System.out.println(taskList.showAllTasks());
                } else {
                    System.out.println("Задача уже отмечена как выполненная!!!");
                }
                return;
            }
        } else {
            scanner.nextLine();
        }
        System.out.println("Неправильно указан номер задачи!!!");
    }
}
