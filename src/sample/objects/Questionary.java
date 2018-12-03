package sample.objects;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questionary implements QuestionsIntrfs {
    static int COUNT_ASWERS = 20;
    static List<String> questions = new ArrayList<>();
    static int[] answers2 = new int[COUNT_ASWERS];
    static int currentQuestionid = 0;

    public static List<String> getAllquestions() throws FileNotFoundException {
        List<String> questionsAdded = new ArrayList<>();
        Scanner sc = new Scanner(new File("questionList.txt"));
        while (sc.hasNextLine()) {
            questionsAdded.add(sc.nextLine());
        }
        questions = questionsAdded;
        return questionsAdded;
    }

    public static int[] getAnswers2() {
        return answers2;
    }

    public static void setAnswers2(int answers2X, int place) {
        if (place <= 0 || place > COUNT_ASWERS) {
        } else {
            answers2[place - 1] = answers2X;
        }
    }


    @Override
    public void addQueston() {

    }


    public static int getCurrentQuestionid() {
        return currentQuestionid;
    }

    public static void setCurrentQuestionid(int currentQuestionid) {
        Questionary.currentQuestionid = currentQuestionid;
    }

    @Override
    public void getNextQuestion() {

    }

    public static boolean checkAnswersOnArray() {
        boolean check = true;
        for (int i = 0; i < answers2.length; i++) {
            if (answers2[i] == 0) {
                return false;
            }
        }
        return check;
    }

    public static int getIdExeption() {
        int x = 0;
        for (int i = 0; i < answers2.length; i++) {
            if (answers2[i] == 0) {
                return i + 1;
            }
        }
        return x;

    }

    public static void printAllAnswersWithid(int userId) throws IOException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("userIdAndAnswers.txt"), true));
        Scanner sc = new Scanner("userIdAndAnswers.txt");
        if (sc.hasNext()) {
            pw.print("\n" + "User id = " + "(" + userId + ")" + " ");
            for (int i = 0; i < answers2.length; i++) {
                pw.print("" + (i + 1) + ")" + answers2[i] + " ");
            }
            pw.close();
        } else {
            pw.print("User id = " + "(" + userId + ")" + " ");
            for (int i = 0; i < answers2.length; i++) {
                pw.print("" + (i + 1) + ")" + answers2[i] + " ");
            }
            pw.close();
        }
    }
}
