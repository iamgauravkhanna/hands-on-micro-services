package com.hands_on_microservices.repositories;

import com.hands_on_microservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
