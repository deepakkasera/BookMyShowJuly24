package com.scaler.bookmyshowjuly24.services;

import com.scaler.bookmyshowjuly24.models.User;
import com.scaler.bookmyshowjuly24.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String name, String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        User savedUser = null;

        if (optionalUser.isPresent()) {
            //Call the login function.
        } else {
            //Create a User object and save to DB.
            User user = new User();
            user.setName(name);
            user.setEmail(email);

            //BCryptPasswordEncoder.
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setPassword(bCryptPasswordEncoder.encode(password));

            savedUser = userRepository.save(user);
        }

        return savedUser;
    }
}
