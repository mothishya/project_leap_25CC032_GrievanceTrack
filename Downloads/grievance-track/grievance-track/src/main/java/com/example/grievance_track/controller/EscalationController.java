package com.example.grievance_track.controller;

import com.example.grievance_track.entity.Escalation;
import com.example.grievance_track.service.EscalationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/escalations")
public class EscalationController {

    private final EscalationService escalationService;

    public EscalationController(EscalationService escalationService) {
        this.escalationService = escalationService;
    }

    @PostMapping
    public Escalation createEscalation(@RequestBody Escalation escalation) {
        return escalationService.saveEscalation(escalation);
    }

    @GetMapping
    public List<Escalation> getAllEscalations() {
        return escalationService.getAllEscalations();
    }

    @GetMapping("/{id}")
    public Escalation getEscalationById(@PathVariable Long id) {
        return escalationService.getEscalationById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEscalation(@PathVariable Long id) {
        escalationService.deleteEscalation(id);
        return "Escalation deleted successfully";
    }
}