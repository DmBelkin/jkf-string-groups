package ru.sendel;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        SingleString string = new SingleString();
        System.out.println("*******************************************************************");
        System.out.println("*************Вас приветствует программа обработки строк************");
        System.out.println("*******************************************************************");
        System.out.println("***результат обработки в файле: C:\\Desktop\\dst.txt***************");
        System.out.println("*******************************************************************");
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Введите путь к файлу(.txt)");
                String path = scanner.nextLine();
                if (path.equals("ok")) {
                    return;
                }
                string.stringsGrouping(path);
            }
        } catch (IOException e) {
            System.err.println("wrong path");
        }
    }
}