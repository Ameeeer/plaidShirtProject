package sample.Tests;

import org.junit.Test;
import sample.objects.UserProg;

import static org.junit.Assert.assertTrue;

public class UserProgTest {
    @Test
    public void testCheckSignIn() {
        String login = "admin";
        String password = "admin";
        boolean check = UserProg.checkSignIn(login, password);
        assertTrue(check);
    }
}
