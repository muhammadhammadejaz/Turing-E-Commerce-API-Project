package com.example.turingecommerceapiproject.repositories;

import com.example.turingecommerceapiproject.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
