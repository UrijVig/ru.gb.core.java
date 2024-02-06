package src.main.java.app.fileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager <T>{
    private final String FILENAME;

    public FileManager(String filename) {
        this.FILENAME = filename;
    }

    public void createFile(){
        try {
            File file = new File(FILENAME);
            if (file.createNewFile()) {
                System.out.println("Файл успешно создан");
            } else {
                System.out.println("Файл уже существует!");
            }
        } catch (IOException e) {
            System.out.println("Ошибка создания файла!");
            e.printStackTrace();
        }
    }

    public void writeFile(ArrayList<T> data){
        try {
            FileWriter writer = new FileWriter(FILENAME);
            for (T info : data) {
                writer.write(info.toString()+ "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
}
