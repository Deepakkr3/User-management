package com.example.demo.controll;

import com.example.demo.model.Userc;
import com.example.demo.service.EmailHandler;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<Userc> users(){
        return userService.users();
       // return "kjnjkvjdhvbvjikvn";

    }
    @PostMapping("/users")
    public Userc addUser(@RequestBody  @Valid Userc user ){
        return userService.addUser(user);
        //return new Userc(3,"knjjkvn","jfer","okmfk");

    }
    @GetMapping("/{email}")
    public void sendEmail(@PathVariable String email){
        EmailHandler.sendEmail(email,"mail from cyber eviolve","hyy there what is going on");
    }


}
