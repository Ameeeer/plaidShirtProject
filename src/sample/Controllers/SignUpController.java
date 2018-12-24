package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.objects.LoggerForProj;
import sample.objects.UserProg;

import java.io.*;
import java.util.Scanner;

public class SignUpController extends Controller {
    LoggerForProj logger = LoggerForProj.getInstance();
    @FXML
    public void setSignIn(ActionEvent event) throws IOException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "registrate": //При нажатии на кнопку регистрации в main меню перебрасывает на страницу регистрацииr.
                registrate.getScene().getWindow().hide();
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("/sample/fxml/registration.fxml"));
                loader1.load();
                Parent parent1 = loader1.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent1));
                stage.setMinHeight(400);
                stage.setMinWidth(600);
                stage.show();
                break;
            case "registrateUser":
                Scanner scanner1 = new Scanner(new File("infoAboutUsers.txt"));
                registrateUser.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                while (scanner1.hasNextLine()) {
                    String aa = scanner1.nextLine();
                    userId++;
                    if (aa == null) {
                        return;
                    }
                }
                try {
                    PrintWriter pw = new PrintWriter(new FileOutputStream(new File("infoAboutUsers.txt"), true));
                    pw.print((userId + 1) + " " + loginAtRegistration.getText() + " " + passAtRegistration.getText() + " " + nameAtProfile.getText()+ "*" + "\n");
                    pw.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                loader.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent parent3 = loader.getRoot();
                Stage stage3 = new Stage();
                stage3.setScene(new Scene(parent3));
                stage3.show();
                break;
            case "signIn": /*При нажатии на SignIn происходит проверка введенных данных в Поле Логин и пароль
            Если данные введены верны идет переход в профиль пользователя*/
                String userLogin = log.getText();
                String userPassword = pass.getText();
                boolean c = UserProg.checkSignIn(userLogin, userPassword);
               logger.info("Пользователь с логином " + userLogin + " " + "Пытался войти в профиль");
                if (c == true) {

                    signIn.getScene().getWindow().hide();
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
                } else {

                    textIfNotCorrected.setText("Not Corrected");
                }
                break;
        }
    }

    @FXML
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
                stage4.show();
                break;
            case "backToLogin":
                backToLogin.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent parent3 = loader.getRoot();
                Stage stage3 = new Stage();
                stage3.setScene(new Scene(parent3));
                stage3.show();
                break;
        }
    }
}

