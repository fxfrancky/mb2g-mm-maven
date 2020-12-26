package guru.springframework.controller;

import guru.springframework.entities.User;
import guru.springframework.webapi.UserCommand;

public class UserController {

    User saveUser(UserCommand command){

        //fake impl
        return new User();

   }
}
