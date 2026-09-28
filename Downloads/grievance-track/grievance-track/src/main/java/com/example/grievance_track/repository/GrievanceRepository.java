package com.example.grievance_track.repository;

import com.example.grievance_track.entity.Grievance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
}