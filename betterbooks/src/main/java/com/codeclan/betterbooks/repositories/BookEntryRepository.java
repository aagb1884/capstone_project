package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.BookEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookEntryRepository extends JpaRepository<BookEntry, Long> {
}
