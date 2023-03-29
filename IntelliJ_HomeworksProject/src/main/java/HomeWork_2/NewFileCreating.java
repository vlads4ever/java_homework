package HomeWork_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFileCreating {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Создание файла
        try {
            if (file.createNewFile()){
                System.out.printf("Файл file.txt создан в: %s\n", file.getAbsolutePath());
            } else {
                System.out.printf("Файл file.txt уже существует в: %s\n", file.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Запись в файл
        try {
            FileWriter writer = new FileWriter (file);
            writer.write("TEXT".repeat(100));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

// TODO: 28.03.2023 Домашнее задание
//  Создать файл file.txt
//  Если файл уже создан, ничего делать не надо
//  Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...