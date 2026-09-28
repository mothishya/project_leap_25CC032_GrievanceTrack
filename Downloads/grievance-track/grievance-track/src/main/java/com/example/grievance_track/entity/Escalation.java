package com.example.grievance_track.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "escalations")
public class Escalation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reason;

    private String status;

    @OneToOne
    @JoinColumn(name = "grievance_id")
    private Grievance grievance;

    public Escalation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Grievance getGrievance() {
        return grievance;
    }

    public void setGrievance(Grievance grievance) {
        this.grievance = grievance;
    }
}