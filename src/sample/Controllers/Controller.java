package sample.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {

    @FXML
    private Button changeName;
    @FXML
    private Button changeLogin;

    @FXML
    private Button changePassword;

    @FXML
    private TextField loginAtRegistration;

    @FXML
    private Button registrateUser;

    @FXML
    private TextField passAtRegistration;

    @FXML
    private Button backToLogin;

    @FXML
    private TextField nameAtProfile;
    public int userId = 0;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private PasswordField pass;
    @FXML
    private TextField log;
    @FXML
    private Button registrate;
    @FXML
    private Button signIn;
    @FXML
    private Text textIfNotCorrected;

    String nameToProfile = null;
    String loginToProfile = null;
    String passwordToProfile = null;

    @FXML
    private Button exitOnLogin;
    @FXML
    private Button mainTests;

    @FXML
    private Button checkProfile;

    @FXML
    public TextField setNameIntoProfile;

    @FXML
    public TextField setPasswordIntoProfile;

    @FXML
    public TextField setLoginIntoProfile;
    @FXML
    void initialize() {
        /*Scanner scanner = new Scanner(new File("infoAboutUsers.txt"));
        String s = scanner.nextLine();
        String[] elems = s.split(" ");
        List<user> users = new ArrayList<user>();
        while (scanner.hasNextLine()) {
            String aa = scanner.nextLine();
            users.add(new user(elems[3], elems[3], elems[2], Integer.parseInt(elems[1])));
            if (aa == null) {
                return;
            }
        }*/
    }


    @FXML
    public void setSignIn(ActionEvent event) throws FileNotFoundException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "registrate": //При нажатии на кнопку регистрации в main меню перебрасывает на страницу регистрации
                registrate.getScene().getWindow().hide();
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("/sample/fxml/registration.fxml"));
                try {
                    loader1.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent parent1 = loader1.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent1));
                stage.setMinHeight(400);
                stage.setMinWidth(600);
                stage.show();
            case "signIn": /*При нажатии на SignIn происходит проверка введенных данных в Поле Логин и пароль
            Если данные введены верны идет переход в профиль пользователя*/
                Scanner sc = new Scanner(new File("infoAboutUsers.txt"));
                while (sc.hasNextLine()) {
                    String userLogin = log.getText();
                    String userPassword = pass.getText();
                    String s = sc.nextLine();
                    String[] elems = s.split(" ");
                    if (userLogin.equals(elems[1]) && userPassword.equals(elems[2])) {
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
                        loginToProfile = elems[1];
                        passwordToProfile = elems[2];
                        nameToProfile = elems[3];
                        stage1.setMinHeight(600);
                        stage1.setMinWidth(800);
                        stage1.show();
                    } else {
                        textIfNotCorrected.setText("Not Corrected");
                    }
                }
                break;
            case "checkProfile": {
                Scanner scanner = new Scanner(new File("infoAboutUsers.txt"));
                String s = scanner.nextLine();
//                String[] elems = s.split(" ");
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
                setPasswordIntoProfile = new TextField();
                passwordToProfile = "hop-hey";
                setPasswordIntoProfile.setText("hop-hey");
                setLoginIntoProfile = new TextField();
                setLoginIntoProfile.setText("hop-hey");
                setNameIntoProfile = new TextField();
                setNameIntoProfile.setText("hop-hey");
                stage1.setScene(new Scene(root));
                stage1.setMinHeight(600);
                stage1.setMinWidth(800);
                stage1.show();
            }
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
                    pw.print("\n" + (userId + 1) + " " + loginAtRegistration.getText() + " " + passAtRegistration.getText() + " " + nameAtProfile.getText());
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
            //TODO: 27.10.2018 Profile with Name and Login and Connect this after login
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

    @FXML
    public void changeImpl(ActionEvent event) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("infoAboutUsers.txt"));
        Object source = new Object();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "changeName":
                break;
            case "changeLogin":
                break;

            case "changePassword":
                break;
        }
    }
}



