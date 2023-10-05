package com.misl.khabarwala.pos.repository;

import com.misl.khabarwala.pos.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface CategoryRepository extends RevisionRepository<Category,Long,Long>,JpaRepository<Category,Long> {
}
