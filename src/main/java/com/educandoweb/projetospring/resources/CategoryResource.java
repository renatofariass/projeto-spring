package com.educandoweb.projetospring.resources;

import com.educandoweb.projetospring.entities.Category;
import com.educandoweb.projetospring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    CategoryService service;
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id)  {
        Category category = service.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
