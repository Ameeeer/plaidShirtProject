package sample.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    @FXML
    protected Button click13;

    @FXML
    protected Button click14;

    @FXML
    protected Button click8;

    @FXML
    protected Button click11;

    @FXML
    protected Button click9;

    @FXML
    protected Button click12;

    @FXML
    protected Button click17;

    @FXML
    protected Button click18;

    @FXML
    protected Button answerNo;

    @FXML
    protected Button click15;

    @FXML
    protected Button click16;

    @FXML
    protected Button answerNoSure;

    @FXML
    protected Button click20;

    @FXML
    protected Button click10;

    @FXML
    protected Button answerYes;

    @FXML
    protected Button click2;

    @FXML
    protected Button click3;

    @FXML
    protected Button click19;

    @FXML
    protected Button click1;

    @FXML
    protected Button click6;

    @FXML
    protected Button click7;

    @FXML
    protected Button click4;

    @FXML
    protected Button click5;
    @FXML
    protected Button changeName;
    @FXML
    protected Button changeLogin;

    @FXML
    protected Button changePassword;

    @FXML
    protected TextField loginAtRegistration;

    @FXML
    protected Button registrateUser;

    @FXML
    protected TextField passAtRegistration;

    @FXML
    protected Button backToLogin;

    @FXML
    protected TextField nameAtProfile;
    protected int userId = 0;
    @FXML
    protected ResourceBundle resources;
    @FXML
    protected URL location;
    @FXML
    protected PasswordField pass;
    @FXML
    protected TextField log;
    @FXML
    public Button registrate;
    @FXML
    protected Button signIn;
    @FXML
    protected Text textIfNotCorrected;
    @FXML
    protected Button exitOnLogin;
    @FXML
    protected Button mainTests;
    @FXML
    protected Text nameToString;
    @FXML
    protected Text passwordToString;
    @FXML
    protected Text loginToString;
    @FXML
    protected Button checkProfile;
    @FXML
    protected TextField setNameIntoProfile;
    @FXML
    protected TextField setPasswordIntoProfile;
    @FXML
    protected TextField setLoginIntoProfile;
    boolean checkName = false;


    @FXML
    void initialize() {
        System.out.println("KOOO");
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
    public void changeImpl(ActionEvent event) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("infoAboutUsers.txt"));
        Object source = event.getSource();
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



