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

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {

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

    @FXML
    void initialize() {
    }

    @FXML
    private Button backToLogin;
    @FXML
    private Button exitOnLogin;
    @FXML
    public void setSignIn(ActionEvent event) throws IOException {
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()) {
            case "registrate":
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
                stage.showAndWait();
                break;
            case "signIn":
                Scanner sc = new Scanner(new File("infoAboutUsers.txt"));
                while (sc.hasNextLine()) {
                    String userLogin = log.getText();
                    String userPassword = pass.getText();
                    String s = sc.nextLine();
                    String[] elems = s.split(" ");
                    if (userLogin.equals(elems[0]) && userPassword.equals(elems[1])) {
                        signIn.getScene().getWindow().hide();
                        FXMLLoader loader2 = new FXMLLoader();
                        loader2.setLocation(getClass().getResource("/sample/fxml/Profile.fxml"));
                        loader2.load();
                        Parent root = loader2.getRoot();
                        Stage stage1 = new Stage();
                        stage1.setScene(new Scene(root));
                        stage1.show();
                    } else {
                        textIfNotCorrected.setText("NotCorrected");
                    }
                }
                break;
        }
    }
    @FXML
    public void ExitToLogin (ActionEvent event){
        Object source = event.getSource();
        Button clicked = (Button) source;
        switch (clicked.getId()){
            case "backToLogin":
                backToLogin.getScene().getWindow().hide();
                FXMLLoader loader3 = new FXMLLoader();
                loader3.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
                try {
                    loader3.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent parent3 = loader3.getRoot();
                Stage stage3 = new Stage();
                stage3.setScene(new Scene(parent3));
                stage3.showAndWait();
                break;
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
}



