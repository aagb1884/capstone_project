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
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
	public void canSaveUser() {
		User user = new User("Tim", "Collis", "timC", "imgurl", "I am a man called Tim.");
		userRepository.save(user);
	}

	@Test
	public void canAddAndRemoveBookEntry() {
		User user = new User("Tim", "Collis", "timC", "imgurl", "I am a man called Tim.");
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		BookEntry bookEntry = new BookEntry(book, user, "01/06/2023", "04/06/2023", 5, 5, Status.HAVEREAD, "Good.");
		user.addBookEntry(bookEntry);
		assertEquals(1, user.getMyBooks().size());
		user.removeBookEntry(bookEntry);
		assertEquals(0, user.getMyBooks().size());
	}

	@Test
	public void canAddBookEntryToDb() {
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		bookRepository.save(book);
		User user = new User("Tim", "Collis", "timC", "imgurl", "I am a man called Tim.");
		userRepository.save(user);
		BookEntry bookEntry = new BookEntry(book, user, "01/06/2023", "04/06/2023", 5, 5, Status.HAVEREAD, "yeah decent");
		bookEntryRepository.save(bookEntry);
	}

	@Test
	public void canSaveIllustratorToDb() {
		Illustrator illustrator = new Illustrator("Quentin", "Blake", "url.com", "Quentin is an artist.");
		illustratorRepository.save(illustrator);
	}

	@Test
	public void canAddAndRemoveBookIllustrator() {
		Illustrator illustrator = new Illustrator("Quentin", "Blake", "url.com", "Quentin is an artist.");
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		book.addIllustrator(illustrator);
		assertEquals(1, book.getIllustrators().size());
		book.removeIllustrator(illustrator);
		assertEquals(0, book.getIllustrators().size());
	}

	@Test
	public void canSaveAuthor() {
		Author author = new Author("Sally", "Collins", "url.com", "Sally is an author.");
		authorRepository.save(author);
	}

	@Test
	public void canAddAndRemoveAuthorBook() {
		Author author = new Author("Sally", "Collins", "url.com", "Sally is an author.");
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		author.addAuthorBook(book);
		assertEquals(1, author.getBooks().size());
		author.removeAuthorBook(book);
		assertEquals(0, author.getBooks().size());
	}

	@Test
	public void canSaveBookToDb() {
		Author author = new Author("Sally", "Collins", "url.com", "Sally is an author.");
		Illustrator illustrator = new Illustrator("Quentin", "Blake", "url.com", "Quentin is an artist.");
		User user = new User("Tim", "Collis", "timC", "imgurl", "I am a man called Tim.");
		Book book = new Book("The Lovely Horse", "Horse goes on adventure", 20, Format.BOARDBOOKFORMAT, "20/01/2020", "HarperCollins", "9781233458756", "url.com", null);
		bookRepository.save(book);
	}

}

