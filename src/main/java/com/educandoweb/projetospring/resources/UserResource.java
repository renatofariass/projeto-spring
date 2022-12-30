package com.educandoweb.projetospring.resources;

import com.educandoweb.projetospring.entities.User;
import com.educandoweb.projetospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id)  {
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
