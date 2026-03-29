package com.pradhuman.taskmanager.service;

import com.pradhuman.taskmanager.model.User;
import com.pradhuman.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    // ✅ REGISTER
    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // ✅ LOGIN
    public String login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);

        if (user.isPresent() && encoder.matches(password, user.get().getPassword())) {
            return "SUCCESS";
        }
        return "FAIL";
    }

    // ✅ GET ALL
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}