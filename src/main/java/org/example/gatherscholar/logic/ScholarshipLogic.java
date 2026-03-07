package org.example.gatherscholar.logic;

import org.example.gatherscholar.entity.Scholarship;
import org.example.gatherscholar.repository.ScholarshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScholarshipLogic {

    private final ScholarshipRepository scholarshipRepository;

    public ScholarshipLogic (ScholarshipRepository scholarshipRepository) {
        this.scholarshipRepository = scholarshipRepository;
    }

    public List<Scholarship> getAllScholarships() {
        return scholarshipRepository.findAll();
    }

    public Scholarship saveScholarship(Scholarship scholarship) {
        return scholarshipRepository.save(scholarship);
    }

    public List<Scholarship> getByCountry(String country) {
        return scholarshipRepository.findByCountry(country);
    }

    public List<Scholarship> getByProvider(String provider) {
        return scholarshipRepository.findByProvider(provider);
    }

    public List<Scholarship> searchByName(String name) {
        return scholarshipRepository.findByNameContaining(name);
    }

    public Scholarship getScholarshipById(Long id) {
        return scholarshipRepository.findById(id).orElse(null);
    }
}
