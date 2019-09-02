package pl.jacob_the_liar.fun_home_help.api;


import org.springframework.data.repository.CrudRepository;
import pl.jacob_the_liar.fun_home_help.classes.User;

import java.rmi.server.UID;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-09-02 20:35
 * *
 * @className: UserRepository
 * *
 * *
 ******************************************************/
public interface UserRepository extends CrudRepository<User, Integer>{


    User findByUid(UID uid);

}
