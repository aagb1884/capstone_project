package com.codeclan.betterbooks.components;

import com.codeclan.betterbooks.models.*;
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
        BookEntryRepository bookEntryRepository;


        public DataLoader() {

        }

        public void run(ApplicationArguments args) {

            User andrewB = new User("Andrew","Blair","imgurl","Dad to two large adult sons who love fart jokes and pathos.");
            userRepository.save(andrewB);

            Author stanton = new Author("Andy", "Stanton", "imgurl", "Andy Stanton lives in North London. He studied English at Oxford but they kicked him out. He has been a film script reader, a cartoonist, an NHS lackey and lots of other things. He has many interests, but best of all he likes cartoons, books and music (even jazz).");
            authorRepository.save(stanton);

            Illustrator tazzyman = new Illustrator("Dave", "Tazzyman", "imgurl", "David Tazzyman lives in South London with his partner Melanie and their 3 sons, Stanley, Atticus and Albert …. He grew up in Leicester, studied illustration at Manchester Metropolitian University and then travelled around Asia for three years before moving to London in 1997.\n" +
                    "He likes football, cricket, biscuits, music and drawing. He dislikes celery and changing nappies.");
            illustratorRepository.save(tazzyman);

            Author klassen = new Author("Jon", "Klassen", "imgurl", "Jon Klassen grew up in Niagara Falls, Canada, and now lives in Los Angeles, California. He is the New York Times bestselling author and illustrator of several books, including I Want My Hat Back and This Is Not My Hat, for which he won the Caldecott Medal. Two of his picture books have been named Caldecott Honor books: Sam and Dave Dig a Hole and Extra Yarn (winner of the Boston Globe–Horn Book Award), both by Mac Barnett. You can visit him online at www.burstofbeaden.com.");
            authorRepository.save(klassen);

            Illustrator iKlassen = new Illustrator("Jon", "Klassen", "imgurl", "Jon Klassen grew up in Niagara Falls, Canada, and now lives in Los Angeles, California. He is the New York Times bestselling author and illustrator of several books, including I Want My Hat Back and This Is Not My Hat, for which he won the Caldecott Medal. Two of his picture books have been named Caldecott Honor books: Sam and Dave Dig a Hole and Extra Yarn (winner of the Boston Globe–Horn Book Award), both by Mac Barnett. You can visit him online at www.burstofbeaden.com.");
            illustratorRepository.save(iKlassen);

            Author shendra = new Author("Sue", "Hendra", "imgurl", "Sue Hendra grew up in Wimbledon and has always loved making up stories and drawing pictures. Her favourite book as a child was Mr Silly. She graduated from Brighton University in 1994 and has been creating picture books ever since. In 2006 she met Paul Linnet and could instantly see that she’d met a fellow nitwit who liked talking nonsense. They went on to create many bestselling books together, working in a small room in their house in Brighton. Sue loves swimming, and can swim up and down for a very long time. Her favourite book is still Mr Silly.");
            Illustrator ishendra = new Illustrator("Sue", "Hendra", "imgurl", "Sue Hendra grew up in Wimbledon and has always loved making up stories and drawing pictures. Her favourite book as a child was Mr Silly. She graduated from Brighton University in 1994 and has been creating picture books ever since. In 2006 she met Paul Linnet and could instantly see that she’d met a fellow nitwit who liked talking nonsense. They went on to create many bestselling books together, working in a small room in their house in Brighton. Sue loves swimming, and can swim up and down for a very long time. Her favourite book is still Mr Silly.");
            Author plinnet = new Author("Paul", "Linnet", "imgurl", "Paul Linnet was born in Brighton and grew up in the Midlands, reading Tintin and playing classic 80s video games, before becoming obsessed with scribbling, writing, guitars and motorcycles. He studied Graphic Design at Derby University, and later moved back to Brighton where he met Sue Hendra. They made up a story about a fish with fingers and then a slug with a doughnut for a shell, and now no one can stop them from writing more and more frankly ridiculous books. They live in Brighton – and Paul still loves scribbling, writing, guitars and motorcycles.");
            Illustrator iplinnet = new Illustrator("Paul", "Linnet", "imgurl", "Paul Linnet was born in Brighton and grew up in the Midlands, reading Tintin and playing classic 80s video games, before becoming obsessed with scribbling, writing, guitars and motorcycles. He studied Graphic Design at Derby University, and later moved back to Brighton where he met Sue Hendra. They made up a story about a fish with fingers and then a slug with a doughnut for a shell, and now no one can stop them from writing more and more frankly ridiculous books. They live in Brighton – and Paul still loves scribbling, writing, guitars and motorcycles.");

            Author fwatt = new Author("Fiona", "Watt", "imgurl", "Fiona Watt wrote some books.");
            Illustrator rwells = new Illustrator("Rachel", "Wells", "imgurl", "Rachel Wells illustrated some books.");

            Author nshireen = new Author("Nadia", "Shireen", "imgurl", "Nadia Shireen enjoyed making homemade magazines and comics as a child. She studied law at university and then worked in magazine journalism; it was during this time that she started to draw again. After a lifetime of doodling in the sidelines, Nadia decided to pay some attention to drawing and in 2007 was accepted onto an MA course in Children's Book Illustration at Anglia Ruskin University, Cambridge. Her debut book Good Little Wolf received a mention in the Bologna Ragazzi Opera Prima Award and won the UKLA Book Award. Nadia has been shortlisted for the Roald Dahl Funny Prize and the Waterstones Children's Book Prize. She lives in London.");
            Illustrator inshireen = new Illustrator("Nadia", "Shireen", "imgurl", "Nadia Shireen enjoyed making homemade magazines and comics as a child. She studied law at university and then worked in magazine journalism; it was during this time that she started to draw again. After a lifetime of doodling in the sidelines, Nadia decided to pay some attention to drawing and in 2007 was accepted onto an MA course in Children's Book Illustration at Anglia Ruskin University, Cambridge. Her debut book Good Little Wolf received a mention in the Bologna Ragazzi Opera Prima Award and won the UKLA Book Award. Nadia has been shortlisted for the Roald Dahl Funny Prize and the Waterstones Children's Book Prize. She lives in London.");

            Illustrator mOrdonez = new Illustrator("Miguel", "Ordonez", "imgurl", "Miguel Ordóñez has had two of his books in the New York Times bestsellers list and his illustrations for Jimmy Fallon’s Your Baby’s First Word Will Be Dada have been honoured by the American Society of Illustrators. He lives in Madrid and works in his own studio, where he combines graphic design with illustrating projects as well as teaching visual communication and creativity.");

            Book mrGum = new Book("You're a Bad Man Mr Gum", "Shabba me whiskers! It's one of those Mr Gum books by Andy Stanton. They're only the craziest, funnest most amazing books for children in the world. You're A Bad Man, Mr Gum! Good evening. Mr Gum is a complete horror who hates children, animals, fun and corn on the cob. This book's all about him. And an angry fairy who lives in his bathtub. And Jake the dog, and a little girl called Polly and an evil, stinky butcher all covered in guts. And there's heroes and sweets and adventures and EVERYTHING.", 192, Format.PAPERBACK, "2006/08/07", "Egmont UK Ltd", "9781405223102", "url.com", null);
            mrGum.addAuthor(stanton);
            mrGum.addIllustrator(tazzyman);
            mrGum.addDescription(DescriptiveTag.FICTION);
            mrGum.addDescription(DescriptiveTag.FUNNY);
            mrGum.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(mrGum);
            Book otter = new Book("That's Not My Otter", "Meet five adorable otters in this charming addition to the much-loved That's not my... series. Babies love the best-selling That's not my... books with their bold illustrations, patches to stroke, and a mouse to spot on every page, all designed to develop sensory and language awareness.", 10, Format.BOARDBOOKFORMAT, "2017/04/06", "Usborne Publishing Ltd.", "9781474933759", "url.com", null);
            otter.addAuthor(fwatt);
            otter.addIllustrator(rwells);
            otter.addDescription(DescriptiveTag.BOARDBOOK);
            otter.addDescription(DescriptiveTag.BABYBOOK);
            otter.addDescription(DescriptiveTag.TEXTURES);
            otter.addDescription(DescriptiveTag.SENSORY);
            bookRepository.save(otter);

            Book supertato = new Book("Three Epic Adventures of Supertato", "Meet Supertato! The much-loved supermarket superhero who's there to save the day when the chips are down stars in three epic adventures.", 80 , Format.PAPERBACK, "2023/01/05", "Simon & Schuster Ltd.", "9781398517783", "url.com", null);
            supertato.addAuthor(plinnet);
            supertato.addAuthor(shendra);
            supertato.addIllustrator(iplinnet);
            supertato.addIllustrator(ishendra);
            supertato.addDescription(DescriptiveTag.PICTUREBOOK);
            supertato.addDescription(DescriptiveTag.SILLY);
            supertato.addDescription(DescriptiveTag.ADVENTURE);
            bookRepository.save(supertato);

            Book hatback = new Book("I Want My Hat Back", "A bear searches for his missing hat in the bestselling, multiple award-winning picture book debut of Jon Klassen.\n" +
                    "\n" +
                    "In his bestselling debut picture book, the multiple award-winning Jon Klassen, illustrator of This Is Not My Hat and Sam and Dave Dig a Hole, tells the story of a bear who's hat has gone. And he wants it back. Patiently and politely, he asks the animals he comes across, one by one, whether they have seen it. Each animal says no (some more elaborately than others). But just as it he begins to lose hope, lying flat on his back in despair, a deer comes by and asks a rather obvious question that suddenly sparks the bear's memory and renews his search with a vengeance... Told completely in dialogue, this quirky, hilarious, read-aloud tale plays out in sly illustrations brimming with visual humour and winks at the reader who will be thrilled to be in on the joke.", 40,Format.PAPERBACK, "2012/10/04", "Walker Books Ltd", "9781406338539", "url.com", null);
            hatback.addAuthor(klassen);
            hatback.addIllustrator(iKlassen);
            hatback.addDescription(DescriptiveTag.PICTUREBOOK);
            hatback.addDescription(DescriptiveTag.ANIMALS);
            hatback.addDescription(DescriptiveTag.FUNNY);
            hatback.addDescription(DescriptiveTag.SCARY);
            bookRepository.save(hatback);

            Book billyPirates = new Book("Billy and the Pirates", "Ahoy there! It's time to sail the ocean blue with Billy and her trusty feline friend, as they embark on a noble seafaring adventure.\n" +
                    "\n" +
                    "Billy and Fatcat find a mysterious message in a bottle at sea. When suddenly something terrible happens: they bump into a pesky pirate and his smelly crew. Oh no!", 32, Format.PAPERBACK, "2022/07/21", "Penguin Random House", "9781780081373", "url.com", null);
            billyPirates.addAuthor(nshireen);
            billyPirates.addIllustrator(inshireen);
            billyPirates.addDescription(DescriptiveTag.PICTUREBOOK);
            billyPirates.addDescription(DescriptiveTag.FUNNY);
            billyPirates.addDescription(DescriptiveTag.ADVENTURE);

            Book goingVolcano = new Book("Going to the Volcano", "“Buckle up and jump on board for the funniest, most EXPLOSIVE picture book of the year - you'll want to read it again and again-o!\n" +
                    "\n" +
                    "Join two intrepid explorers as they take a train-o, jump on a plane-o, ride a Great Dane-o (down the lane-o) on their way to look at the volcano. Nothing could possibly go wrong - could it?!", 32, Format.PAPERBACK, "2019/04/04","Hachette Children’s Group","9781444933451", "imgurl", null);
            goingVolcano.addAuthor(stanton);
            goingVolcano.addIllustrator(mOrdonez);
            goingVolcano.addDescription(DescriptiveTag.PICTUREBOOK);
            goingVolcano.addDescription(DescriptiveTag.SILLY);


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
