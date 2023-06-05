package com.codeclan.betterbooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeclan.betterbooks.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
