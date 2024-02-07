package src.main.java.add;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        backups(dir, dir);

    }

    private static void backups(File direcktory, File backupPath) throws IOException {
        File backup = new File(backupPath, "backup");
        if (!backup.exists()) backup.mkdir();
        File path = new File(direcktory.getPath());
        File[] dirFile = path.listFiles();
        if (dirFile != null) {
            for (File file : dirFile) {
                if (!file.isDirectory()) {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(backup + "\\" + file.getName());
                    fos.write(fis.readAllBytes());
                }
            }
        }

    }
}
