package com.example.turingecommerceapiproject.service;

import com.example.turingecommerceapiproject.model.Category;
import com.example.turingecommerceapiproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Object[] getCategories()
    {
        Iterable<Category> iterable = categoryRepository.findAll();
        List<Category> categories = new ArrayList<>();
        iterable.forEach(categories::add);
        return categories.toArray();
    }


}
