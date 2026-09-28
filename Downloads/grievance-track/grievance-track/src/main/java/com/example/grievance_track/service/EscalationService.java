package com.example.grievance_track.service;

import com.example.grievance_track.entity.Escalation;
import com.example.grievance_track.repository.EscalationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscalationService {

    private final EscalationRepository escalationRepository;

    public EscalationService(EscalationRepository escalationRepository) {
        this.escalationRepository = escalationRepository;
    }

    public Escalation saveEscalation(Escalation escalation) {
        return escalationRepository.save(escalation);
    }

    public List<Escalation> getAllEscalations() {
        return escalationRepository.findAll();
    }

    public Escalation getEscalationById(Long id) {
        return escalationRepository.findById(id).orElse(null);
    }

    public void deleteEscalation(Long id) {
        escalationRepository.deleteById(id);
    }
}