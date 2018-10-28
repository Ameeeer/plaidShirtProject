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
    ObservableList <user> users = new ObservableList<user>() {
        @Override
        public void addListener(ListChangeListener<? super user> listener) {
        }

        @Override
        public void removeListener(ListChangeListener<? super user> listener) {
        }

        @Override
        public boolean addAll(user... elements) {
            return false;
        }

        @Override
        public boolean setAll(user... elements) {
            return false;
        }

        @Override
        public boolean setAll(Collection<? extends user> col) {
            return false;
        }

        @Override
        public boolean removeAll(user... elements) {
            return false;
        }

        @Override
        public boolean retainAll(user... elements) {
            return false;
        }

        @Override
        public void remove(int from, int to) {

        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<user> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(user user) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends user> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends user> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public user get(int index) {
            return null;
        }

        @Override
        public user set(int index, user element) {
            return null;
        }

        @Override
        public void add(int index, user element) {

        }

        @Override
        public user remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<user> listIterator() {
            return null;
        }

        @Override
        public ListIterator<user> listIterator(int index) {
            return null;
        }

        @Override
        public List<user> subList(int fromIndex, int toIndex) {
            return null;
        }

        @Override
        public void addListener(InvalidationListener listener) {

        }

        @Override
        public void removeListener(InvalidationListener listener) {

        }
    };
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
