package com.codeclan.betterbooks.components;

import com.codeclan.betterbooks.models.Book;
import com.codeclan.betterbooks.models.Bookshelf;
import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.codeclan.betterbooks.models.people.User;
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
        BookshelfRepository bookshelfRepository;


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

            Book book1 = new Book();
            bookRepository.save(book1);
//
//            Book book2 = new Book();
//            bookRepository.save(book2);

            Bookshelf wantToRead = new Bookshelf("Want To Read", andrewB);
            bookshelfRepository.save(wantToRead);
            Bookshelf currentlyReading = new Bookshelf("Currently Reading", andrewB);
            bookshelfRepository.save(currentlyReading);
            Bookshelf haveRead = new Bookshelf("Have Read", andrewB);
            bookshelfRepository.save(haveRead);


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
