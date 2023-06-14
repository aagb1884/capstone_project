# Slightly Better Reads 
## CodeClan Capstone Project

![Screenshot of the app's homepage](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/home_page.png?raw=true)

A cross-platform bookshelf app built with Java and Spring in the backend and React JS at the front.
I think there is a gap in the market for this app – targeted at parents and children’s books – and I think it will consolidate what I’ve learned on the course.

This was a solo project that I worked on for two weeks as part of my [CodeClan](https://codeclan.com/) course.

## MVP

1. A working app where users can log in, search for a book, rate it out of five on a number of criteria, and add a book to the database.
2. An above average README on my Github repo so that anyone can download and run it (including clear description, screenshot, step-by-step installing instructions) - NB. This step very much a work in progress.

## What I achieved

1. A working app where users can add a book to their bookshelf, rating it out of five on one criteria.
2. This README.

I am pleased with the results. My initial ideas were – I thought – quite scaled down in terms of what I wanted to achieve (there are a lot of possible extensions on the project′s Trello board), but still turned out to be overambitious. I am sanguine about this. This was a solo project that I worked on during office hours, with limited time spent on it during evenings and weekends as I have a young family. The intention was always to provide a starting point that could be expanded in terms of functionality, and I have definitely achieved that. 

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

![Photo 1 of some of my notes](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/notes1.jpeg?raw=true)
![Photo 2 of some of my notes](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/notes2.jpeg?raw=true)
![Photo 3 of some of my notes](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/notes3.jpeg?raw=true)

The initial design was refactored to make it simpler, then the refactored design was refactored, and then my instructor′s feedback simplified things further. I then wrote restful routes and derived queries for some of the information I would need, and tested them using [Insomnia](https://insomnia.rest/).

I investigated existing book APIs but they were either tied to large corporation′s bookselling infrastructure – something I wanted to avoid for moral (and, if I′m honest, also aesthetic) reasons – or such sprawling and large bodies of data that it would take to long to sift through them for what I needed (specifically children′s books). As a result I added the data manually, which gave me a database table of 25 books with data specific to my needs.

![Data Entry](https://github.com/aagb1884/capstone_project/blob/adding_services/client/public/README_images/data_entry.jpeg?raw=true)


Moving to the front end, I made a basic container/component structure and tested the information coming through from one endpoint. Lo and behold, the simplest version of this app.

![The simplest version of this app](https://previews.dropbox.com/p/thumb/AB7O59zmLxHiANFsvnvOlxifgG5gxHUtqc9H-5lKa6iUX7rfMKkzPRT4qZmhO4Naok9ThhlcsPrZLasmimrhBa2lPfUAheG3Xq3JQr2VFIQvtsZ-T1VCMWLCPyELFAzhVHHdAYZK5h7n7o_BmOfP7I52vwZE_DDby-A5wY7JMo30L5dOiNf0yodncnH_7giuuF3uXOsVrlHk2MIcH-R9qFcBnCD85QIWOmpOduxklwiWr53IlYZT8dAKFI3saeUjiFR1kwCo0SQZisCejoJy73m4CTbZ4bU-EteUhhF1SZoW4e3XGxUY_jaCpmaI-KKgJpRxXbWP1RFiUKRJKKNVfwgpX2Fgre7oMegaCTr00TqjV34ISWoQLoeVg1cziFQM9dc/p.jpeg)

## BUT ANDREW, HOW DOES IT WORK?

I get that you′re excited but please stop shouting. 



##Acknowledgements

Here are some people and resources that helped me make the app:

* [Team Scuba Squirrel](https://github.com/GPSPic/Scuba_Squirrel) – another group on the CodeClan course, who allowed me to join their morning stand-ups and offered advice and support throughout.
* [Icons8.com](https://icons8.com/icons)
