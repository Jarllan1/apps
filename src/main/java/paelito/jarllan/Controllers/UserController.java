package paelito.jarllan.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import paelito.jarllan.Model.UserModel;

@RestController
public class UserController {
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "Jeven 11", "Jeven.11@email.com", "123123");

    }
}
