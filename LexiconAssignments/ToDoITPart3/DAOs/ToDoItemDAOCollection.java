package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.Sequencers.ToDoItemIdSequencer;
import LexiconAssignments.ToDoIT.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoItemDAOCollection implements  ToDoItemDAO{

    Collection<TodoItem> todoItems = new LinkedList<>();



    TodoItem todoItem = new TodoItem();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItem.setId(ToDoItemIdSequencer.nextId());
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        while (todoItems.iterator().hasNext())
        if(todoItems.iterator().next().getId() == id)
        return todoItems.iterator().next();
        else throw new IllegalArgumentException("No such id found!");
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
            Collection<TodoItem>  newList = new ArrayList<>();
            for (TodoItem todoItem1 : todoItems)
                if(todoItem1.isDone() == done)
                    newList.add(todoItem1);

//        while (todoItems.iterator().hasNext())
//        if (todoItems.iterator().next().isDone() == done)
//            newList.add(todoItems.iterator().next());
        return newList;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
       //Collection<TodoItem>  newList = new ArrayList<>();
//                for (TodoItem value : todoItems)
//                    if(value.getTitle().equals(title))
//                    newList.add(value);

        //using stream / declarative method
        List<TodoItem> collect = todoItems.stream().filter(todoItem -> todoItem.getTitle().equals(title))
                .collect(Collectors.toList());

        // System.out.println(todoItems);
                return collect;

    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
       // PersonIdSequencer personIdSequencer;
        //Collection<TodoItem>  newList = new ArrayList<>();
        List<TodoItem> collect = todoItems.stream().filter(value -> value.getId() == personId)
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {

//        List<TodoItem> collect = todoItems.stream().filter(value -> value.getDeadline().isBefore(date))
//                .collect(Collectors.toList());
//        return collect;
        Collection<TodoItem>  newList = new ArrayList<>();
        for (TodoItem todoItem1 : todoItems)
            if(todoItem1.getDeadline().isBefore(date))
                newList.add(todoItem1);
        return newList;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        List<TodoItem> collect = todoItems.stream().filter(value -> value.getDeadline().isAfter(date))
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public void remove(TodoItem toBeRemoved) {
    todoItems.remove(toBeRemoved);
    }
}
