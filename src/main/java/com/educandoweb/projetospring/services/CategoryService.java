package com.educandoweb.projetospring.services;

import com.educandoweb.projetospring.entities.Category;
import com.educandoweb.projetospring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository orderRepository;

    public List<Category> findAll() {
        return orderRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> order = orderRepository.findById(id);
        return order.get();
    }
}
