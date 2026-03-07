package org.example.gatherscholar.repository;

import org.example.gatherscholar.entity.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScholarshipRepository extends JpaRepository<Scholarship, Long> {

    List<Scholarship> findByCountry(String country);
    List<Scholarship> findByProvider(String provider);
    List<Scholarship> findByNameContaining(String name);
}
