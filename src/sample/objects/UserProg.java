package sample.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserProg extends Observer {
    private String password;
    public String name;
    public String login;
    public int id;
    List<UserProg> UserProgs = new ArrayList<>();
    static List<UserProg> UserProgInfoIfConnected = new ArrayList<UserProg>();

    public UserProg(List<UserProg> userProgs) {
        UserProgs = userProgs;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserProg(int id, String login, String password, String name) {
        this.password = password;
        this.name = name;
        this.login = login;
        this.id = id;
    }

    public static List<UserProg> getUserProgInfoIfConnected() {
        return UserProgInfoIfConnected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void update() {

    }

    public static List<UserProg> getAllUsers() {
        List<UserProg> users = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("infoAboutUsers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] elems = s.split(" ");
            int id = Integer.parseInt(elems[0]);
            String login = elems[1];
            String password = elems[2];
            String name = elems[3];
            id = Integer.parseInt(elems[0]);
            users.add(new UserProg(id, login, password, name));
        }
        return users;
    }

    public static boolean checkSignIn(String login, String password) {
        List<UserProg> UserProgs = getAllUsers();
        boolean checked = false;
        for (int i = 0; i < UserProgs.size(); i++) {
            if (UserProgs.get(i).getLogin().equals(login) && UserProgs.get(i).getPassword().equals(password)) {
                checked = true;
                UserProgInfoIfConnected.add(UserProgs.get(i));
            }
        }
        return checked;
    }
}