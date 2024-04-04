package com.meows.sir.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/")
    String getUsers() {
        return "hello person and the kitty";
    }
}
