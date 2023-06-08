package com.codeclan.betterbooks.repositories;

import com.codeclan.betterbooks.models.DescriptiveTag;
import org.hamcrest.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import com.codeclan.betterbooks.models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthorsId(Long id);
    List<Book> findByIllustratorsId(Long id);
    List<Book> findByBookEntriesId(Long id);
//    List<Book> findByDescriptions(DescriptiveTag descriptiveTag);





}
