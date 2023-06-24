package files;

import java.io.File;
import java.util.Scanner;

public class FilesInAllFolders {
    public static void main(String[] args) {
        String pathRaw;
        int fileCount = 0;
        int folderCount = 0;
        int txtCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к папке:");
        pathRaw = scanner.nextLine();
        File folder = new File(pathRaw);
        if (folder.exists() && folder.isDirectory()) {
            countFileFolder(folder, folderCount, fileCount, txtCount);
            System.out.println("Количество файлов: " + fileCount);
            System.out.println("Количество папок: " + folderCount);
            System.out.println("Количество txt файлов: " + txtCount);
        } else {
            System.out.println("Указанная папка не существует или не является директорией.");
        }
    }

    private static void countFileFolder(File folder, int folderCount, int fileCount, int txtCount) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileCount++;
                    if (file.getName().endsWith(".txt")) {
                        txtCount++;
                    }
                } else if (file.isDirectory()) {
                    folderCount++;
                    countFileFolder(file, folderCount, fileCount, txtCount);
                }
            }
        }
    }
}