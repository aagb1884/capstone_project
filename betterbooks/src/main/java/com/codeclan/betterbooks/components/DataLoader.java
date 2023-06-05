//package com.codeclan.betterbooks.components;
//
//import com.codeclan.betterbooks.models.Book;
//import com.codeclan.betterbooks.models.Bookshelf;
//import com.codeclan.betterbooks.models.people.Author;
//import com.codeclan.betterbooks.models.people.Illustrator;
//import com.codeclan.betterbooks.models.people.User;
//import com.codeclan.betterbooks.repositories.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Profile;
//
//public class DataLoader {
//
//
//    @Profile("!test")
////    @Component //Comment this out if you do not to run the data loader.
//    public class DataLoader implements ApplicationRunner {
//
//        @Autowired
//        UserRepository userRepository;
//
//        @Autowired
//        BookRepository bookRepository;
//
//        @Autowired
//        AuthorRepository authorRepository;
//
//        @Autowired
//        IllustratorRepository illustratorRepository;
//
//        @Autowired
//        BookshelfRepository bookshelfRepository;
//
//
//        public DataLoader() {
//
//        }
//
//        public void run(ApplicationArguments args) {
//            User dutchman = new User("The Flying Dutchman");
//            userRepository.save(dutchman);
//
//            Author author1 = new Author("Tortuga", 100);
//            authorRepository.save(author1);
//
//            Illustrator illustrator1 = new Illustrator();
//            illustratorRepository.save(illustrator1);
//
//            Book book1 = new Book();
//            bookRepository.save(book1);
//
//            Book book2 = new Book();
//            bookRepository.save(book2);
//
//            Bookshelf wantToRead = new Bookshelf("Want To Read");
//            bookshelfRepository.save(wantToRead);
//            Bookshelf currentlyReading = new Bookshelf("Currently Reading");
//            bookshelfRepository.save(currentlyReading);
//            Bookshelf haveRead = new Bookshelf("Have Read");
//            bookshelfRepository.save(haveRead);
//
////            jack.addRaid(raid1);
////            jack.addRaid(raid2);
////            pirateRepository.save(jack);
////
////            raid2.addPirate(john);
////            raidRepository.save(raid2);
////
////            raid3.addPirate(pugwash);
////            raid3.addPirate(maggie);
////            raidRepository.save(raid3);
////
////            raid4.addPirate(pugwash);
////            raid3.addPirate(jack);
////            raidRepository.save(raid4);
////
////            blackbeard.addRaid(raid5);
////            blackbeard.addRaid(raid6);
////            pirateRepository.save(blackbeard);
////
////            raid5.addPirate(william);
////            raidRepository.save(raid5);
////
////            raid6.addPirate(henry);
////            raidRepository.save(raid6);
//
//        }
//    }
//
//
//}
