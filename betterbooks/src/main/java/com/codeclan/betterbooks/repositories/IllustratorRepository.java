package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.people.Illustrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IllustratorRepository extends JpaRepository<Illustrator, Long> {
}
