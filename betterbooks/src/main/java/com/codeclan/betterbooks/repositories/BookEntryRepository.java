package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.BookEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookEntryRepository extends JpaRepository<BookEntry, Long> {

    List<BookEntry> findByUserId(Long id);
    List<BookEntry> findByBookId(Long id);

//    List<BookEntry> findByBook Author(String title);
//    List<BookEntry> findByBook Illustrator(String title);
}
