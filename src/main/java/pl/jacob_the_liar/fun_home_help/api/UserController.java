package pl.jacob_the_liar.fun_home_help.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jacob_the_liar.fun_home_help.classes.User;

import java.rmi.server.UID;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-09-02 20:49
 * *
 * @className: UserController
 * *
 * *
 ******************************************************/
@RestController
public class UserController{

    @Autowired
    private UserService userService;
    
    @RequestMapping(method = RequestMethod.POST, value = "/user/register")
    public User registerNewUser(@RequestBody User newUser){
        userService.registerUser(newUser);
        return newUser;
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/user/unregister/{uid}")
    public void unregisterUser(@PathVariable UID uid){
        userService.deleteUser(uid);
    }
    
    
}
