package com.codeclan.betterbooks;



import com.codeclan.betterbooks.models.Bookshelf;
import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.codeclan.betterbooks.models.people.User;
import com.codeclan.betterbooks.models.Book;


import com.codeclan.betterbooks.repositories.*;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;


@SpringBootTest
class BetterbooksApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	IllustratorRepository illustratorRepository;

	@Autowired
	BookshelfRepository bookshelfRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void canSaveUser(){
		User user = new User("Tim", "Collins","url.com", "Tim is a man.");
		userRepository.save(user);
	}
	@Test
	public void canSaveAuthor(){
		Author author = new Author("Sally", "Collins","url.com", "Sally is an author.");
		authorRepository.save(author);
	}
	@Test
	public void canSaveIllustrator(){
		Illustrator illustrator = new Illustrator("Quentin", "Blake","url.com", "Quentin is an artist.");
		illustratorRepository.save(illustrator);
	}
	@Test
	public void canSaveBook(){
		Author author = new Author("Sally", "Collins","url.com", "Sally is an author.");
		Illustrator illustrator = new Illustrator("Quentin", "Blake","url.com", "Quentin is an artist.");
		LocalDate date = LocalDate.of(1985, 4, 20);
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, "Board Book", date, "HarperCollins", "9781233458756", "url.com");
		book.setDatePublished(date);
		bookRepository.save(book);
	}

	@Test
	public void canAddToBookshelf(){
		Author author = new Author("Sally", "Collins","url.com", "Sally is an author.");
		Illustrator illustrator = new Illustrator("Quentin", "Blake","url.com", "Quentin is an artist.");
		LocalDate date = LocalDate.of(1985, 4, 20);
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, "Board Book", date, "HarperCollins", "9781233458756", "url.com");
		book.setDatePublished(date);
		bookRepository.save(book);book = new Book("The Lovely Horse", "Horse goes on adventure", 20, "Board Book", date, "HarperCollins", "9781233458756", "url.com");
		Bookshelf bookshelf = new Bookshelf("Tim's Books", book);
		bookshelfRepository.save(bookshelf);
	}
}
