package sample.Tests;

import org.junit.Before;
import org.junit.Test;
import sample.objects.Questionary;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuesionaryTest {
    Questionary questionary;

    @Before
    public void setUp() {
        questionary = new Questionary();
        Questionary.COUNT_ASWERS = 20;
        Questionary.questions = new ArrayList<>();
        Questionary.answers2 = new int[Questionary.COUNT_ASWERS];
        Questionary.currentQuestionid = 0;
    }

    @Test
    public void checkAnswersOnArrayTestOnTrue() {
        final int COUNT_ANSWERS = 20;
        int x = 1;
        for (int i = 1; i < COUNT_ANSWERS + 1; i++) {
            questionary.setAnswers2(x, i);
        }
        boolean expect = questionary.checkAnswersOnArray();
        assertTrue(expect);
    }

    @Test
    public void checkAnswersOnArrayTestOnFalse() {
        final int COUNT_ANSWERS = 20;
        int x = 0;
        for (int i = 1; i < COUNT_ANSWERS + 1; i++) {
            questionary.setAnswers2(x, i);
        }
        boolean expect = questionary.checkAnswersOnArray();
        assertFalse(expect);
    }

    @Test
    public void getIdExeptionTest() {
        questionary.setAnswers2(1, 1);
        int expect = 2;
        int x = questionary.getIdExeption();
        assertEquals(expect, x);
    }

    @Test
    public void setAnswers2Test() {
        questionary.setAnswers2(1, 1);
        int[] arr = questionary.getAnswers2();
        int x = arr[0];
        int expect = 1;
        assertEquals(expect, x);
    }
}
