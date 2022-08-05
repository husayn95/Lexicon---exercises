package LexiconAssignments.ToDoIT;

import LexiconAssignments.ToDoIT.DAOs.PersonDAOCollection;
import LexiconAssignments.ToDoIT.DAOs.ToDoItemDAOCollection;
import LexiconAssignments.ToDoIT.DAOs.ToDoItemTaskDAOCollection;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        Person personTest = new Person();

        Person person= new Person();
        AppUser appUser = new AppUser("huasyn95", "12346", AppRole.ROLE_APP_USER);

        person.setEmail("husan254@gmail.com");
        person.setCridentials(appUser);
        person.setFirstName("Husayn");
        person.setLastName("Ganiev");
        //System.out.println(person.toString());
        PersonDAOCollection personDAOCollection = PersonDAOCollection.getInstance();
        personDAOCollection.persist(person);
        AppUser appUser1 = new AppUser("Mehrdad", "javan", AppRole.ROLE_APP_ADMIN);
        Person person1 = new Person("Mehrdad", "Javan", "adas@",appUser1);
        personDAOCollection.persist(person1);

        PersonDAOCollection personDAOCollection1 = PersonDAOCollection.getInstance();
        Person person3 = new Person("Mehrdad", "Javan", "adas@",appUser1);
        personDAOCollection1.persist(person3);

        System.out.println(personDAOCollection1.findAll());

        TodoItem todoItem = new TodoItem();
        TodoItem todoItem1 = new TodoItem();
        ToDoItemDAOCollection toDoItemDAOCollection = new ToDoItemDAOCollection();
        toDoItemDAOCollection.persist(todoItem);
        toDoItemDAOCollection.persist(todoItem);

        System.out.println(toDoItemDAOCollection.findAll());

        TodoItemTask todoItemTask = new TodoItemTask();
        TodoItemTask todoItemTask1 = new TodoItemTask();
        ToDoItemTaskDAOCollection toDoItemTaskDAOCollection = new ToDoItemTaskDAOCollection();
        toDoItemTaskDAOCollection.persist(todoItemTask);
        toDoItemTaskDAOCollection.persist(todoItemTask1);
        System.out.println(toDoItemTaskDAOCollection.findAll());



        JsonUtil jsonUtil = new JsonUtil();
        File file = new File("objectTOJSon"); //Write to Json
        List<AppUser> list = new ArrayList<>();
        list.add(appUser);
        jsonUtil.serializeListOfAppuser(list,file);
        System.out.println(list);


            ObjectMapper mapper = new ObjectMapper();
            Path paths = Paths.get("objectTOJSon");
            String s = paths.toString();
            System.out.println(s);
            File file1 = new File("objectTOJSon");
            jsonUtil.deserializeAppUser(file1);


           PropertiesUtil.writeToPropertiesFile();
           PropertiesUtil.readFromPropertiesFile();


    }
}
