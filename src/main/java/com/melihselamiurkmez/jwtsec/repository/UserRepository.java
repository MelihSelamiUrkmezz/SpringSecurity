package com.melihselamiurkmez.jwtsec.repository;

import com.melihselamiurkmez.jwtsec.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);



}
