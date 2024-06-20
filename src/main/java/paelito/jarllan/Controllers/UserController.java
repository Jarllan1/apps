package paelito.jarllan.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import paelito.jarllan.Model.UserModel;

@RestController
public class UserController {
   
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "Jeven 11", "Jeven.11@email.com", "123123");

    }
    //fetch multiple  data
    //http://localhost:8080/users
    @GetMapping("/users")
    public List <UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1, "Paelito", "Paelito@gmail.com", "1234567"));
        users.add(new UserModel(2, "Pepito", "Pepito@gmail.com", "12345678"));
        users.add(new UserModel(3, "Papi", "Papi@gmail.com", "123456789"));
        return users;
    }
    //  
    @GetMapping("/user/{name}")
    public UserModel getUserFromName(@PathVariable("name")String name){
        return new UserModel(1, "paelito", "Paelito@gmail.com", "1234567");
    }
}
