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
import org.springframework.stereotype.Component;


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

            User andrewB = new User("Andrew","Blair", "aagb", "images/me_andrew_blair.png","Dad to two large adult sons who love fart jokes and pathos.");
            userRepository.save(andrewB);

            Author stanton = new Author("Andy", "Stanton", "images/andy_stanton.jpeg", "Andy Stanton lives in North London. He studied English at Oxford but they kicked him out. He has many interests, but best of all he likes cartoons, books and music (even jazz).");
            authorRepository.save(stanton);

            Illustrator tazzyman = new Illustrator("Dave", "Tazzyman", "images/dave_tazzyman.jpeg", "David Tazzyman grew up in Leicester. He likes football, cricket, biscuits, music and drawing. He dislikes celery and changing nappies.");
            illustratorRepository.save(tazzyman);

            Author klassen = new Author("Jon", "Klassen", "images/blank_avatar.png", "Jon Klassen is the New York Times bestselling author and illustrator of several books, including I Want My Hat Back and This Is Not My Hat, for which he won the Caldecott Medal.");
            authorRepository.save(klassen);

            Illustrator iKlassen = new Illustrator("Jon", "Klassen", "images/blank_avatar.png", "Jon Klassen is the New York Times bestselling author and illustrator of several books, including I Want My Hat Back and This Is Not My Hat, for which he won the Caldecott Medal.");
            illustratorRepository.save(iKlassen);

            Author shendra = new Author("Sue", "Hendra", "images/blank_avatar.png", "Sue Hendra grew up in Wimbledon and has always loved making up stories and drawing pictures. In 2006 she met Paul Linnet and could instantly see that she’d met a fellow nitwit who liked talking nonsense.");
            authorRepository.save(shendra);
            Illustrator ishendra = new Illustrator("Sue", "Hendra", "images/blank_avatar.png", "Sue Hendra grew up in Wimbledon and has always loved making up stories and drawing pictures. In 2006 she met Paul Linnet and could instantly see that she’d met a fellow nitwit who liked talking nonsense.");
            illustratorRepository.save(ishendra);
            Author plinnet = new Author("Paul", "Linnet", "images/blank_avatar.png", "Paul Linnet was born in Brighton and grew up in the Midlands, reading Tintin and playing classic 80s video games, before becoming obsessed with scribbling, writing, guitars and motorcycles.");
            authorRepository.save(plinnet);
            Illustrator iplinnet = new Illustrator("Paul", "Linnet", "images/blank_avatar.png", "Paul Linnet was born in Brighton and grew up in the Midlands, reading Tintin and playing classic 80s video games, before becoming obsessed with scribbling, writing, guitars and motorcycles.");
            illustratorRepository.save(iplinnet);
            Author fwatt = new Author("Fiona", "Watt", "images/blank_avatar.png", "Fiona Watt wrote some books.");
            authorRepository.save(fwatt);
            Illustrator rwells = new Illustrator("Rachel", "Wells", "images/blank_avatar.png", "Rachel Wells illustrated some books.");
            illustratorRepository.save(rwells);
            Author nshireen = new Author("Nadia", "Shireen", "images/blank_avatar.png", "Nadia Shireen enjoyed making homemade magazines and comics as a child. Her debut book Good Little Wolf received a mention in the Bologna Ragazzi Opera Prima Award and won the UKLA Book Award.");
            authorRepository.save(nshireen);
            Illustrator inshireen = new Illustrator("Nadia", "Shireen", "images/blank_avatar.png", "Nadia Shireen enjoyed making homemade magazines and comics as a child. Her debut book Good Little Wolf received a mention in the Bologna Ragazzi Opera Prima Award and won the UKLA Book Award.");
            illustratorRepository.save(inshireen);
            Illustrator mOrdonez = new Illustrator("Miguel", "Ordonez", "images/blank_avatar.png", "Miguel Ordóñez lives in Madrid and works in his own studio, where he combines graphic design with illustrating projects as well as teaching visual communication and creativity.");
            illustratorRepository.save(mOrdonez);
            Author lPearson = new Author("Luke", "Pearson", "images/blank_avatar.png", "Luke Pearson is a British writer, illustrator and cartooonist.");
            authorRepository.save(lPearson);
            Illustrator iLPearson = new Illustrator("Luke", "Pearson", "images/blank_avatar.png", "Luke Pearson is a British writer, illustrator and cartooonist.");
            illustratorRepository.save(iLPearson);
            Author eCarle = new Author ("Eric", "Carle", "images/blank_avatar.png", "Eric Carle is a writer and illustrator.");
            authorRepository.save(eCarle);
            Illustrator iECarle = new Illustrator("Eric", "Carle", "images/blank_avatar.png", "Eric Carle is a writer and illustrator.");
            illustratorRepository.save(iECarle);
            Author aAhlberg = new Author ("Alan", "Ahlberg", "images/blank_avatar.png", "Alan Ahlberg is a writer.");
            authorRepository.save(aAhlberg);
            Author jAhlberg = new Author ("Janet", "Ahlberg", "images/blank_avatar.png", "Janet Ahlberg is a writer and illustrator.");
            authorRepository.save(jAhlberg);
            Illustrator iJAhlberg = new Illustrator("Janet", "Ahlberg", "images/blank_avatar.png", "Janet Ahlberg is a writer and illustrator.");
            illustratorRepository.save(iJAhlberg);
            Author sMcBratney = new Author ("Sam", "McBratney", "images/blank_avatar.png", "Sam McBratney is a writer.");
            authorRepository.save(sMcBratney);
            Illustrator aJeram = new Illustrator("Anita", "Jeram", "images/blank_avatar.png", "Anita Jeram is an illustrator.");
            illustratorRepository.save(aJeram);
            Author lDodd = new Author ("Lynley", "Dodd", "images/blank_avatar.png", "Lynley Dodd is a writer and illustrator.");
            authorRepository.save(lDodd);
            Illustrator iLDodd = new Illustrator("Lynley", "Dodd", "images/blank_avatar.png", "Lynley Dodd is a writer and illustrator.");
            illustratorRepository.save(iLDodd);
            Author ladybird = new Author ("Ladybird", "", "images/blank_avatar.png", "");
            authorRepository.save(ladybird);
            Illustrator lemonRibbonStudio = new Illustrator("Lemon Ribbon", "Studio", "images/blank_avatar.png", "");
            illustratorRepository.save(lemonRibbonStudio);
            Author oJeffers = new Author ("Oliver", "Jeffers", "images/blank_avatar.png", "Oliver Jeffers is a writer and illustrator.");
            authorRepository.save(oJeffers);
            Illustrator iOJeffers = new Illustrator("Oliver", "Jeffers", "images/blank_avatar.png", "Oliver Jeffers is a writer and illustrator.");
            illustratorRepository.save(iOJeffers);
            Author mHood = new Author ("Morag", "Hood", "images/blank_avatar.png", "Morag Hood is a writer and illustrator.");
            authorRepository.save(mHood);
            Illustrator iMHood = new Illustrator("Morag", "Hood", "images/blank_avatar.png", "Morag Hood is a writer and illustrator.");
            illustratorRepository.save(iMHood);
            Author drSeuss = new Author ("Dr.", "Seuss", "images/blank_avatar.png", "Dr Seuss is Dr Seuss.");
            authorRepository.save(drSeuss);
            Illustrator iDrSeuss = new Illustrator("Dr.", "Seuss", "images/blank_avatar.png", "Dr Seuss is Dr Seuss.");
            illustratorRepository.save(iDrSeuss);
            Author iEagleton = new Author ("Ian", "Eagleton", "images/blank_avatar.png", "Ian Eagleton is a writer.");
            authorRepository.save(iEagleton);
            Illustrator jMayhew = new Illustrator("James", "Mayhew", "images/blank_avatar.png", "James Mayhew is an illustrator.");
            illustratorRepository.save(jMayhew);
            Author rPlummer = new Author ("Rachel", "Plummer", "images/blank_avatar.png", "Rachel Plummer is a poet living in Edinburgh, Scotland.");
            authorRepository.save(rPlummer);
            Illustrator hBoppert = new Illustrator("Helene", "Boppert", "images/blank_avatar.png", "Helene Boppert is an artist.");
            illustratorRepository.save(hBoppert);
            Author jDonaldson = new Author ("Julia", "Donaldson", "images/blank_avatar.png", "Oh you know. Julia Donaldson.");
            authorRepository.save(jDonaldson);
            Illustrator aScheffler = new Illustrator("Axel", "Scheffler", "images/blank_avatar.png", "The artist Axel Scheffler has his fingers in many pies.");
            illustratorRepository.save(aScheffler);
            Author dAtta = new Author ("Dean", "Atta", "images/blank_avatar.png", "Dean Atta is a writer, performer and poet.");
            authorRepository.save(dAtta);
            Illustrator aKhullar = new Illustrator("Anshika", "Khullar", "images/blank_avatar.png", "Anshika Kullar is an illustrator.");
            illustratorRepository.save(aKhullar);
            Author tDicks = new Author ("Terrance", "Dicks", "images/blank_avatar.png", "Terrance Dicks wrote bloody hundreds of Doctor Who novels and Script Edited the show in the Seventies, then repeated the same anecdotes at conventions for decades and wrote some hilariously bad spin-off novels.");
            authorRepository.save(tDicks);
            Author eMcNicoll = new Author ("Elle", "McNicoll", "images/blank_avatar.png", "Elle McNicoll is a writer.");
            authorRepository.save(eMcNicoll);
            Author aThomas = new Author ("Angie", "Thomas", "images/blank_avatar.png", "Angie Thomas is a writer.");
            authorRepository.save(aThomas);
            Author eAcevedo = new Author ("Elizabeth", "Acevedo", "images/blank_avatar.png", "Elizabeth Acevedo is a writer, performer and poet.");
            authorRepository.save(eAcevedo);
            Author aEmezi = new Author ("Akwaeke", "Emezi", "images/blank_avatar.png", "Akwaeke Emezi is a writer.");
            authorRepository.save(aEmezi);

            Book mrGum = new Book("You're a Bad Man Mr Gum", "Mr Gum is a complete horror who hates children, animals, fun and corn on the cob. This book's all about him, an angry fairy who lives in his bathtub, Jake the dog, and a little girl called Polly and an evil, stinky butcher all covered in guts.", 192, Format.PAPERBACK, "07/08/2006", "Egmont UK Ltd", "9781405223102", "images/yr_a_bad_man_mr_gum.jpeg", null);
            mrGum.addAuthor(stanton);
            mrGum.addIllustrator(tazzyman);
            mrGum.addDescription(DescriptiveTag.FICTION);
            mrGum.addDescription(DescriptiveTag.FUNNY);
            mrGum.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(mrGum);
            Book otter = new Book("That's Not My Otter", "Meet five adorable otters in this charming addition to the much-loved That's not my... series, with  bold illustrations, patches to stroke, and a mouse to spot on every page, all designed to develop sensory and language awareness.", 10, Format.BOARDBOOKFORMAT, "06/04/2017", "Usborne Publishing Ltd.", "9781474933759", "images/not_my_otter.jpeg", null);
            otter.addAuthor(fwatt);
            otter.addIllustrator(rwells);
            otter.addDescription(DescriptiveTag.BOARDBOOK);
            otter.addDescription(DescriptiveTag.BABYBOOK);
            otter.addDescription(DescriptiveTag.TEXTURES);
            otter.addDescription(DescriptiveTag.SENSORY);
            bookRepository.save(otter);

            Book supertato = new Book("Three Epic Adventures of Supertato", "Meet Supertato! The much-loved supermarket superhero who's there to save the day when the chips are down stars in three epic adventures.", 80 , Format.PAPERBACK, "05/01/2023", "Simon & Schuster Ltd.", "9781398517783", "images/three_supertato.jpeg", null);
            supertato.addAuthor(plinnet);
            supertato.addAuthor(shendra);
            supertato.addIllustrator(iplinnet);
            supertato.addIllustrator(ishendra);
            supertato.addDescription(DescriptiveTag.PICTUREBOOK);
            supertato.addDescription(DescriptiveTag.SILLY);
            supertato.addDescription(DescriptiveTag.ADVENTURE);
            bookRepository.save(supertato);

            Book hatback = new Book("I Want My Hat Back", "A bear's hat has gone. And he wants it back.", 40,Format.PAPERBACK, "04/10/2012", "Walker Books Ltd", "9781406338539", "images/i_want_my_hat_baack.jpg", null);
            hatback.addAuthor(klassen);
            hatback.addIllustrator(iKlassen);
            hatback.addDescription(DescriptiveTag.PICTUREBOOK);
            hatback.addDescription(DescriptiveTag.ANIMALS);
            hatback.addDescription(DescriptiveTag.FUNNY);
            hatback.addDescription(DescriptiveTag.SCARY);
            bookRepository.save(hatback);

            Book billyPirates = new Book("Billy and the Pirates", "Ahoy there! It's time to sail the ocean blue with Billy and her trusty feline friend, as they embark on a noble seafaring adventure.\n" +
                    "\n" +
                    "Billy and Fatcat find a mysterious message in a bottle at sea. When suddenly something terrible happens: they bump into a pesky pirate and his smelly crew. Oh no!", 32, Format.PAPERBACK, "21/07/2022", "Penguin Random House", "9781780081373", "images/billy_and_the_pirates.jpeg", null);
            billyPirates.addAuthor(nshireen);
            billyPirates.addIllustrator(inshireen);
            billyPirates.addDescription(DescriptiveTag.PICTUREBOOK);
            billyPirates.addDescription(DescriptiveTag.FUNNY);
            billyPirates.addDescription(DescriptiveTag.ADVENTURE);
            bookRepository.save(billyPirates);

            Book goingVolcano = new Book("Going to the Volcano", "Join two intrepid explorers as they take a train-o, jump on a plane-o, ride a Great Dane-o (down the lane-o) on their way to look at the volcano. Nothing could possibly go wrong - could it?!", 32, Format.PAPERBACK, "04/04/2019","Hachette Children’s Group","9781444933451", "images/going_volcano.jpeg", null);
            goingVolcano.addAuthor(stanton);
            goingVolcano.addIllustrator(mOrdonez);
            goingVolcano.addDescription(DescriptiveTag.PICTUREBOOK);
            goingVolcano.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(goingVolcano);

            Book hildaMidnightGiant = new Book("Hilda and the Midnight Giant", "When creatures bombard Hilda's house with eviction notices, she has to think twice before making their acquaintance. Come to think of it, who is this giant who only appears at midnight, and why is Hilda the only person who can see him?", 48, Format.PAPERBACK, "01/02/2016", "Flying Eye Books", "9781909263796", "images/hilda_midnight_giant.jpeg"  , null);
            hildaMidnightGiant.addAuthor(lPearson);
            hildaMidnightGiant.addIllustrator(iLPearson);
            hildaMidnightGiant.addDescription(DescriptiveTag.COMIC);
            hildaMidnightGiant.addDescription(DescriptiveTag.ADVENTURE);
            hildaMidnightGiant.addDescription(DescriptiveTag.FANTASY);
            bookRepository.save(hildaMidnightGiant);

            Book hungryCaterpillar = new Book	("The Very Hungry Caterpillar", "Eric Carle's The Very Hungry Caterpillar is a perennial favourite with children and adults alike. Its imaginative illustration and clever cut-out detail charts the progress of a very hungry caterpillar as he eats his way through the week.",	24,	Format.BOARDBOOKFORMAT,	"29/09/1994",	"Penguin Random House",	"9780241003008", "imgurl", null);
            hungryCaterpillar.addAuthor(eCarle);
            hungryCaterpillar.addIllustrator(iECarle);
            hungryCaterpillar.addDescription(DescriptiveTag.BOARDBOOK);
            hungryCaterpillar.addDescription(DescriptiveTag.PICTUREBOOK);
            hungryCaterpillar.addDescription(DescriptiveTag.ANIMALS);
            bookRepository.save(hungryCaterpillar);

            Book each_peach	= new Book	("Each Peach Pear Plum",	"Each Peach Pear Plum introduces characters from well-known nursery stories and encourages children to participate and to find the characters hidden in the pictures. The text is perfect to read aloud to very young children.",	34,	Format.BOARDBOOKFORMAT,"06/04/2017",	"Penguin Random House",	"9780141379524",	"imgurl",	null);
            each_peach.addAuthor(aAhlberg);
            each_peach.addAuthor(jAhlberg);
            each_peach.addIllustrator(iJAhlberg);
            each_peach.addDescription(DescriptiveTag.BOARDBOOK);
            each_peach.addDescription(DescriptiveTag.PICTUREBOOK);
            each_peach.addDescription(DescriptiveTag.NURSERYRHYMES);
            bookRepository.save(each_peach);

            Book guessHowMuchLoveYou = new Book	("Guess How Much I Love You", "Sometimes, when you love someone very, very much, you want to find a way of describing how much you treasure them. But, as Little Nutbrown Hare and Big Nutbrown Hare discover, love is not always an easy thing to measure.", 32, Format.BOARDBOOKFORMAT, "02/10/2014",	"Walker Books Ltd",	"9781406358780", "img.url", null);
            guessHowMuchLoveYou.addAuthor(sMcBratney);
            guessHowMuchLoveYou.addIllustrator(aJeram);
            guessHowMuchLoveYou.addDescription(DescriptiveTag.BOARDBOOK);
            guessHowMuchLoveYou.addDescription(DescriptiveTag.PICTUREBOOK);
            guessHowMuchLoveYou.addDescription(DescriptiveTag.BEDTIME);
            bookRepository.save(guessHowMuchLoveYou);

            Book hairyMacLary1 = new Book	("Hairy Maclary from Donaldson’s Dairy",	"Hairy Maclary goes off for a walk in town, followed by a few friends - and comes up against a nasty surprise in the shape of Scarface Claw!  Discover the lovable rogue, Hairy Maclary, and his four-footed friends in this hilarious classic tale.", 36,	Format.BOARDBOOKFORMAT,	"04/07/2002",	"Penguin Random House",	"9780670913503",	"imgurl",	null);
            hairyMacLary1.addAuthor(lDodd);
            hairyMacLary1.addIllustrator(iLDodd);
            hairyMacLary1.addDescription(DescriptiveTag.BOARDBOOK);
            hairyMacLary1.addDescription(DescriptiveTag.PICTUREBOOK);
            hairyMacLary1.addDescription(DescriptiveTag.ANIMALS);
            bookRepository.save(hairyMacLary1);

            Book babyTouchPlaybook = new Book	("Baby Touch: Playbook",	"Parent and child can explore the world together with this multi-sensory book from the innvoative Baby Touch range. This bright and bold book features flaps to lift and die-cut pieces on each spread, all perfectly designed for first discovery and experience.",		12,	Format.BOARDBOOKFORMAT	, "13/06/2019",	"Penguin Random House",	"9780241379134",	"imgurl",	null);
            babyTouchPlaybook.addAuthor(ladybird);
            babyTouchPlaybook.addIllustrator(lemonRibbonStudio);
            babyTouchPlaybook.addDescription(DescriptiveTag.BOARDBOOK);
            babyTouchPlaybook.addDescription(DescriptiveTag.ANIMALS);
            babyTouchPlaybook.addDescription(DescriptiveTag.SENSORY);
            babyTouchPlaybook.addDescription(DescriptiveTag.BABYBOOK);
            babyTouchPlaybook.addDescription(DescriptiveTag.TEXTURES);
            bookRepository.save(babyTouchPlaybook);

            Book aLittleStuck = new Book	("A Little Stuck",	"Floyd gets his kite stuck up a tree. He throws up his shoe to shift it, but that gets stuck too. So he throws up his other shoe and that gets stuck. Will Floyd ever get his kite back?",		30,	Format.BOARDBOOKFORMAT,	"02/06/2016",	"HarperCollins Publishers",	"9780008170868",	"imgurl",	null);
            aLittleStuck.addAuthor(oJeffers);
            aLittleStuck.addIllustrator(iOJeffers);
            aLittleStuck.addDescription(DescriptiveTag.BOARDBOOK);
            aLittleStuck.addDescription(DescriptiveTag.PICTUREBOOK);
            aLittleStuck.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(aLittleStuck);

            Book whenGrandadPenguin	= new Book	("When Grandad Was a Penguin", "What do you do when your Grandad starts acting VERY much like a penguin? Boys and girls alike will love the witty, sweet and brilliantly surreal depiction of everyday settings and situations in this fish-out-of-water story with a difference.",	32,	Format.PAPERBACK,	"05/04/2018",	"Pan Macmillan",	"9781509850976",	"imgurl",	null);
            whenGrandadPenguin.addAuthor(mHood);
            whenGrandadPenguin.addIllustrator(iMHood);
            whenGrandadPenguin.addDescription(DescriptiveTag.PICTUREBOOK);
            whenGrandadPenguin.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(whenGrandadPenguin);

            Book drSeussSleepBook = new Book	("Dr Seuss’s Sleep Book",	"This book is the original (and the best) remedy for children who don't want to go to sleep.  Sleep thoughts are spreading Throughout the whole land The time for night-brushing of teeth is at hand!",		64,	Format.PAPERBACK,	"04/05/2017",	"HarperCollins Publishers",	"9780008236069",	"imgurl",	null);
            drSeussSleepBook.addAuthor(drSeuss);
            drSeussSleepBook.addIllustrator(iDrSeuss);
            drSeussSleepBook.addDescription(DescriptiveTag.PICTUREBOOK);
            drSeussSleepBook.addDescription(DescriptiveTag.SILLY);
            drSeussSleepBook.addDescription(DescriptiveTag.BEDTIME);
            bookRepository.save(drSeussSleepBook);

            Book nenLonelyFisherman	= new Book	("Nen and the Lonely Fisherman",	"Far out to sea and deep below the whispering waves lives a merman called Nen. Nen spends his days exploring his underwater kingdom, but something is missing: his heart is empty. So, Nen ventures to the forbidden world above.",	32,	Format.PAPERBACK,	"01/06/2021",	"Owlet Press", "9781913339098",	"imgurl",	null);
            nenLonelyFisherman.addAuthor(iEagleton);
            nenLonelyFisherman.addIllustrator(jMayhew);
            nenLonelyFisherman.addDescription(DescriptiveTag.PICTUREBOOK);
            nenLonelyFisherman.addDescription(DescriptiveTag.EMOTIONAL);
            nenLonelyFisherman.addDescription(DescriptiveTag.LGBTQ);
            bookRepository.save(nenLonelyFisherman);

            Book	wain	= new Book	("Wain: LGBT reimaginings of Scottish folktales",	"Wain is a collection of LGBT themed children's poetry based on retellings of Scottish myths. These poems immerse readers in an enriching vision of contemporary life.",		88,	Format.PAPERBACK,	"29/02/2019",	"The Emma Press",	"9781910139479",	"imgurl",	null);
            wain.addAuthor(rPlummer);
            wain.addIllustrator(hBoppert);
            wain.addDescription(DescriptiveTag.POETRY);
            wain.addDescription(DescriptiveTag.EMOTIONAL);
            wain.addDescription(DescriptiveTag.LGBTQ);
            wain.addDescription(DescriptiveTag.YA);
            bookRepository.save(wain);


            Book gruffalo		= new Book	("The Gruffalo",		"This award-winning rhyming story of a mouse and a monster has found its way into the hearts and bedtimes of an entire generation of children. No home should be without The Gruffalo!",		24,	Format.BOARDBOOKFORMAT, "06/04/2017",	"Pan Macmillan",	"9781509830398",	"imgurl",	null);
            gruffalo.addAuthor(jDonaldson);
            gruffalo.addIllustrator(aScheffler);
            gruffalo.addDescription(DescriptiveTag.PICTUREBOOK);
            gruffalo.addDescription(DescriptiveTag.ANIMALS);
            gruffalo.addDescription(DescriptiveTag.ADVENTURE);
            gruffalo.addDescription(DescriptiveTag.SCARY);
            bookRepository.save(gruffalo);

            Book drWhoAutonInvasion		= new Book	("Doctor Who and the Auton Invasion",	"The Doctor is exiled to Earth in the 20th century, his appearance once again changed. His arrival coincides with a meteorite shower. But these are no ordinary meteorites...",		192,	Format.PAPERBACK,	"07/07/2011",	"Ebury Publishing",	"9781849901932",	"imgurl",	null);
            drWhoAutonInvasion.addAuthor(tDicks);
            drWhoAutonInvasion.addDescription(DescriptiveTag.FICTION);
            drWhoAutonInvasion.addDescription(DescriptiveTag.SCARY);
            drWhoAutonInvasion.addDescription(DescriptiveTag.SCIENCEFICTION);
            drWhoAutonInvasion.addDescription(DescriptiveTag.MIDDLEGRADE);
            bookRepository.save(drWhoAutonInvasion);


            Book kindOfSpark	= new Book	("A Kind of Spark",			"A Kind of Spark tells the story of 11-year-old Addie as she campaigns for a memorial in memory of the witch trials that took place in her Scottish hometown. Addie knows there's more to the story of these 'witches', just like there is more to hers.",	192,	Format.PAPERBACK,	"04/06/2020",	"Knights of Media","9781913311223",	"imgurl",	null);
            kindOfSpark.addAuthor(eMcNicoll);
            kindOfSpark.addDescription(DescriptiveTag.FICTION);
            kindOfSpark.addDescription(DescriptiveTag.MIDDLEGRADE);
            bookRepository.save(kindOfSpark);

            Book pet	= new Book	("Pet",	"How do you save the world from monsters if no one will admit they exist?",	208,	Format.PAPERBACK,	"07/11/2019",	"Faber & Faber", "9780571355112",	"imgurl", null);
            pet.addAuthor(aEmezi);
            pet.addDescription(DescriptiveTag.FICTION);
            pet.addDescription(DescriptiveTag.YA);
            bookRepository.save(pet);

            Book hateUGive	= new Book	("The Hate U Give",			"My parents didn’t raise me to fear the police, just to be smart around them. They told me it’s not smart to move whilst a cop has his back to you. Khalil does.",	464,	Format.PAPERBACK,	"06/04/2017",	"Walker Books Ltd",	"9781406372151",	"imgurl",	null);
            hateUGive.addAuthor(aThomas);
            hateUGive.addDescription(DescriptiveTag.FICTION);
            hateUGive.addDescription(DescriptiveTag.YA);
            bookRepository.save(hateUGive);

            Book poetX	= new Book	("The Poet X",	"Xiomara has secrets - her feelings for a boy in her bio class, and the notebook full of poems that she keeps under her bed. And a slam poetry club that will pull those secrets into the spotlight.",	368,	Format.PAPERBACK,	"03/05/2018",	"HarperCollins Publishers",	"9781405291460",	"imgurl", null);
            poetX.addAuthor(eAcevedo);
            poetX.addDescription(DescriptiveTag.FICTION);
            poetX.addDescription(DescriptiveTag.POETRY);
            poetX.addDescription(DescriptiveTag.YA);
            poetX.addDescription(DescriptiveTag.ROMANCE);
            bookRepository.save(poetX);

            Book blackFlamingo	= new Book	("The Black Flamingo",	"Michael waits in the stage wings, wearing a pink wig, pink fluffy coat and black heels.  One more step will see him illuminated by spotlight...Can he emerge as The Black Flamingo?",	368,	Format.PAPERBACK,	"05/03/2020",	"Hachette Children’s Group", "9781444948608",	"imgurl",	null);
            blackFlamingo.addAuthor(dAtta);
            blackFlamingo.addIllustrator(aKhullar);
            blackFlamingo.addDescription(DescriptiveTag.IDENTITY);
            blackFlamingo.addDescription(DescriptiveTag.FICTION);
            blackFlamingo.addDescription(DescriptiveTag.POETRY);
            blackFlamingo.addDescription(DescriptiveTag.ROMANCE);
            blackFlamingo.addDescription(DescriptiveTag.YA);
            bookRepository.save(blackFlamingo);

            BookEntry bookEntry1 = new BookEntry(mrGum, andrewB, null, null , null, Status.WANTTOREAD, "");
            bookEntryRepository.save(bookEntry1);
            BookEntry bookEntry2 = new BookEntry(otter, andrewB, "01/06/2023", null, null, Status.CURRENTLYREADING, "");
            bookEntryRepository.save(bookEntry2);
            BookEntry bookEntry3 = new BookEntry(supertato, andrewB, "01/06/2023", "04/06/2023", 2, Status.HAVEREAD, "alright, kid likes it more than i do");
            bookEntryRepository.save(bookEntry3);
            BookEntry bookEntry4 = new BookEntry(hatback, andrewB, "01/06/2023", "04/06/2023", null, Status.WANTTOREAD, "");
            bookEntryRepository.save(bookEntry4);
            BookEntry bookEntry5 = new BookEntry(goingVolcano, andrewB, "01/06/2023", "04/06/2023", null, Status.CURRENTLYREADING, "");
            bookEntryRepository.save(bookEntry5);
            BookEntry bookEntry6 = new BookEntry(hildaMidnightGiant, andrewB, "01/06/2023", "04/06/2023", 4, Status.HAVEREAD, "loved it loved it loved it loved it");
            bookEntryRepository.save(bookEntry6);
        }
    }
