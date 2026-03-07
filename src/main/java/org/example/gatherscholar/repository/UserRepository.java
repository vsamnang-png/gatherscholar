package org.example.gatherscholar.repository;

import org.example.gatherscholar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
