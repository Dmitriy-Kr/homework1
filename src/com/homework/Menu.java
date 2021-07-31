package com.homework;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> menuItems;
    private Scanner scanner;

    Menu(Scanner scanner, List<MenuItem> menuItems) {
        this.scanner = scanner;
        this.menuItems = menuItems;
    }

    private void printMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + 1 + ". " + menuItems.get(i).getName());
        }
        System.out.println(menuItems.size() + 1 + ". Выход");
    }

    private int getChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return --choice;
        }
        scanner.nextLine();
        return -1;
    }

    public void run() {
        int choice;
        System.out.println("Приветствую Вас." + System.lineSeparator());
        while (true) {
            printMenu();
            System.out.print("Выберите пункт меню (введите цифру): ");
            choice = getChoice();
            if (choice < 0 || choice > menuItems.size()) {
                System.out.println("Выберите пункт меню");
                continue;
            }
            if (choice == menuItems.size()) {
                break;
            }
            menuItems.get(choice).run();
        }
    }
}
