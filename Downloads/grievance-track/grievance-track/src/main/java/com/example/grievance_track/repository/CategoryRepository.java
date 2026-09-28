package com.example.grievance_track.repository;

import com.example.grievance_track.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}