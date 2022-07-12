package LexiconAssignments.ToDoIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person Husayn = new Person(1);


    @Test
    void getId() {
        int actual = 1;
        int expected = Husayn.getId();
        assertEquals(actual,expected);
    }

    @Test
   public void getFirstName() {
        Husayn.setFirstName("Husayn");
        String actual = Husayn.getFirstName();
        String expected = "Husayn";
        assertEquals(actual,expected);
    }

    @Test
   public void getLastName() {
        Husayn.setLastName("Ganiev");
        String actual = Husayn.getLastName();
        String expected = "Ganiev";
        assertEquals(actual,expected);
    }

    @Test
    public void getEmail() {
        Husayn.setEmail("husan254@gmail.com");
        String actual = Husayn.getEmail();
        String expected = "husan254@gmail.com";
        assertEquals(actual,expected);
    }

    @Test
    public void getSummary() {
        String actual = Husayn.getSummary();
        String expected = Husayn.getSummary();
        assertEquals(actual,expected);
    }

    @Test
    void setFirstName() {
        String firstname = "Husayn";
        Husayn.setFirstName("Husayn");
        assertEquals(firstname,Husayn.getFirstName());
    }

    @Test
    void setLastName() {
        String lastname = "Ganiev";
        Husayn.setLastName("Ganiev");
        assertEquals(lastname,Husayn.getLastName());
    }

    @Test
    void setEmail() {
        String email = "husan254@gmail.coom";
        Husayn.setEmail("husan254@gmail.com");
        assertEquals(email,Husayn.getEmail());
    }
}