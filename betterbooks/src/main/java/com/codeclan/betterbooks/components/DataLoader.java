package com.codeclan.betterbooks.components;

import com.codeclan.betterbooks.models.Book;
import com.codeclan.betterbooks.models.Format;
import com.codeclan.betterbooks.models.Status;
import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.codeclan.betterbooks.models.people.User;
import com.codeclan.betterbooks.models.BookEntry;
import com.codeclan.betterbooks.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;



    @Profile("!test")
//    @Component //Comment this out if you do not to run the data loader.
    public class DataLoader implements ApplicationRunner {

        @Autowired
        UserRepository userRepository;

        @Autowired
        BookRepository bookRepository;

        @Autowired
        AuthorRepository authorRepository;

        @Autowired
        IllustratorRepository illustratorRepository;

        @Autowired
        BookEntryRepository bookEntryRepository;


        public DataLoader() {

        }

        public void run(ApplicationArguments args) {



            User andrewB = new User("Andrew","Blair","imgurl","Dad to two large adult sons who love fart jokes and pathos.");
            userRepository.save(andrewB);

            Author author1 = new Author("Andy", "Stanton", "imgurl", "Andy Stanton lives in North London. He studied English at Oxford but they kicked him out. He has been a film script reader, a cartoonist, an NHS lackey and lots of other things. He has many interests, but best of all he likes cartoons, books and music (even jazz).");
            authorRepository.save(author1);

            Illustrator illustrator1 = new Illustrator("Dave", "Tazzyman", "imgurl", "David Tazzyman lives in South London with his partner Melanie and their 3 sons, Stanley, Atticus and Albert …. He grew up in Leicester, studied illustration at Manchester Metropolitian University and then travelled around Asia for three years before moving to London in 1997.\n" +
                    "He likes football, cricket, biscuits, music and drawing. He dislikes celery and changing nappies.");
            illustratorRepository.save(illustrator1);

            Book mrGum = new Book("You're a Bad Man Mr Gum", "Shabba me whiskers! It's one of those Mr Gum books by Andy Stanton. They're only the craziest, funnest most amazing books for children in the world. You're A Bad Man, Mr Gum! Good evening. Mr Gum is a complete horror who hates children, animals, fun and corn on the cob. This book's all about him. And an angry fairy who lives in his bathtub. And Jake the dog, and a little girl called Polly and an evil, stinky butcher all covered in guts. And there's heroes and sweets and adventures and EVERYTHING.", 192, Format.PAPERBACK, "2006/08/07", "Egmont UK Ltd", "9781405223102", "url.com", null);
            bookRepository.save(mrGum);
            Book otter = new Book("That's Not My Otter", "Meet five adorable otters in this charming addition to the much-loved That's not my... series. Babies love the best-selling That's not my... books with their bold illustrations, patches to stroke, and a mouse to spot on every page, all designed to develop sensory and language awareness.", 10, Format.BOARDBOOKFORMAT, "2017/04/06", "Usborne Publishing Ltd.", "9781474933759", "url.com", null);
            bookRepository.save(otter);
            Book supertato = new Book("Three Epic Adventures of Supertato", "Meet Supertato! The much-loved supermarket superhero who's there to save the day when the chips are down stars in three epic adventures.", 80 , Format.PAPERBACK, "2023/01/05", "Simon & Schuster Ltd.", "9781398517783", "url.com", null);
            bookRepository.save(supertato);

            BookEntry bookEntry1 = new BookEntry(mrGum, andrewB, null, null , null, Status.WANTTOREAD);
            bookEntryRepository.save(bookEntry1);
            BookEntry bookEntry2 = new BookEntry(otter, andrewB, "01/06/2023", null, null, Status.CURRENTLYREADING);
            bookEntryRepository.save(bookEntry2);
            BookEntry bookEntry3 = new BookEntry(supertato, andrewB, "01/06/2023", "04/06/2023", 2, Status.HAVEREAD);
            bookEntryRepository.save(bookEntry3);



//            jack.addRaid(raid1);
//            jack.addRaid(raid2);
//            pirateRepository.save(jack);
//
//            raid2.addPirate(john);
//            raidRepository.save(raid2);
//
//            raid3.addPirate(pugwash);
//            raid3.addPirate(maggie);
//            raidRepository.save(raid3);
//
//            raid4.addPirate(pugwash);
//            raid3.addPirate(jack);
//            raidRepository.save(raid4);
//
//            blackbeard.addRaid(raid5);
//            blackbeard.addRaid(raid6);
//            pirateRepository.save(blackbeard);
//
//            raid5.addPirate(william);
//            raidRepository.save(raid5);
//
//            raid6.addPirate(henry);
//            raidRepository.save(raid6);

        }
    }
