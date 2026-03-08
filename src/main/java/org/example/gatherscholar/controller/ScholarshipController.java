package org.example.gatherscholar.controller;

import org.example.gatherscholar.entity.Scholarship;
import org.example.gatherscholar.logic.ScholarshipLogic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scholarships")
public class ScholarshipController {

    private final ScholarshipLogic scholarshipLogic;

    public ScholarshipController(ScholarshipLogic scholarshipLogic) {
        this.scholarshipLogic = scholarshipLogic;
    }

    @GetMapping
    public List<Scholarship> getAllScholarships() {
        return scholarshipLogic.getAllScholarships();
    }

    @PostMapping
    public Scholarship createScholarship(@RequestBody Scholarship scholarship) {
        return scholarshipLogic.saveScholarship(scholarship);
    }

    @GetMapping("/country/{country}")
    public List<Scholarship> getByCountry(@PathVariable String country) {
        return scholarshipLogic.getByCountry(country);
    }

    @GetMapping("/provider/{provider}")
    public List<Scholarship> getByProvider(@PathVariable String provider) {
        return scholarshipLogic.getByProvider(provider);
    }

    @GetMapping("/search")
    public List<Scholarship> searchByName(@RequestParam String name) {
        return scholarshipLogic.searchByName(name);
    }

    @GetMapping("/{id}")
    public Scholarship getScholarshipById(@PathVariable Long id) {
        return scholarshipLogic.getScholarshipById(id);
    }

    @PutMapping("/{id}")
    public Scholarship updateScholarship(@PathVariable Long id, @RequestBody Scholarship scholarship) {
        return scholarshipLogic.updateScholarship(id, scholarship);
    }

    @DeleteMapping("/{id}")
    public void deleteScholarship(@PathVariable Long id) {
        scholarshipLogic.deleteScholarship(id);
    }
}
