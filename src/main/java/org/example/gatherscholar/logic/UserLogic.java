package org.example.gatherscholar.logic;

import org.example.gatherscholar.entity.User;
import org.example.gatherscholar.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogic {

    private final UserRepository userRepository;

    public UserLogic(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
