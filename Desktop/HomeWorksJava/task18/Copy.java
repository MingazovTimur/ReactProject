package ru.mingazov.task18;

import java.io.*;

public class Copy {

     public static void difCode(String sourceFile, String codeType, String destFile, String codeTypeDes){
        try (Reader reader = new InputStreamReader(new FileInputStream(sourceFile), codeType))
        {
            try(Writer writer = new OutputStreamWriter(new FileOutputStream(destFile), codeTypeDes)){
            int c;
            while((c = reader.read()) != -1) {
                Character a = ((char)c);
                    writer.write((char)c);
                }
                System.out.println("Файл - " + sourceFile + " с кодировкой " + codeType + " успешно скопирован в файл "
                        + destFile + " с кодировкой " + codeTypeDes);
            }

        } catch (UnsupportedEncodingException e) {
            System.out.println("Не поддерживаемая кодировка");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не создан или не найден");;
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        }

     }

}
