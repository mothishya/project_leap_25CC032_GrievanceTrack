package com.example.grievance_track.service;

import com.example.grievance_track.entity.Grievance;
import com.example.grievance_track.repository.GrievanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrievanceService {

    private final GrievanceRepository grievanceRepository;

    public GrievanceService(GrievanceRepository grievanceRepository) {
        this.grievanceRepository = grievanceRepository;
    }

    public Grievance saveGrievance(Grievance grievance) {
        return grievanceRepository.save(grievance);
    }

    public List<Grievance> getAllGrievances() {
        return grievanceRepository.findAll();
    }

    public Grievance getGrievanceById(Long id) {
        return grievanceRepository.findById(id).orElse(null);
    }

    public void deleteGrievance(Long id) {
        grievanceRepository.deleteById(id);
    }
}