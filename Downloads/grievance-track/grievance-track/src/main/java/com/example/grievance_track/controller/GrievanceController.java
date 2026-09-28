package com.example.grievance_track.controller;

import com.example.grievance_track.entity.Grievance;
import com.example.grievance_track.service.GrievanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grievances")
public class GrievanceController {

    private final GrievanceService grievanceService;

    public GrievanceController(GrievanceService grievanceService) {
        this.grievanceService = grievanceService;
    }

    @PostMapping
    public Grievance createGrievance(@RequestBody Grievance grievance) {
        return grievanceService.saveGrievance(grievance);
    }

    @GetMapping
    public List<Grievance> getAllGrievances() {
        return grievanceService.getAllGrievances();
    }

    @GetMapping("/{id}")
    public Grievance getGrievanceById(@PathVariable Long id) {
        return grievanceService.getGrievanceById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteGrievance(@PathVariable Long id) {
        grievanceService.deleteGrievance(id);
        return "Grievance deleted successfully";
    }
}