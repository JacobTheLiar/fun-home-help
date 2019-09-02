package pl.jacob_the_liar.fun_home_help.classes;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.rmi.server.UID;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-09-02 19:47
 * *
 * @className: User
 * *
 * *
 ******************************************************/
@Entity(name = "user")
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;
    
    @NotNull
    @Column(name = "name")
    private String name;
    
    @NotNull
    @Column(name = "email")
    private String email;
    
    @NotNull
    @Column(name = "password")
    private String password;
    
    @NotNull
    @Column(name = "uid")
    private UID uid;
    
    
    public User(@NotNull String name, @NotNull String email, @NotNull String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.uid = new UID();
    }
    
    
    @Override
    public String toString(){
        return "User{" + "userId=" + userId + ", userName='" + name + '\'' + ", email='" + email + '\'' + ", userPassword='" + password + '\'' + ", userUID=" + uid + '}';
    }
    
    
    public int getUserId(){
        return userId;
    }
    
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    
    public String getName(){
        return name;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public String getEmail(){
        return email;
    }
    
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    public String getPassword(){
        return password;
    }
    
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
    public UID getUid(){
        return uid;
    }
 
}
