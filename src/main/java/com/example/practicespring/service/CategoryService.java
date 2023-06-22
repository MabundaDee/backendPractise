package com.example.practicespring.service;

import com.example.practicespring.models.Category;
import com.example.practicespring.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(Category category) {
        categoryRepo.save(category);
    }
    public List<Category> listCategory (){
        return categoryRepo.findAll();
    }
}
