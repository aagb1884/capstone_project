package com.codeclan.betterbooks;



import com.codeclan.betterbooks.models.*;
import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.codeclan.betterbooks.models.people.User;


import com.codeclan.betterbooks.repositories.*;
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
	BookEntryRepository bookEntryRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void canSaveUser(){
		User user = new User("Tim", "Collis", "imgurl", "I am a man called Tim.");
		userRepository.save(user);
	}
	@Test
	public void canSaveAuthor(){
		Author author = new Author("Sally", "Collins","url.com", "Sally is an author.");
		authorRepository.save(author);
	}
	@Test
	public void canAddBookEntry(){
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		User user = new User("Tim", "Collis", "imgurl", "I am a man called Tim.");
		BookEntry bookEntry = new BookEntry(book, user, "01/06/2023", "04/06/2023", 5, Status.HAVEREAD);
		bookEntryRepository.save(bookEntry);
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
		User user = new User("Tim", "Collis", "imgurl", "I am a man called Tim.");
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		bookRepository.save(book);
	}

	}

