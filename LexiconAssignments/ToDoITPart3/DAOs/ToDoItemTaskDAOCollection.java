package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.Sequencers.ToDoItemTaskIdSequencer;
import LexiconAssignments.ToDoIT.TodoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoItemTaskDAOCollection implements  TodoItemTaskDAO{

    Collection<TodoItemTask> todoItemTasks = new ArrayList<>();
    TodoItemTask todoItemTask1 = new TodoItemTask();

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        todoItemTask.setId(ToDoItemTaskIdSequencer.nextId());
       todoItemTasks.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {
        if(todoItemTasks.iterator().next().getId() == id)
        return todoItemTasks.iterator().next();
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return todoItemTasks;
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean assigned) {
        List<TodoItemTask> collect = todoItemTasks.stream()
                .filter(todoItemTask -> todoItemTask.isAssigned())
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        Collection<TodoItemTask> newList = new ArrayList<>();
        for (TodoItemTask todoItemTask : todoItemTasks)
        if(todoItemTask.getId() == personId)
            newList.add(todoItemTask);
            return newList;
    }

    @Override
    public void remove(int id) {
    todoItemTasks.remove(id);
    }


}
