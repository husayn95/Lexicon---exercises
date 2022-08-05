package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.Person;

import java.util.Collection;

public interface PersonDAO {

    //add new Person.class object to collection
    Person persist(Person person);

    //returns single Person.class object
    Person findById(int id);

    //returns single Person.class object
    Person findByEmail(String email);

    //returns all Person.class objects
    Collection<Person> findAll();

    //remove one Person.class object from collection
    void remove(Person id);
}
