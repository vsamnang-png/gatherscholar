package org.example.gatherscholar.logic;

import org.example.gatherscholar.entity.Mentor;
import org.example.gatherscholar.repository.MentorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorLogic {

    private final MentorRepository mentorRepository;

    public MentorLogic(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }
}
