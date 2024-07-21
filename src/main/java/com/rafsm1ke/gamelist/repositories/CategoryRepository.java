package com.rafsm1ke.gamelist.repositories;

import com.rafsm1ke.gamelist.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
