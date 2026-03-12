package org.example.gatherscholar.repository;

import org.example.gatherscholar.entity.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScholarshipRepository extends JpaRepository<Scholarship, Long> {

    List<Scholarship> findByCountryIgnoreCase(String country);
    List<Scholarship> findByProvider(String provider);
    List<Scholarship> findByNameContainingIgnoreCase(String name);
    List<Scholarship> findByLevel(String level);
    List<Scholarship> findByAmount(String amount);
    List<Scholarship> findByPercent(String percent);
}
