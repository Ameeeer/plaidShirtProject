package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.objects.Questionary;
import sample.objects.UserProg;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProfileController extends Controller {
    @FXML
    public Text exceptionWrite;
    @FXML
    public Button sendAnswers;
    @FXML
    public Button Questions;
    @FXML
    public Button MainMenu;
    @FXML
    public Text questionText;
    @FXML
    public Button getName;
    @FXML
    public Button getLogin;
    @FXML
    public Button getPassword;
    @FXML
    public Button saveChanges;

    @FXML
    public void profileChanges(ActionEvent event) {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "changeName": {
                if (setNameIntoProfile.getText() != null)
                    UserProg.getUserProgInfoIfConnected().get(0).setName(setNameIntoProfile.getText());
            }
            case "changeLogin": {
                if (setLoginIntoProfile.getText() != null) {
                    UserProg.getUserProgInfoIfConnected().get(0).setLogin(setLoginIntoProfile.getText());
                }
            }
            case "changePassword": {
                if (setPasswordIntoProfile.getText() != null)
                    UserProg.getUserProgInfoIfConnected().get(0).setPassword(setPasswordIntoProfile.getText());
            }
            case "getName": {
                setNameIntoProfile.setText(UserProg.getUserProgInfoIfConnected().get(0).getname());
                break;
            }
            case "getLogin": {
                setLoginIntoProfile.setText(UserProg.getUserProgInfoIfConnected().get(0).getLogin());
                break;
            }
            case "getPassword": {
                setPasswordIntoProfile.setText(UserProg.getUserProgInfoIfConnected().get(0).getPassword());
                break;
            }
        }
    }

    public void check(ActionEvent event) throws IOException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "checkProfile": {
                checkProfile.getScene().getWindow().hide();
                FXMLLoader loader2 = new FXMLLoader();
                loader2.setLocation(getClass().getResource("/sample/fxml/userProfile.fxml"));
                try {
                    loader2.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader2.getRoot();
                Stage stage1 = new Stage();
                stage1.setScene(new Scene(root));
                stage1.setMinHeight(600);
                stage1.setMinWidth(800);
                stage1.show();
                break;
            }
            case "sendAnswers": {
                if (Questionary.checkAnswersOnArray() == true) {
                    Questionary.printAllAnswersWithid(UserProg.getUserProgInfoIfConnected().get(0).getId());
                    questionText.setText("Вы отправили ответы");
                    System.out.println("da");
                    break;
                } else if (Questionary.checkAnswersOnArray() == false) {
                    exceptionWrite.setText("Вы не ответили на вопрос номер = " + Questionary.getIdExeption());
                    System.out.println("no");
                    break;
                }
            }
        }
    }

    public void ExitToLogin(ActionEvent event) {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "exitOnLogin":
                exitOnLogin.getScene().getWindow().hide();
                FXMLLoader loader4 = new FXMLLoader();
                loader4.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
                try {
                    loader4.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent parent4 = loader4.getRoot();
                Stage stage4 = new Stage();
                stage4.setScene(new Scene(parent4));
                stage4.showAndWait();
                break;
        }
    }

    @FXML
    public void chooseQuestion(ActionEvent event) throws IOException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "click1": {
                questionText.setText(Questionary.getAllquestions().get(0));
                Questionary.setCurrentQuestionid(1);
                break;
            }
            case "click2": {
                questionText.setText(Questionary.getAllquestions().get(1));
                Questionary.setCurrentQuestionid(2);
                break;
            }
            case "click3": {
                questionText.setText(Questionary.getAllquestions().get(2));
                Questionary.setCurrentQuestionid(3);
                break;
            }
            case "click4": {
                questionText.setText(Questionary.getAllquestions().get(3));
                Questionary.setCurrentQuestionid(4);
                break;
            }
            case "click5": {
                questionText.setText(Questionary.getAllquestions().get(4));
                Questionary.setCurrentQuestionid(5);
                break;
            }
            case "click6": {
                questionText.setText(Questionary.getAllquestions().get(5));
                Questionary.setCurrentQuestionid(6);
                break;
            }
            case "click7": {
                questionText.setText(Questionary.getAllquestions().get(6));
                Questionary.setCurrentQuestionid(7);
                break;
            }
            case "click8": {
                questionText.setText(Questionary.getAllquestions().get(7));
                Questionary.setCurrentQuestionid(8);
                break;
            }
            case "click9": {
                questionText.setText(Questionary.getAllquestions().get(8));
                Questionary.setCurrentQuestionid(9);

                break;
            }
            case "click10": {
                questionText.setText(Questionary.getAllquestions().get(9));
                Questionary.setCurrentQuestionid(10);
                break;
            }
            case "click11": {
                questionText.setText(Questionary.getAllquestions().get(10));
                Questionary.setCurrentQuestionid(11);
                break;
            }
            case "click12": {
                questionText.setText(Questionary.getAllquestions().get(11));
                Questionary.setCurrentQuestionid(12);
                break;
            }
            case "click13": {
                questionText.setText(Questionary.getAllquestions().get(12));
                Questionary.setCurrentQuestionid(13);
                break;
            }
            case "click14": {
                questionText.setText(Questionary.getAllquestions().get(13));
                Questionary.setCurrentQuestionid(14);
                break;
            }
            case "click15": {
                questionText.setText(Questionary.getAllquestions().get(14));
                Questionary.setCurrentQuestionid(15);
                break;
            }
            case "click16": {
                questionText.setText(Questionary.getAllquestions().get(15));
                Questionary.setCurrentQuestionid(16);
                break;
            }
            case "click17": {
                questionText.setText(Questionary.getAllquestions().get(16));
                Questionary.setCurrentQuestionid(17);
                break;
            }
            case "click18": {
                questionText.setText(Questionary.getAllquestions().get(17));
                Questionary.setCurrentQuestionid(18);
                break;
            }
            case "click19": {
                questionText.setText(Questionary.getAllquestions().get(18));
                Questionary.setCurrentQuestionid(19);
                break;
            }
            case "click20": {
                questionText.setText(Questionary.getAllquestions().get(19));
                Questionary.setCurrentQuestionid(20);
                break;
            }
        }
    }

    @FXML
    public void answer(ActionEvent event) throws IOException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "answerYes": {
                Questionary.setAnswers2(1, Questionary.getCurrentQuestionid());
                if (Questionary.getCurrentQuestionid() == 0) {
                    exceptionWrite.setText("Вы не выбрали вопрос");
                } else {
                    exceptionWrite.setText("Ваш ответ на вопрос номер " + Questionary.getCurrentQuestionid() + " засчитан");
                }
                System.out.println(Questionary.getAnswers2());
                break;
            }
            case "answerNo": {
                Questionary.setAnswers2(2, Questionary.getCurrentQuestionid());
                if (Questionary.getCurrentQuestionid() == 0) {
                    exceptionWrite.setText("Вы не выбрали вопрос");
                } else {
                    exceptionWrite.setText("Ваш ответ на вопрос номер " + Questionary.getCurrentQuestionid() + " засчитан");
                }
                break;
            }
            case "answerNoSure": {
                Questionary.setAnswers2(3, Questionary.getCurrentQuestionid());
                if (Questionary.getCurrentQuestionid() == 0) {
                    exceptionWrite.setText("Вы не выбрали вопрос");
                } else {
                    exceptionWrite.setText("Ваш ответ на вопрос номер " + Questionary.getCurrentQuestionid() + " засчитан");
                }
                break;
            }
        }
    }

    public void getQuestions(ActionEvent event) throws IOException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "Questions": {
                FXMLLoader loader2 = new FXMLLoader();
                Parent root;
                loader2.setLocation(getClass().getResource("/sample/fxml/questions.fxml"));
                loader2.load();
                root = loader2.getRoot();
                Stage stage1 = new Stage();
                stage1.setScene(new Scene(root));
                stage1.show();
                break;
            }
        }
    }

    public void getMainMenu(ActionEvent event) {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "MainMenu": {
                checkProfile.getScene().getWindow().hide();
                FXMLLoader loader2 = new FXMLLoader();
                loader2.setLocation(getClass().getResource("/sample/fxml/Profile.fxml"));
                try {
                    loader2.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader2.getRoot();
                Stage stage1 = new Stage();
                stage1.setScene(new Scene(root));
                stage1.setMinHeight(600);
                stage1.setMinWidth(800);
                stage1.show();
                break;
            }
        }
    }

    @FXML
    public void save(ActionEvent event) throws FileNotFoundException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "saveChanges": {
            }
        }
    }
}
