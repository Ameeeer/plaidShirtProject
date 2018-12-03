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
    public Button click13;

    @FXML
    public Button click14;

    @FXML
    public Button click8;

    @FXML
    public Button click11;

    @FXML
    public Button click9;

    @FXML
    public Button click12;

    @FXML
    public Button click17;

    @FXML
    public Button click18;

    @FXML
    public Button answerNo;

    @FXML
    public Button click15;

    @FXML
    public Button click16;

    @FXML
    public Button answerNoSure;

    @FXML
    public Button click20;

    @FXML
    public Button click10;

    @FXML
    public Button answerYes;

    @FXML
    public Button click2;

    @FXML
    public Button click3;

    @FXML
    public Button click19;

    @FXML
    public Button click1;

    @FXML
    public Button click6;

    @FXML
    public Button click7;

    @FXML
    public Button click4;

    @FXML
    public Button click5;
    @FXML
    public Button changeName;
    @FXML
    public Button changeLogin;

    @FXML
    public Button changePassword;

    @FXML
    public TextField loginAtRegistration;

    @FXML
    public Button registrateUser;

    @FXML
    public TextField passAtRegistration;

    @FXML
    public Button backToLogin;

    @FXML
    public TextField nameAtProfile;
    public int userId = 0;
    @FXML
    public ResourceBundle resources;
    @FXML
    public URL location;
    @FXML
    public PasswordField pass;
    @FXML
    public TextField log;
    @FXML
    public Button registrate;
    @FXML
    public Button signIn;
    @FXML
    public Text textIfNotCorrected;
    @FXML
    public Button exitOnLogin;
    @FXML
    public Button mainTests;
    @FXML
    public Text nameToString;
    @FXML
    public Text passwordToString;
    @FXML
    public Text loginToString;
    @FXML
    public Button checkProfile;
    @FXML
    public TextField setNameIntoProfile;
    @FXML
    public TextField setPasswordIntoProfile;
    @FXML
    public TextField setLoginIntoProfile;
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



