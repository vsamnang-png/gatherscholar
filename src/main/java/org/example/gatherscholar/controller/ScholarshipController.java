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
}
