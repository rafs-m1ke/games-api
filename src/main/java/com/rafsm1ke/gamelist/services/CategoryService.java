package com.rafsm1ke.gamelist.services;

import com.rafsm1ke.gamelist.models.Category;
import com.rafsm1ke.gamelist.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category addCategory(Category category) {
        return repository.save(category);
    }

    public Category findById(String id) {
        return repository.findById(id).get();
    }

    public List<Category> findAll() {
        return repository.findAll();
    }
}
