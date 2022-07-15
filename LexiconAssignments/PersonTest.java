package LexiconAssignments.ToDoIT;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person(1);
    AppUser appUser = new AppUser("Husayn", "Ganiev", AppRole.ROLE_APP_ADMIN);


    @Test
    void getId() {
        int actual = 1;
        int expected = person.getId();
        assertEquals(actual, expected);
    }

    @Test
    public void getFirstName() {
        person.setFirstName("Husayn");
        String actual = person.getFirstName();
        String expected = "Husayn";
        assertEquals(actual, expected);
    }

    @Test
    public void getLastName() {
        person.setLastName("Ganiev");
        String actual = person.getLastName();
        String expected = "Ganiev";
        assertEquals(actual, expected);
    }

    @Test
    public void getEmail() {
        person.setEmail("husan254@gmail.com");
        String actual = person.getEmail();
        String expected = "husan254@gmail.com";
        assertEquals(actual, expected);
    }

    //   @Test
//    public void getSummary() {
//        String actual = Husayn.getSummary();
//        String expected = Husayn.getSummary();
//        assertEquals(actual,expected);
//    }

    @Test
    void setFirstName() {
        String firstname = "Husayn";
        person.setFirstName("Husayn");
        assertEquals(firstname, person.getFirstName());
    }

    @Test
    void setLastName() {
        String lastname = "Ganiev";
        person.setLastName("Ganiev");
        assertEquals(lastname, person.getLastName());
    }

    @Test
    void setEmail() {
        String email = "husan254@gmail.coom";
        person.setEmail("husan254@gmail.com");
        assertEquals(email, person.getEmail());
    }

    @Test
    void getCridentials() {
        person.setCridentials(appUser);
        //AppUser expected = appUser;
        assertEquals(appUser, person.getCridentials());

    }

    @Test
    void setCridentials() {
        person.setCridentials(appUser);
        assertEquals(appUser, person.getCridentials());
    }

    @Test
    void shouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            person.setCridentials(null);
        });
    }

    @Test
    void testToString() {
        Person person = new Person(1, "Husayn", "Ganiev", "husadhas", appUser);
        String expectedPrintOut = "Person{" +
                "id=" + person.getId() +
                ", firstName='" + person.getFirstName() + '\'' +
                ", lastName='" + person.getLastName() + '\'' +
                ", email='" + person.getEmail() + '\'' +
                '}';
        assertEquals(expectedPrintOut, person.toString());
    }

    @Test
    void testEquals() {

    }

    @Test
    void testHashCode() {
        person.setFirstName("Husayn");
        person.setLastName("Ganiev");
        person.setEmail("huash");

       int hashCodeExpected = Objects.hash(person.getId(),person.getFirstName(),person.getLastName(),person.getEmail());
        System.out.println(hashCodeExpected); //testing
        System.out.println(person.toString());
        System.out.println(person.hashCode());
        assertEquals(hashCodeExpected,person.hashCode());
    }
}