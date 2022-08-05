package LexiconAssignments.ToDoIT;

import LexiconAssignments.ToDoIT.DAOs.AppUserDAOCollection;
import LexiconAssignments.ToDoIT.DAOs.PersonDAOCollection;
import LexiconAssignments.ToDoIT.DAOs.ToDoItemDAOCollection;
import LexiconAssignments.ToDoIT.DAOs.ToDoItemTaskDAOCollection;
import LexiconAssignments.ToDoIT.Sequencers.ToDoItemIdSequencer;
import LexiconAssignments.ToDoIT.Sequencers.ToDoItemTaskIdSequencer;

import java.time.LocalDate;

public class ToDoMain {

    public static void main(String[] args) {
        //Testing Person.class
        Person person1 = new Person(1);
        Person person2 = new Person(2);

        person1.setFirstName("Husayn");
        person1.setLastName("Ganiev");
        person1.setEmail("husan254@gmail.com");
        System.out.println(person1.toString());

        person2.setFirstName("Husayn");
        person2.setLastName("Ganiev");
        person2.setEmail("husan254@gmail.com");
        System.out.println(person2.toString());
        System.out.println(person1.getId());

        //ToDoItem test
        TodoItem item1 = new TodoItem();
        TodoItem item2 = new TodoItem();
        item1.setDeadline(LocalDate.of(2022, 06, 24));  //sets deadline date
        System.out.println(item1.getDeadline());
        item1.setCreator(person1);
        item1.setTitle("Project ToDoIT");
        item2.setTaskDescription("Working with OOP");
        item2.setTitle("Working with OOP");
        item1.setDone(false);
        item2.setDeadline(LocalDate.of(2023, 06, 24));
        System.out.println(item1.toString());
        System.out.println(item2.getId());
        System.out.println(item1.getId());


        //ToDOItemTask test
        TodoItemTask task1 = new TodoItemTask();
        task1.setAssigned(true);
        task1.setAssignee(person1);
        task1.setTodoItem(item1);
        System.out.println("\n"+task1.toString());

        TodoItemTask todoItemTask2 = new TodoItemTask();
        todoItemTask2.setTodoItem(item2);
        todoItemTask2.setAssignee(person2);
        todoItemTask2.setAssigned(true);



        AppUser accForHusayn = new AppUser("Husayn", "dsfaqr", AppRole.ROLE_APP_ADMIN);

        Person person = new Person(1,"Husayn", "Ganiev", "huahasd", accForHusayn );

        System.out.println(person1.equals(person2));
        System.out.println(task1.hashCode());


        PersonDAOCollection personDAOCollection =  PersonDAOCollection.getInstance();
        personDAOCollection.persist(person);
        personDAOCollection.persist(person2);
        System.out.println(personDAOCollection.findAll());
        System.out.println(personDAOCollection.findById(1));
        System.out.println(personDAOCollection.findByEmail("huahasd"));




        AppUserDAOCollection appUserDAOCollection = new AppUserDAOCollection();
        appUserDAOCollection.persist(accForHusayn);
        System.out.println(appUserDAOCollection.findByUsername("Husayn"));
        appUserDAOCollection.remove("Husayn");
        //System.out.println(appUserDAOCollection.findAll());

        ToDoItemIdSequencer toDoItemIdSequencer = new ToDoItemIdSequencer();
        ToDoItemIdSequencer.setCurrentId(11);

        ToDoItemDAOCollection toDoItemDAOCollection = new ToDoItemDAOCollection();
        toDoItemDAOCollection.persist(item1);
        toDoItemDAOCollection.persist(item2);
        System.out.println("findAllByDoneStatus: "+toDoItemDAOCollection.findAllByDoneStatus(false));
        System.out.println("With the same title: "+toDoItemDAOCollection.findByTitleContains("Project ToDoIT"));
        System.out.println("With the same Id: "+toDoItemDAOCollection.findById(12));
        System.out.println("By personId: "+toDoItemDAOCollection.findByPersonId(2));
        System.out.println("All: "+toDoItemDAOCollection.findAll());
        System.out.println("findByDeadLineBefore: "+toDoItemDAOCollection.findByDeadlineBefore(LocalDate.of(2022,06,25)));
        System.out.println("findByDeadLineAfter: "+toDoItemDAOCollection.findByDeadlineAfter(LocalDate.now()));
        toDoItemDAOCollection.remove(item1);
        System.out.println("After removing: "+toDoItemDAOCollection.findAll());


        ToDoItemTaskDAOCollection toDoItemTaskDAOCollection = new ToDoItemTaskDAOCollection();
        System.out.println(toDoItemTaskDAOCollection.persist(todoItemTask2));
        toDoItemTaskDAOCollection.persist(task1);
        System.out.println("findAll: " + toDoItemTaskDAOCollection.findAll());
        ToDoItemTaskIdSequencer toDoItemTaskIdSequencer = new ToDoItemTaskIdSequencer();
        ToDoItemTaskIdSequencer.setCurrentId(102);
        System.out.println("findById: "+toDoItemTaskDAOCollection.findById(11));
        System.out.println("findByPersonId: "+toDoItemTaskDAOCollection.findByPersonId(1));
        System.out.println("findByAssignedStatus: "+toDoItemTaskDAOCollection.findByAssignedStatus(false));

    }
}
