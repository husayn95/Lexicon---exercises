package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemDAO {

    //add new TodoItem.class object to collection
    TodoItem persist(TodoItem todoItem);

    //returns single TodoItem.class object
    TodoItem findById(int id);

    //returns all TodoItem.class objects
    Collection<TodoItem> findAll();

    //findAllByDoneStatus: returns many TodoItem.class objects where status match
    Collection<TodoItem> findAllByDoneStatus(boolean done);

    //findByTitleContains: returns many TodoItem.class objects where title match.
    Collection<TodoItem> findByTitleContains(String title);

    //findByPersonId: returns many TodoItem.class objects where personId match todoItem.creator.id
    Collection<TodoItem> findByPersonId(int personId);

    //findByDeadlineBefore: returns many TodoItem.class objects where date is before deadline
    Collection<TodoItem> findByDeadlineBefore(LocalDate date);

    //findByDeadlineAfter: returns many TodoItem.class objects where date is after deadline
    Collection<TodoItem> findByDeadlineAfter(LocalDate date);

    //remove: remove one TodoItem.class object from collection
    void remove(TodoItem toBeRemoved);



}
