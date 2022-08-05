package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {
    //persist: add new TodoItemTask.class object to collection
    TodoItemTask persist(TodoItemTask todoItemTask);

    //findById: returns single TodoItemTask.class object
    TodoItemTask findById(int id);

    //findAll: return all TodoItemTask.class objects
    Collection<TodoItemTask> findAll();


    //findByAssignedStatus: return all TodoItemTask.class objects where assigned matches status
    Collection<TodoItemTask> findByAssignedStatus(boolean assigned);

    //findByPersonId: return all TodoItemTask.class objects where todoItemTask.assignee.id matches personId
    Collection<TodoItemTask> findByPersonId(int personId);

    //remove: removes one TodoItemTask.class object from collection
    void remove(int id);

}
