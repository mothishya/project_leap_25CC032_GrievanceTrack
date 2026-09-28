package com.example.grievance_track.repository;

import com.example.grievance_track.entity.Escalation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscalationRepository extends JpaRepository<Escalation, Long> {
}