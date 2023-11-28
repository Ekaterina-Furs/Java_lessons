/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST.
И метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Main8 {
    static Logger logger = Logger.getAnonymousLogger();
    
    public static void main(String[] args) {
        String filePath = "Java_lessons/lesson_16_11_23/test.txt";
        String logPath = "Java_lessons/lesson_16_11_23/logger.txt";
        String s = "test";
        int n = 10;
        
        createLogger(logPath);
        
        String res = repeat(s, n);
        saveInFile(res, filePath);
        
        closeLogger();
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveInFile(String s, String filePath){
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(s);
            logger.info("Текст успешно записан в файл");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Не удалось записать текст в файл");
        }
    }

    static String readFile(String filePath){
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            stringBuilder.append(scanner.nextLine());
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String repeat(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}