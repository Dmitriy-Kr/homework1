package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        TaskList.fillTestData(taskList);

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print(MENU);
            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.print("Введите название новой задачи: ");
                        scanner.nextLine();
                        String taskName = scanner.nextLine();
                        taskList.addTask(taskName);
                        break;
                    case 2:
                        System.out.println("Список всех задач: ");
                        System.out.println(taskList.showAllTasks());
                        break;
                    case 3:
                        System.out.println("Список выполненных задач: ");
                        System.out.println(taskList.showCompletedTasks());
                        break;
                    case 4:
                        System.out.println("Список не выполненных задач: ");
                        System.out.println(taskList.showNotCompletedTasks());
                        break;
                    case 5:
                        System.out.print("Выберите задачу для отметки как выпонено (введите номер задачи): ");
                        taskList.showAllTasks();
                        if (scanner.hasNextInt()) {
                            int taskNumber = scanner.nextInt() - 1;
                            if (taskNumber < 0 || taskNumber > taskList.getTaskListSize()) {
                                System.out.println("Неправильно указан номер задачи!!!");
                                break;
                            }
                            if (taskList.markTaskAsCompleted(taskNumber)) {
                                System.out.println(taskList.showAllTasks());
                            } else {
                                System.out.println("Задача уже отмечена как выполненная!!!");
                            }
                        }
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Введите число от 1 до 6!!!");
                }
            } else {
                System.out.println("Введите число.");
            }
        } while (flag);
    }

    static final String MENU = "Выберите пункт меню (введите цифру): \n" +
            "[1] Добавить новую задачу \n" +
            "[2] Вывести список всех задач \n" +
            "[3] Вывести список выполненных задач \n" +
            "[4] Вывести список не выполненных задач \n" +
            "[5] Отметить задачу как выполненную \n" +
            "[6] Выход \n" +
            "Введите цифру: ";
}