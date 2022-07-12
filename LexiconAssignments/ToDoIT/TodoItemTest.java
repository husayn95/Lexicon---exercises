package LexiconAssignments.ToDoIT;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    TodoItem todoItem = new TodoItem();

    @Test
    void getId() {
        int actual = 11;
        int expected = todoItem.getId();
        assertEquals(actual,expected);
    }

    @Test
    void getTitle() {
        todoItem.setTitle("to do things");
        String expected = "to do things";
        assertEquals(todoItem.getTitle(),expected);
    }

    @Test
    void setTitle() {
    }

    @Test
    void getTaskDescription() {
        todoItem.setTaskDescription("to do things");
        String expected = "to do things";
        assertEquals(todoItem.getTaskDescription(),expected);
    }

    @Test
    void setTaskDescription() {
    }

    @Test
    void getDeadline() {
        todoItem.setDeadline(LocalDate.of(2022,6,30));
        LocalDate expected = LocalDate.of(2022,6,30);
        assertEquals(todoItem.getDeadline(),expected);

    }

    @Test
    void setDeadline() {
    }

    @Test
    void setDone() {
    }

    @Test
    void is_Done_True() {
    todoItem.setDone(true);
    //boolean expected = false;
    assertTrue(todoItem.isDone());
    }

    @Test
    void getCreator() {
        Person creator = new Person();
       // Person expected = new Person();
        todoItem.setCreator(creator);

        assertEquals(creator,todoItem.getCreator());
    }

    @Test
    void setCreator() {
    }

    @Test
    void is_Overdue_True() {

        LocalDate dayBeforeDeadline = LocalDate.parse("2022-06-29");
        LocalDate deadline = LocalDate.of(2022,6,30);

        assertTrue(dayBeforeDeadline.isBefore(deadline));
    }

    @Test
    void is_Overdue_False() {

        LocalDate dayBeforeDeadline = LocalDate.parse("2022-06-29");
        LocalDate deadline = LocalDate.of(2022,6,30);

        assertFalse(dayBeforeDeadline.isAfter(deadline));
    }


    @Test
    void getSummary() {
        Person creator = new Person();

        todoItem.setTitle("ToDoIT");
        todoItem.setTaskDescription("To work");
        todoItem.setDeadline(LocalDate.of(2022,6,30));
        creator.setFirstName("Husayn");
        todoItem.setCreator(creator);

        String summary = "All information in item object: Id: " + todoItem.getId() + "   Title: "+todoItem.getTitle()
                + "   TaskDescription: "+todoItem.getTaskDescription()+"   Deadline Date: "+todoItem.getDeadline()+"   Done?: "+todoItem.isDone()
                + "   The creator: "+todoItem.getCreator().getFirstName()+"   Is it too late?: "+todoItem.isOverdue();

        System.out.println(summary); // printing out to see if it matches

        assertEquals(summary,todoItem.getSummary());
    }
}