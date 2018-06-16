package main.jwt.repository;

import main.jwt.entities.ApplicationUser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sherif on 6/1/2018.
 */

public class ApplicationUserRepository  {

    private Map<String,ApplicationUser> users = new HashMap<>();

    public ApplicationUser findByUsername(String username){
        return users.get(username);
    };

    public void save(ApplicationUser user){
        if (users.get(user.getUsername())==null)
        users.put(user.getUsername(),user);
    }

}
