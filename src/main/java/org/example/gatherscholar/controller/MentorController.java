package org.example.gatherscholar.controller;

import org.example.gatherscholar.entity.Mentor;
import org.example.gatherscholar.logic.MentorLogic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentors")
public class MentorController {

    private final MentorLogic mentorLogic;

    public MentorController(MentorLogic mentorLogic) {
        this.mentorLogic = mentorLogic;
    }

    @GetMapping
    public List<Mentor> getAllMentors() {
        return mentorLogic.getAllMentors();
    }

    @PostMapping
    public Mentor createMentor(@RequestBody Mentor mentor) {
        return mentorLogic.saveMentor(mentor);
    }
}
