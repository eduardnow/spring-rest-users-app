package com.eduardnow.acl.controllers.users;

import com.eduardnow.acl.entitites.User;
import com.eduardnow.acl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserDeleteController {

    private final UserService userService;

    @Autowired
    public UserDeleteController(UserService userService) {
        this.userService = userService;
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<User> handler(@PathVariable("username") String username) {
        userService.delete(username);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
