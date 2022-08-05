package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.AppRole;
import LexiconAssignments.ToDoIT.AppUser;
import LexiconAssignments.ToDoIT.Person;
import LexiconAssignments.ToDoIT.Sequencers.PersonIdSequencer;

import java.util.Collection;
import java.util.HashSet;

public class PersonDAOCollection implements PersonDAO{

    Collection<Person> persons = new HashSet<>();

    // add singleton design pattern
    //Singleton class pattern
    private static PersonDAOCollection instance = new PersonDAOCollection();

    private  PersonDAOCollection(){
        System.out.println("Hello");
    }

    public  static PersonDAOCollection getInstance(){
        return instance;
    }



    Person person = new Person(1, "Husayn", "Ganiev", "husan254@gmail.com",
            new AppUser("husayn95","123456", AppRole.ROLE_APP_USER));

    @Override
    public Person persist(Person person) {
        person.setId(PersonIdSequencer.nextId());
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        // traverse thorugh for each
        // if condition
        //
        while (persons.iterator().hasNext())
        if(id == persons.iterator().next().getId() )
            return persons.iterator().next();
        else throw new IllegalArgumentException("No such Person!");
return null;
    }

    @Override
    public Person findByEmail(String email) {
        while (persons.iterator().hasNext())
        if(persons.iterator().next().getEmail().equals(email))
        return persons.iterator().next();
        else throw new IllegalArgumentException("No such Person with that email");
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(Person byId) {
        persons.remove(byId);
    }
}
