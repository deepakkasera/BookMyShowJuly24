package com.scaler.bookmyshowjuly24.repositories;

import com.scaler.bookmyshowjuly24.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //select * form users where id = 10;

    @Override
    Optional<User> findById(Long userId);

    Optional<User> findByEmail(String email);

    @Override
    User save(User user);
}
