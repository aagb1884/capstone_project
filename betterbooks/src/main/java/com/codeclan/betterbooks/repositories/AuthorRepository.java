package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.people.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
