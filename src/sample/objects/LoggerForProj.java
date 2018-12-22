package sample.objects;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerForProj {
    private static LoggerForProj instance;
    private static final String FILE_NAME = "log.txt";
    private static PrintWriter printWriter;

    private LoggerForProj() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);
            this.printWriter = new PrintWriter(fw, true);
        } catch (IOException e) {
            throw new IllegalArgumentException("Логгер не создан, всё плохо :(");
        }
    }

    public static LoggerForProj getInstance() {
        if (instance == null) {
            instance = new LoggerForProj();
        }
        return instance;
    }

    public static void info(String message) {
        printWriter.println("INFO " + LocalDateTime.now() +
                " " + message);
    }

    public static void error(String message) {
        printWriter.println("ERROR " + LocalDateTime.now() +
                " " + message);
    }
}

