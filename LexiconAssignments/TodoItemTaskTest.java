package LexiconAssignments.ToDoIT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {

    TodoItemTask todoItemTask = new TodoItemTask();
    TodoItem todoItem = new TodoItem();
    Person assignee = new Person();

    @Test
    void getId() {
        int actual = 101;
        int expected = todoItemTask.getId();
        assertEquals(actual,expected);
    }

    @Test
    void isAssigned() {
        todoItemTask.setAssigned(true);
        //boolean expected = false;
        assertTrue(todoItemTask.isAssigned());
    }

    @Test
    void setAssigned() {
    }

    @Test
    void getTodoItem() {
        TodoItem actual = todoItem;
        todoItemTask.setTodoItem(todoItem);
        assertEquals(actual, todoItemTask.getTodoItem());

    }

    @Test
    void setTodoItem() {
    }

    @Test
    void getAssignee() {
        Person actual = assignee;
        todoItemTask.setAssignee(actual);
        assertEquals(actual,todoItemTask.getAssignee());

    }

    @Test
    void setAssignee() {
    }

//    @Test
//    void getSummary() {
//        todoItemTask.setTodoItem(todoItem);
//        todoItemTask.setAssignee(assignee);
//        todoItem.setTitle("Doing things");
//        assignee.setFirstName("Husayn");
//
//        String summary = "ToDoItemTask Id: "+todoItemTask.getId()+ "   What is the task?: "+todoItemTask.getTodoItem().getTitle()+ "   Is it assigned?: "+todoItemTask.isAssigned()+ "   Who is the assignee?: " + todoItemTask.getAssignee().getFirstName();
//        System.out.println(summary); // printing out to see if it matches
//        assertEquals(summary,todoItemTask.getSummary());
//    }


}