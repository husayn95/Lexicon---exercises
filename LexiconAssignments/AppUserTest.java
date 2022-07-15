package LexiconAssignments.ToDoIT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    private AppUser appUser;

    @BeforeEach
    void appUserInit(){
        appUser = new AppUser("husayn95", "123456", AppRole.ROLE_APP_ADMIN);


    }

    @Test
    void getUsername() {
        String expected = "husayn95";
        assertEquals(expected, appUser.getUsername());
    }

    @Test
    void setUsername() {
        appUser.setUsername("husayn1");
        String expected = "husayn1";
        assertEquals(expected,appUser.getUsername());
    }

    @Test
    void getPassword() {
        String expected = "123456";
        assertEquals(expected,appUser.getPassword());
    }

    @Test
    void setPassword() {
        appUser.setPassword("qwert");
        String expected = "qwert";
        assertEquals(expected,appUser.getPassword());
    }

    @Test
    void getRole() {
        AppRole expected = AppRole.ROLE_APP_ADMIN;
        assertEquals(expected,appUser.getRole());
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            appUser.setUsername(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            appUser.setUsername("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            appUser.setRole(null);
        });
    }


    @Test
    void setRole() {
        appUser.setRole(AppRole.ROLE_APP_ADMIN);
        AppRole expected = AppRole.ROLE_APP_ADMIN;
        assertEquals(expected,appUser.getRole());
    }

    @Test
    void testEquals() {
    }

    @Test //demonstrated in PersonTest
    void testHashCode() {
    }

    @Test //demonstrated in PersonTest
    void testToString() {
    }
}