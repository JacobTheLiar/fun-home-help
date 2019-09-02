package pl.jacob_the_liar.fun_home_help.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jacob_the_liar.fun_home_help.classes.User;


import java.rmi.server.UID;
import java.util.Optional;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-09-02 20:43
 * *
 * @className: UserService
 * *
 * *
 ******************************************************/
@Service
public class UserService{
    
    @Autowired
    private UserRepository userRepository;
    
    public User registerUser(User newUser){
        userRepository.save(newUser);
        return newUser;
    }
    
    public User updateUserData(UID userUID, User newUser){
        userRepository.save(newUser);
        return newUser;
    }
    
    
    public void deleteUser(UID userUID){
        User userToDelete = userRepository.findByUid(userUID);
        if (Optional.ofNullable(userToDelete).isPresent()){
            userRepository.delete(userToDelete);
        }
    }
    
}
