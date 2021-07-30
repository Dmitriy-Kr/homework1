package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        List<MenuItem> menuItems = new ArrayList<>();
        Menu menu = new Menu(scanner, menuItems);

        taskList.addTask("Помыть посуду");
        taskList.addTask("Убрать в квартире");
        taskList.addTask("Выгулять собаку");
        taskList.addTask("Сходить за продуктами");
        taskList.addTask("Вынести мусор");
        taskList.addTask("Помыть голову");
        taskList.markTaskAsCompleted(0);
        taskList.markTaskAsCompleted(2);
        taskList.markTaskAsCompleted(4);

        menuItems.add(new AddNewTask(scanner, taskList));
        menuItems.add(new PrintAllTasks(taskList));
        menuItems.add(new PrintFinishedTask(taskList));
        menuItems.add(new PrintUnfinishedTasks(taskList));
        menuItems.add(new MarkTaskAsFinished(scanner, taskList));

        menu.run();
    }
}