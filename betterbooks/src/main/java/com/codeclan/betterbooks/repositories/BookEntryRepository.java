package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.BookEntry;
import com.codeclan.betterbooks.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookEntryRepository extends JpaRepository<BookEntry, Long> {

    List<BookEntry> findByUserId(Long id);
    List<BookEntry> findByBookId(Long id);
    List<BookEntry> findByUserIdAndStatus(Long id, Status status);
//    List<BookEntry> findByUserIdAndBookshelf
//    List<BookEntry> findByBook Author(String title);
//    List<BookEntry> findByBook Illustrator(String title);
}
