package ru.mingazov.task15.part1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileChanger {
    static public void createNewFile (String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Новый файл " + fileName + " создан");
    }

    static public void deleteFile (String fileName){
        File file = new File(fileName);
        file.delete();
        System.out.println("Файл " + fileName + " удален");
    }

    static public void copyFile (String sourceFileName, String fileNameToCopy){


        File fileSource = new File(sourceFileName);

        File fileToCopy = new File(fileNameToCopy);

        if (fileToCopy.isFile()) {
            System.out.println("Файл " + fileToCopy.getName() + " уже создан, копирование в него невозможно");
        } else {

            try {
                Files.copy(fileSource.toPath(), fileToCopy.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Файл " + sourceFileName + " скопирован в файл " + fileNameToCopy);
        }
    }

    static public void renameFile(String fileName, String textToRename){
        try {
            File file = new File(fileName);

            File file1 = new File(textToRename);

            file.renameTo(file1);

            System.out.println("Файл " + fileName + " переименован в " + textToRename);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

}
