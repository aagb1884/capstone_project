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

            User jazzyJeff = new User("Jazzy", "Jeff", "imgurl", "Do any of you kids remember the Fresh Prince of Bel Air?");
            userRepository.save(jazzyJeff);

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
            authorRepository.save(shendra);
            Illustrator ishendra = new Illustrator("Sue", "Hendra", "imgurl", "Sue Hendra grew up in Wimbledon and has always loved making up stories and drawing pictures. Her favourite book as a child was Mr Silly. She graduated from Brighton University in 1994 and has been creating picture books ever since. In 2006 she met Paul Linnet and could instantly see that she’d met a fellow nitwit who liked talking nonsense. They went on to create many bestselling books together, working in a small room in their house in Brighton. Sue loves swimming, and can swim up and down for a very long time. Her favourite book is still Mr Silly.");
            illustratorRepository.save(ishendra);
            Author plinnet = new Author("Paul", "Linnet", "imgurl", "Paul Linnet was born in Brighton and grew up in the Midlands, reading Tintin and playing classic 80s video games, before becoming obsessed with scribbling, writing, guitars and motorcycles. He studied Graphic Design at Derby University, and later moved back to Brighton where he met Sue Hendra. They made up a story about a fish with fingers and then a slug with a doughnut for a shell, and now no one can stop them from writing more and more frankly ridiculous books. They live in Brighton – and Paul still loves scribbling, writing, guitars and motorcycles.");
            authorRepository.save(plinnet);
            Illustrator iplinnet = new Illustrator("Paul", "Linnet", "imgurl", "Paul Linnet was born in Brighton and grew up in the Midlands, reading Tintin and playing classic 80s video games, before becoming obsessed with scribbling, writing, guitars and motorcycles. He studied Graphic Design at Derby University, and later moved back to Brighton where he met Sue Hendra. They made up a story about a fish with fingers and then a slug with a doughnut for a shell, and now no one can stop them from writing more and more frankly ridiculous books. They live in Brighton – and Paul still loves scribbling, writing, guitars and motorcycles.");
            illustratorRepository.save(iplinnet);
            Author fwatt = new Author("Fiona", "Watt", "imgurl", "Fiona Watt wrote some books.");
            authorRepository.save(fwatt);
            Illustrator rwells = new Illustrator("Rachel", "Wells", "imgurl", "Rachel Wells illustrated some books.");
            illustratorRepository.save(rwells);
            Author nshireen = new Author("Nadia", "Shireen", "imgurl", "Nadia Shireen enjoyed making homemade magazines and comics as a child. She studied law at university and then worked in magazine journalism; it was during this time that she started to draw again. After a lifetime of doodling in the sidelines, Nadia decided to pay some attention to drawing and in 2007 was accepted onto an MA course in Children's Book Illustration at Anglia Ruskin University, Cambridge. Her debut book Good Little Wolf received a mention in the Bologna Ragazzi Opera Prima Award and won the UKLA Book Award. Nadia has been shortlisted for the Roald Dahl Funny Prize and the Waterstones Children's Book Prize. She lives in London.");
            authorRepository.save(nshireen);
            Illustrator inshireen = new Illustrator("Nadia", "Shireen", "imgurl", "Nadia Shireen enjoyed making homemade magazines and comics as a child. She studied law at university and then worked in magazine journalism; it was during this time that she started to draw again. After a lifetime of doodling in the sidelines, Nadia decided to pay some attention to drawing and in 2007 was accepted onto an MA course in Children's Book Illustration at Anglia Ruskin University, Cambridge. Her debut book Good Little Wolf received a mention in the Bologna Ragazzi Opera Prima Award and won the UKLA Book Award. Nadia has been shortlisted for the Roald Dahl Funny Prize and the Waterstones Children's Book Prize. She lives in London.");
            illustratorRepository.save(inshireen);
            Illustrator mOrdonez = new Illustrator("Miguel", "Ordonez", "imgurl", "Miguel Ordóñez has had two of his books in the New York Times bestsellers list and his illustrations for Jimmy Fallon’s Your Baby’s First Word Will Be Dada have been honoured by the American Society of Illustrators. He lives in Madrid and works in his own studio, where he combines graphic design with illustrating projects as well as teaching visual communication and creativity.");
            illustratorRepository.save(mOrdonez);
            Author lPearson = new Author("Luke", "Pearson", "imgurl", "Luke Pearson is a British writer, illustrator and cartooonist.");
            authorRepository.save(lPearson);
            Illustrator iLPearson = new Illustrator("Luke", "Pearson", "imgurl", "Luke Pearson is a British writer, illustrator and cartooonist.");
            illustratorRepository.save(iLPearson);
            Author eCarle = new Author ("Eric", "Carle", "imgurl", "Eric Carle is a writer and illustrator.");
            authorRepository.save(eCarle);
            Illustrator iECarle = new Illustrator("Eric", "Carle", "imgurl", "Eric Carle is a writer and illustrator.");
            illustratorRepository.save(iECarle);
            Author aAhlberg = new Author ("Alan", "Ahlberg", "imgurl", "Alan Ahlberg is a writer.");
            authorRepository.save(aAhlberg);
            Author jAhlberg = new Author ("Janet", "Ahlberg", "imgurl", "Janet Ahlberg is a writer and illustrator.");
            authorRepository.save(jAhlberg);
            Illustrator iJAhlberg = new Illustrator("Janet", "Ahlberg", "imgurl", "Janet Ahlberg is a writer and illustrator.");
            illustratorRepository.save(iJAhlberg);
            Author sMcBratney = new Author ("Sam", "McBratney", "imgurl", "Sam McBratney is a writer.");
            authorRepository.save(sMcBratney);
            Illustrator aJeram = new Illustrator("Anita", "Jeram", "imgurl", "Anita Jeram is an illustrator.");
            illustratorRepository.save(aJeram);
            Author lDodd = new Author ("Lynley", "Dodd", "imgurl", "Lynley Dodd is a writer and illustrator.");
            authorRepository.save(lDodd);
            Illustrator iLDodd = new Illustrator("Lynley", "Dodd", "imgurl", "Lynley Dodd is a writer and illustrator.");
            illustratorRepository.save(iLDodd);
            Author ladybird = new Author ("Ladybird", "", "", "");
            authorRepository.save(ladybird);
            Illustrator lemonRibbonStudio = new Illustrator("Lemon Ribbon", "Studio", "", "");
            illustratorRepository.save(lemonRibbonStudio);
            Author oJeffers = new Author ("Oliver", "Jeffers", "imgurl", "Oliver Jeffers is a writer and illustrator.");
            authorRepository.save(oJeffers);
            Illustrator iOJeffers = new Illustrator("Oliver", "Jeffers", "imgurl", "Oliver Jeffers is a writer and illustrator.");
            illustratorRepository.save(iOJeffers);
            Author mHood = new Author ("Morag", "Hood", "imgurl", "Morag Hood is a writer and illustrator.");
            authorRepository.save(mHood);
            Illustrator iMHood = new Illustrator("Morag", "Hood", "imgurl", "Morag Hood is a writer and illustrator.");
            illustratorRepository.save(iMHood);
            Author drSeuss = new Author ("Dr.", "Seuss", "imgurl", "Dr Seuss is Dr Seuss.");
            authorRepository.save(drSeuss);
            Illustrator iDrSeuss = new Illustrator("Dr.", "Seuss", "imgurl", "Dr Seuss is Dr Seuss.");
            illustratorRepository.save(iDrSeuss);
            Author iEagleton = new Author ("Ian", "Eagleton", "imgurl", "Ian Eagleton is a writer.");
            authorRepository.save(iEagleton);
            Illustrator jMayhew = new Illustrator("James", "Mayhew", "imgurl", "James Mayhew is an illustrator.");
            illustratorRepository.save(jMayhew);
            Author rPlummer = new Author ("Rachel", "Plummer", "imgurl", "Rachel Plummer is a poet living in Edinburgh, Scotland.");
            authorRepository.save(rPlummer);
            Illustrator hBoppert = new Illustrator("Helene", "Boppert", "imgurl", "Helene Boppert is an artist.");
            illustratorRepository.save(hBoppert);
            Author jDonaldson = new Author ("Julia", "Donaldson", "imgurl", "Oh you know. Julia Donaldson.");
            authorRepository.save(jDonaldson);
            Illustrator aScheffler = new Illustrator("Axel", "Scheffler", "imgurl", "The artist Axel Scheffler has his fingers in many pies.");
            illustratorRepository.save(aScheffler);
            Author dAtta = new Author ("Dean", "Atta", "imgurl", "Dean Atta is a writer, performer and poet.");
            authorRepository.save(dAtta);
            Illustrator aKhullar = new Illustrator("Anshika", "Khullar", "imgurl", "Anshika Kullar is an illustrator.");
            illustratorRepository.save(aKhullar);
            Author tDicks = new Author ("Terrance", "Dicks", "imgurl", "Terrance Dicks wrote bloody hundreds of Doctor Who novels and Script Edited the show in the Seventies, then repeated the same anecdotes at conventions for decades and wrote some hilariously bad spin-off novels.");
            authorRepository.save(tDicks);
            Author eMcNicoll = new Author ("Elle", "McNicoll", "imgurl", "Elle McNicoll is a writer.");
            authorRepository.save(eMcNicoll);
            Author aThomas = new Author ("Angie", "Thomas", "imgurl", "Angie Thomas is a writer.");
            authorRepository.save(aThomas);
            Author eAcevedo = new Author ("Elizabeth", "Acevedo", "imgurl", "Elizabeth Acevedo is a writer, performer and poet.");
            authorRepository.save(eAcevedo);
            Author aEmezi = new Author ("Akwaeke", "Emezi", "imgurl", "Akwaeke Emezi is a writer.");
            authorRepository.save(aEmezi);

            Book mrGum = new Book("You're a Bad Man Mr Gum", "Shabba me whiskers! It's one of those Mr Gum books by Andy Stanton. They're only the craziest, funnest most amazing books for children in the world. You're A Bad Man, Mr Gum! Good evening. Mr Gum is a complete horror who hates children, animals, fun and corn on the cob. This book's all about him. And an angry fairy who lives in his bathtub. And Jake the dog, and a little girl called Polly and an evil, stinky butcher all covered in guts. And there's heroes and sweets and adventures and EVERYTHING.", 192, Format.PAPERBACK, "07/08/2006", "Egmont UK Ltd", "9781405223102", "url.com", null);
            mrGum.addAuthor(stanton);
            mrGum.addIllustrator(tazzyman);
            mrGum.addDescription(DescriptiveTag.FICTION);
            mrGum.addDescription(DescriptiveTag.FUNNY);
            mrGum.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(mrGum);
            Book otter = new Book("That's Not My Otter", "Meet five adorable otters in this charming addition to the much-loved That's not my... series. Babies love the best-selling That's not my... books with their bold illustrations, patches to stroke, and a mouse to spot on every page, all designed to develop sensory and language awareness.", 10, Format.BOARDBOOKFORMAT, "06/04/2017", "Usborne Publishing Ltd.", "9781474933759", "url.com", null);
            otter.addAuthor(fwatt);
            otter.addIllustrator(rwells);
            otter.addDescription(DescriptiveTag.BOARDBOOK);
            otter.addDescription(DescriptiveTag.BABYBOOK);
            otter.addDescription(DescriptiveTag.TEXTURES);
            otter.addDescription(DescriptiveTag.SENSORY);
            bookRepository.save(otter);

            Book supertato = new Book("Three Epic Adventures of Supertato", "Meet Supertato! The much-loved supermarket superhero who's there to save the day when the chips are down stars in three epic adventures.", 80 , Format.PAPERBACK, "05/01/2023", "Simon & Schuster Ltd.", "9781398517783", "url.com", null);
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
                    "In his bestselling debut picture book, the multiple award-winning Jon Klassen, illustrator of This Is Not My Hat and Sam and Dave Dig a Hole, tells the story of a bear who's hat has gone. And he wants it back. Patiently and politely, he asks the animals he comes across, one by one, whether they have seen it. Each animal says no (some more elaborately than others). But just as it he begins to lose hope, lying flat on his back in despair, a deer comes by and asks a rather obvious question that suddenly sparks the bear's memory and renews his search with a vengeance... Told completely in dialogue, this quirky, hilarious, read-aloud tale plays out in sly illustrations brimming with visual humour and winks at the reader who will be thrilled to be in on the joke.", 40,Format.PAPERBACK, "04/10/2012", "Walker Books Ltd", "9781406338539", "url.com", null);
            hatback.addAuthor(klassen);
            hatback.addIllustrator(iKlassen);
            hatback.addDescription(DescriptiveTag.PICTUREBOOK);
            hatback.addDescription(DescriptiveTag.ANIMALS);
            hatback.addDescription(DescriptiveTag.FUNNY);
            hatback.addDescription(DescriptiveTag.SCARY);
            bookRepository.save(hatback);

            Book billyPirates = new Book("Billy and the Pirates", "Ahoy there! It's time to sail the ocean blue with Billy and her trusty feline friend, as they embark on a noble seafaring adventure.\n" +
                    "\n" +
                    "Billy and Fatcat find a mysterious message in a bottle at sea. When suddenly something terrible happens: they bump into a pesky pirate and his smelly crew. Oh no!", 32, Format.PAPERBACK, "21/07/2022", "Penguin Random House", "9781780081373", "url.com", null);
            billyPirates.addAuthor(nshireen);
            billyPirates.addIllustrator(inshireen);
            billyPirates.addDescription(DescriptiveTag.PICTUREBOOK);
            billyPirates.addDescription(DescriptiveTag.FUNNY);
            billyPirates.addDescription(DescriptiveTag.ADVENTURE);
            bookRepository.save(billyPirates);

            Book goingVolcano = new Book("Going to the Volcano", "“Buckle up and jump on board for the funniest, most EXPLOSIVE picture book of the year - you'll want to read it again and again-o!\n" +
                    "\n" +
                    "Join two intrepid explorers as they take a train-o, jump on a plane-o, ride a Great Dane-o (down the lane-o) on their way to look at the volcano. Nothing could possibly go wrong - could it?!", 32, Format.PAPERBACK, "04/04/2019","Hachette Children’s Group","9781444933451", "imgurl", null);
            goingVolcano.addAuthor(stanton);
            goingVolcano.addIllustrator(mOrdonez);
            goingVolcano.addDescription(DescriptiveTag.PICTUREBOOK);
            goingVolcano.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(goingVolcano);

            Book hildaMidnightGiant = new Book("Hilda and the Midnight Giant", "Hilda sets out to learn the secrets of the Midnight Giant in this brand new edition of the bestselling classic! When creatures bombard Hilda's house with eviction notices, she has to think twice before making their acquaintance. Come to think of it, who is this giant who only appears at midnight, and why is Hilda the only person who can see him?", 48, Format.PAPERBACK, "01/02/2016", "Flying Eye Books", "9781909263796", "url"  , null);
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

            Book each_peach	= new Book	("Each Peach Pear Plum",	"A beautiful brand new cased board book version of this classic picture book by the iconic Janet and Allan Ahlberg. Each Peach Pear Plum introduces characters from well-known nursery stories, such as the Three Bears, Mother Hubbard and Tom Thumb, and encourages children to participate and to find the characters hidden in the pictures. The text, with its strong rhyme and rhythm, is perfect to read aloud to very young children, while the game of 'I Spy' keeps children enthralled.",	34,	Format.BOARDBOOKFORMAT,"06/04/2017",	"Penguin Random House",	"9780141379524",	"imgurl",	null);
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

            Book hairyMacLary1 = new Book	("Hairy Maclary from Donaldson’s Dairy",	"Hairy Maclary goes off for a walk in town, followed by a few friends - and comes up against a nasty surprise in the shape of Scarface Claw!  Discover the lovable rogue, Hairy Maclary, and his four-footed friends in this hilarious classic tale. With unforgettable illustrations and a brilliant rhyming text, it's a true delight to read aloud again and again. This new cased board book edition is the perfect size for little hands.", 36,	Format.BOARDBOOKFORMAT,	"04/07/2002",	"Penguin Random House",	"9780670913503",	"imgurl",	null);
            hairyMacLary1.addAuthor(lDodd);
            hairyMacLary1.addIllustrator(iLDodd);
            hairyMacLary1.addDescription(DescriptiveTag.BOARDBOOK);
            hairyMacLary1.addDescription(DescriptiveTag.PICTUREBOOK);
            hairyMacLary1.addDescription(DescriptiveTag.ANIMALS);
            bookRepository.save(hairyMacLary1);

            Book babyTouchPlaybook = new Book	("Baby Touch: Playbook",	"A brilliant first playbook from the Ladybird Baby Touch series.  Parent and child can explore the world together with this multi-sensory book from the innvoative Baby Touch range. This bright and bold book features flaps to lift and die-cut pieces on each spread, all perfectly designed for first discovery and experience.  Ladybird's Baby Touch series is the perfect way to introduce babies to books, and to the world around them. Encouraging interaction and play, these books are lots of fun for the very youngest babies, as well as toddlers.",		12,	Format.BOARDBOOKFORMAT	, "13/06/2019",	"Penguin Random House",	"9780241379134",	"imgurl",	null);
            babyTouchPlaybook.addAuthor(ladybird);
            babyTouchPlaybook.addIllustrator(lemonRibbonStudio);
            babyTouchPlaybook.addDescription(DescriptiveTag.BOARDBOOK);
            babyTouchPlaybook.addDescription(DescriptiveTag.ANIMALS);
            babyTouchPlaybook.addDescription(DescriptiveTag.SENSORY);
            babyTouchPlaybook.addDescription(DescriptiveTag.BABYBOOK);
            babyTouchPlaybook.addDescription(DescriptiveTag.TEXTURES);
            bookRepository.save(babyTouchPlaybook);

            Book aLittleStuck = new Book	("A Little Stuck",	"A specially adapted board book edition of Oliver Jeffers' laugh-out-loud classic, Stuck.  Floyd gets his kite stuck up a tree. He throws up his shoe to shift it, but that gets stuck too. So he throws up his other shoe and that gets stuck, along with... a ladder, a pot of paint, the kitchen sink, an orang-utan and a whale, amongst other things!  Will Floyd ever get his kite back?",		30,	Format.BOARDBOOKFORMAT,	"02/06/2016",	"HarperCollins Publishers",	"9780008170868",	"imgurl",	null);
            aLittleStuck.addAuthor(oJeffers);
            aLittleStuck.addIllustrator(iOJeffers);
            aLittleStuck.addDescription(DescriptiveTag.BOARDBOOK);
            aLittleStuck.addDescription(DescriptiveTag.PICTUREBOOK);
            aLittleStuck.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(aLittleStuck);

            Book whenGrandadPenguin	= new Book	("When Grandad Was a Penguin", "What do you do when your Grandad starts acting VERY much like a penguin? Find out in this brilliantly funny and heartwarming story from talented author and illustrator, Morag Hood. Boys and girls alike will love the witty, sweet and brilliantly surreal depiction of everyday settings and situations in this fish-out-of-water story with a difference.",	32,	Format.PAPERBACK,	"05/04/2018",	"Pan Macmillan",	"9781509850976",	"imgurl",	null);
            whenGrandadPenguin.addAuthor(mHood);
            whenGrandadPenguin.addIllustrator(iMHood);
            whenGrandadPenguin.addDescription(DescriptiveTag.PICTUREBOOK);
            whenGrandadPenguin.addDescription(DescriptiveTag.SILLY);
            bookRepository.save(whenGrandadPenguin);

            Book drSeussSleepBook = new Book	("Dr Seuss’s Sleep Book",	"A sleepy tale full of wonderful yawning creatures from the iconic Dr. Seuss, gets a brand new look! This book is the original (and the best) remedy for children who don't want to go to sleep.  Sleep thoughts are spreading Throughout the whole land The time for night-brushing of teeth is at hand!",		64,	Format.PAPERBACK,	"04/05/2017",	"HarperCollins Publishers",	"9780008236069",	"imgurl",	null);
            drSeussSleepBook.addAuthor(drSeuss);
            drSeussSleepBook.addIllustrator(iDrSeuss);
            drSeussSleepBook.addDescription(DescriptiveTag.PICTUREBOOK);
            drSeussSleepBook.addDescription(DescriptiveTag.SILLY);
            drSeussSleepBook.addDescription(DescriptiveTag.BEDTIME);
            bookRepository.save(drSeussSleepBook);

            Book nenLonelyFisherman	= new Book	("Nen and the Lonely Fisherman",	"Far out to sea and deep below the whispering waves lives a merman called Nen. Nen spends his days exploring his underwater kingdom, but something is missing: his heart is empty. So, Nen ventures to the forbidden world above and it is here that he meets Ernest, a lonely fisherman. But can two people from different worlds be together and what will happen when a terrifying storm gathers?",	32,	Format.PAPERBACK,	"01/06/2021",	"Owlet Press", "9781913339098",	"imgurl",	null);
            nenLonelyFisherman.addAuthor(iEagleton);
            nenLonelyFisherman.addIllustrator(jMayhew);
            nenLonelyFisherman.addDescription(DescriptiveTag.PICTUREBOOK);
            nenLonelyFisherman.addDescription(DescriptiveTag.EMOTIONAL);
            nenLonelyFisherman.addDescription(DescriptiveTag.LGBTQ);
            bookRepository.save(nenLonelyFisherman);

            Book	wain	= new Book	("Wain: LGBT reimaginings of Scottish folktales",	"Wain is a collection of LGBT themed children's poetry based on retellings of Scottish myths. The collection contains stories about kelpies, selkies, and the Loch Ness Monster, alongside lesser-known mythical people and creatures, such as wulvers, Ghillie Dhu, and the Cat Sith. These poems immerse readers in an enriching vision of contemporary life.",		88,	Format.PAPERBACK,	"29/02/2019",	"The Emma Press",	"9781910139479",	"imgurl",	null);
            wain.addAuthor(rPlummer);
            wain.addIllustrator(hBoppert);
            wain.addDescription(DescriptiveTag.POETRY);
            wain.addDescription(DescriptiveTag.EMOTIONAL);
            wain.addDescription(DescriptiveTag.LGBTQ);
            wain.addDescription(DescriptiveTag.YA);
            bookRepository.save(wain);


            Book gruffalo		= new Book	("The Gruffalo",		"This award-winning rhyming story of a mouse and a monster has found its way into the hearts and bedtimes of an entire generation of children and will undoubtedly continue to enchant children for years and years to come. No home should be without The Gruffalo!",		24,	Format.BOARDBOOKFORMAT, "06/04/2017",	"Pan Macmillan",	"9781509830398",	"imgurl",	null);
            gruffalo.addAuthor(jDonaldson);
            gruffalo.addIllustrator(aScheffler);
            gruffalo.addDescription(DescriptiveTag.PICTUREBOOK);
            gruffalo.addDescription(DescriptiveTag.ANIMALS);
            gruffalo.addDescription(DescriptiveTag.ADVENTURE);
            gruffalo.addDescription(DescriptiveTag.SCARY);
            bookRepository.save(gruffalo);

            Book drWhoAutonInvasion		= new Book	("Doctor Who and the Auton Invasion",	"Put on trial by the Time Lords, and found guilty of interfering in the affairs of other worlds, the Doctor is exiled to Earth in the 20th century, his appearance once again changed. His arrival coincides with a meteorite shower. But these are no ordinary meteorites.",		192,	Format.PAPERBACK,	"07/07/2011",	"Ebury Publishing",	"9781849901932",	"imgurl",	null);
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

            Book pet	= new Book	("Pet",	"How do you save the world from monsters if no one will admit they exist?  She stumbled backwards, her eyes wide, as the figure started coming out of the canvas ... She tried to be brave. Well, she said, her hands only a little shaky, at least tell me what I should call you. ... Well, little girl, it replied, I suppose you can call me Pet.",	208,	Format.PAPERBACK,	"07/11/2019",	"Faber & Faber", "9780571355112",	"imgurl", null);
            pet.addAuthor(aEmezi);
            pet.addDescription(DescriptiveTag.FICTION);
            pet.addDescription(DescriptiveTag.YA);
            bookRepository.save(pet);

            Book hateUGive	= new Book	("The Hate U Give",			"My parents didn’t raise me to fear the police, just to be smart around them. They told me it’s not smart to move whilst a cop has his back to you. Khalil does.",	464,	Format.PAPERBACK,	"06/04/2017",	"Walker Books Ltd",	"9781406372151",	"imgurl",	null)′
            hateUGive.addAuthor(aThomas);
            hateUGive.addDescription(DescriptiveTag.FICTION);
            hateUGive.addDescription(DescriptiveTag.YA);
            bookRepository.save(hateUGive);

            Book poetX	= new Book	("The Poet X",	"Xiomara has always kept her words to herself.  When it comes to standing her ground in her Harlem neighbourhood, she lets her fists and her fierceness do the talking. But X has secrets - her feelings for a boy in her bio class, and the notebook full of poems that she keeps under her bed. And a slam poetry club that will pull those secrets into the spotlight.",	368,	Format.PAPERBACK,	"03/05/2018",	"HarperCollins Publishers",	"9781405291460",	"imgurl", null);
            poetX.addAuthor(eAcevedo);
            poetX.addDescription(DescriptiveTag.FICTION);
            poetX.addDescription(DescriptiveTag.POETRY);
            poetX.addDescription(DescriptiveTag.YA);
            poetX.addDescription(DescriptiveTag.ROMANCE);
            bookRepository.save(poetX);

            Book blackFlamingo	= new Book	("The Black Flamingo",	"This is not about being ready, it's not even about being fierce, or fearless, it's about being free.  Michael waits in the stage wings, wearing a pink wig, pink fluffy coat and black heels.  One more step will see him illuminated by spotlight.  He has been on a journey of bravery to get here, and he is almost ready to show himself to the world in bold colours ...  Can he emerge as The Black Flamingo?",	368,	Format.PAPERBACK,	"05/03/2020",	"Hachette Children’s Group", "9781444948608",	"imgurl",	null);
            blackFlamingo.addAuthor(dAtta);
            blackFlamingo.addIllustrator(aKhullar);
            blackFlamingo.addDescription(DescriptiveTag.IDENTITY);
            blackFlamingo.addDescription(DescriptiveTag.FICTION);
            blackFlamingo.addDescription(DescriptiveTag.POETRY);
            blackFlamingo.addDescription(DescriptiveTag.ROMANCE);
            blackFlamingo.addDescription(DescriptiveTag.YA);
            bookRepository.save(blackFlamingo);

            BookEntry bookEntry1 = new BookEntry(mrGum, andrewB, null, null , null, Status.WANTTOREAD);
            bookEntryRepository.save(bookEntry1);
            BookEntry bookEntry2 = new BookEntry(otter, andrewB, "01/06/2023", null, null, Status.CURRENTLYREADING);
            bookEntryRepository.save(bookEntry2);
            BookEntry bookEntry3 = new BookEntry(supertato, andrewB, "01/06/2023", "04/06/2023", 2, Status.HAVEREAD);
            bookEntryRepository.save(bookEntry3);
            BookEntry bookEntry4 = new BookEntry(hatback, andrewB, "01/06/2023", "04/06/2023", null, Status.WANTTOREAD);
            bookEntryRepository.save(bookEntry4);
            BookEntry bookEntry5 = new BookEntry(goingVolcano, andrewB, "01/06/2023", "04/06/2023", null, Status.CURRENTLYREADING);
            bookEntryRepository.save(bookEntry5);
            BookEntry bookEntry6 = new BookEntry(hildaMidnightGiant, andrewB, "01/06/2023", "04/06/2023", 4, Status.HAVEREAD);
            bookEntryRepository.save(bookEntry6);
        }
    }
