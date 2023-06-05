package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.people.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
