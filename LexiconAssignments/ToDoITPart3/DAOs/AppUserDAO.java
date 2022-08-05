package LexiconAssignments.ToDoIT.DAOs;

import java.util.Collection;

public interface  AppUserDAO <AppUser>{

    //add new AppUser.class object to collection
    AppUser persist(AppUser appUser);


    //returns single AppUser.class object
    AppUser findByUsername(String username);


    //returns all AppUser.class objects
    Collection<AppUser> findAll();


    //remove one AppUser.class object from collection
    void remove(String username);

}
