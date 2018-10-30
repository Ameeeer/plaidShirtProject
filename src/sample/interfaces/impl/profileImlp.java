package sample.interfaces.impl;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import sample.interfaces.profile;
import sample.objects.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class profileImlp extends user {
    public profileImlp(String password, String name, String login,int id) throws FileNotFoundException {
        super(password, name, login,id);
        Scanner scanner = new Scanner(new File("infoAboutUsers.txt"));
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] elems = s.split(" ");
            for (int i = 0; i < elems.length ; i++) {
                password = elems[2];
                name = elems[3];
                login= elems[1];
                id = Integer.parseInt(elems[0]);
            }
        }
    }
}
