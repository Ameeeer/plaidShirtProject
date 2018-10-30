package sample.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class user extends Observer {
    private String password;
    public String name;
    public String login;
    public int id;
    List<user> users = new ArrayList<user>();

    public user(List<user> users) {
        this.users = users;
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

    public user(String password, String name, String login, int id) {
        this.password = password;
        this.name = name;
        this.login = login;
        this.id = id;
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
}
