# Slightly Better Reads 
## CodeClan Capstone Project

![Screenshot of the app's homepage](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/home_page.png?raw=true)

A cross-platform bookshelf app built with Java and Spring in the backend and React JS at the front.
I think there is a gap in the market for this app – targeted at parents and children’s books – and I think it will consolidate what I’ve learned on the course.

This was a solo project that I worked on for two weeks as part of my [CodeClan](https://codeclan.com/) course.

## MVP

1. A working app where users can log in, search for a book, rate it out of five on a number of criteria, and add a book to the database.
2. An above average README on my Github repo so that anyone can download and run it (including clear description, screenshot, step-by-step installing instructions).

## What I achieved

1. A working app where users can add a book to their bookshelf, rating it out of five on one criteria.
2. This README.

I am pleased with the results. My initial ideas were – I thought – quite scaled down in terms of what I wanted to achieve (there are a *lot* of possible extensions on the project′s Trello board), but still turned out to be overambitious. I am sanguine about this. This was a solo project that I worked on during office hours, with limited time spent on it during evenings and weekends as I have a young family. The intention was always to provide a starting point that could be expanded in terms of functionality, and I have definitely achieved that. 

## What do I need to run it?

Here′s what you need to run it.

* [React](https://react.dev/)
* [React Router](https://reactrouter.com/en/main)
* [Font Awesome](https://fontawesome.com/v5/docs/web/use-with/react)
* [Spring](https://spring.io/)

## How did you build it?

I started by building the backend first. My reasons for doing so were:

1. I felt like I knew what I was doing in terms of design and layout, and had built solo React apps before, but I wanted to build an API myself and improve my knowledge of backend structures which I felt had been a weakpoint for me during the course.
2. It made sense to me for this project to establish what data I′d be working from when building the front end, rather than determining the data through front end design.
3. We′d just done three weeks on Java so it was fresh in my mind.

And so the first few days were spent making notes and designs. 


<img align="left" src="https://github.com/aagb1884/capstone_project/assets/113289014/b8d68fa2-7e76-48e6-a91f-4630b6de4ee4" width="200">

<img align="centre" src="https://github.com/aagb1884/capstone_project/assets/113289014/e6687004-b1d4-49b5-90bf-70b8850f7ebf" width="200">

<img align="right" src="https://github.com/aagb1884/capstone_project/assets/113289014/4aacc598-8087-4b97-a02b-19d2d0fd3776" width="200">

The initial design was refactored to make it simpler, then the refactored design was refactored, and then my instructor′s feedback simplified things further. I then wrote restful routes and derived queries for some of the information I would need, and tested them using [Insomnia](https://insomnia.rest/).

I investigated existing book APIs but they were either tied to large corporation′s bookselling infrastructure – something I wanted to avoid for moral (and, if I′m honest, also aesthetic) reasons – or such sprawling and large bodies of data that it would take to long to sift through them for what I needed (specifically children′s books). As a result I added the data manually, which gave me a database table of 25 books with data specific to my needs.

![Data Entry](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/data_entry.jpeg?raw=true)


Moving to the front end, I made a basic container/component structure and tested the information coming through from one endpoint. Lo and behold, the simplest version of this app.

![The simplest version of this app](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/basic_version.png?raw=true)

So the data was pulling through and I could set up the rest of my fetch requests/services pages/associated functions.

![which was nice](https://media.tenor.com/oTZe_zHlwhcAAAAC/fast-show-which-was-nice.gif)

I then had to refactor the fetch request so I could provide a userId for several queries, which made a few things work but also had a knock on effect elsewhere.

![See if you can spot what′s wrong](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/this_is_fine.png?raw=true)

You may be able to spot the problem. I only realised it once I went to the User page and found a long list of authors (which, to be fair, did look pretty good and made me want to add it in). Refactoring to get the userId meant that I had an extra piece of data set in state and it meant my requests were all getting knocked along one, so they would actually get the data for the next class in the list.

With help from the instructors I managed to get a simple Add Book to Shelf function working (I′d reached for the user ID in the wrong way), and given the time constraints I decided to lock this in as a basis for extending the app.

## BUT ANDREW, HOW DOES IT WORK?

I get that you′re excited but please stop shouting. 

At the backend we have User, Book, Author, Illustrator and BookEntry classes, with enums for specific properties (the book′s format, it′s status as read, adjectives that can be used as descriptive tags for the book). The BookEntry class is actually the join table between the Book and User classes, essentially it′s what the User makes to put the book on their shelf (with optional properties of reviews and ratings).

A Book has at least one Author, and some have at least one Illustrator.  They can have as many descriptive tags as necessary (Extensions include setting up authorisation so users can log in – the current version only has one user – which could include an Administrator and User classes where Administrators would be able to edit/approve edits to a book′s data. Also I′d like to add additional creative roles such as Editor or Audiobook reader to the book′s data). 

A user has a profile page with a list of all the books on their shelf. These are categories by ′Want to Read′, ′Currently Reading′ and ′Have Read′ - the idea here is that friends and relatives will be able to refer to this bookshelf and categorisation when it comes to gift giving.

The header has a burger menu with links to every page. The footer has icons for the user profile, bookshelf and search page. The search page is, at the time of writing, still in development.

The app is not currently responsive.

## Acknowledgements

Here are some people and resources that helped me make the app:

* [Team Scuba Squirrel](https://github.com/GPSPic/Scuba_Squirrel) – another group on the CodeClan course, who allowed me to join their morning stand-ups and offered advice and support throughout.
* [Icons8.com](https://icons8.com/icons)
* The instructors and staff at CodeClan.
* All the artists involved in the songs on [this playlist](https://music.apple.com/gb/playlist/june-2023/pl.u-GgA5e66sd2rL2q)
