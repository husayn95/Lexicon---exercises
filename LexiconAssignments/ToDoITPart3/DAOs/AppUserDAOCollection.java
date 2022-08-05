package LexiconAssignments.ToDoIT.DAOs;

import LexiconAssignments.ToDoIT.AppUser;

import java.util.Collection;
import java.util.HashSet;

public class AppUserDAOCollection  implements AppUserDAO <AppUser>{

    Collection<AppUser> appUsers = new HashSet<>();


    //AppUser appUser = new AppUser("husayn95","123456", AppRole.ROLE_APP_USER);

    @Override
    public AppUser persist(AppUser appUser) {
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        while (appUsers.iterator().hasNext())
        if (appUsers.iterator().next().getUsername().equals(username))
        return appUsers.iterator().next();
    else throw new IllegalArgumentException("NO SUCH USER FOUND WITH THAT USERNAME!");
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        if(appUsers.iterator().hasNext())
        return appUsers;
        else throw new IllegalArgumentException("No objects found!");
    }

    @Override
    public void remove(String username) {
        while (appUsers.iterator().hasNext())
            if (appUsers.iterator().next().getUsername().equals(username))
        appUsers.remove(appUsers.iterator().next());
    }
}
