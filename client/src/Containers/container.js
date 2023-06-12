import React, { useState, useEffect } from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from '../Components/Header/Header';
import Footer from "../Components/Footer/Footer";
import HomePage from "../Components/Homepage/HomePage";
import MyBooksContainer from "../Components/userBookshelves/MyBooksContainer";
import UserContainer from '../Components/UserProfile/UserContainer';
import BooksContainer from '../Components/BooksPage/BooksContainer'
import SearchContainer from '../Components/SearchPage/SearchContainer';
import BookEntriesContainer from '../Components/BookEntriesPage/BookEntriesContainer';
import ErrorPage from '../Components/ErrorPage';
import { createBookEntry, getBookEntries, getBookEntriesByBookId, getBookEntriesByUserId, getBookEntriesCurrentlyReading, getBookEntriesHaveRead, getBookEntriesWantToRead } from '../Services/BookEntryServices';
import { getBooks } from '../Services/BookServices';
import { getUsers } from '../Services/UserServices';
import { getAuthors } from '../Services/AuthorServices';
import { getIllustrators } from '../Services/IllustratorServices';
import NewBookEntry from '../Components/Forms/NewBookEntry';

const Container = () => {
  const [bookEntries, setBookEntries] = useState([]);
  const [bookEntriesByWantToRead, setBookEntriesByWantToRead] = useState([]);
  const [bookEntriesByCurrentlyReading, setBookEntriesByCurrentlyReading] = useState([]);
  const [bookEntriesbyHaveRead, setBookEntriesByHaveRead] = useState([]);
  const [bookEntriesbyUserId, setBookEntriesByUserId] = useState([]);
  const [bookEntriesbyBookId, setBookEntriesByBookId] = useState([]);
  const [books, setBooks] = useState([]);
  const [booksBySameAuthor, setBooksBySameAuthor] = useState([]);
  const [booksBySameIllustrator, setBooksBySameIllustrator] = useState([]);
  const [booksInBookEntry, setBooksInBookEntry] = useState([]);
  const [users, setUsers] = useState([]);
  const [authors, setAuthors] = useState([]);
  const [illustrators, setIllustrators] = useState([]);

  useEffect(() => {
    fetchData()
  }, []);
  
    const fetchData = () => {
      Promise.all([getBookEntries(), getBooks(), getUsers(), 
                  getAuthors(), getIllustrators(), getBookEntriesWantToRead(),
                getBookEntriesCurrentlyReading(), getBookEntriesHaveRead(),
              getBookEntriesByUserId(), getBookEntriesByBookId()])
                  .then(([bookEntriesData, booksData, usersData, 
                    authorsData, illustratorsData, wantToReadData,
                  currentlyReadingData, haveReadData, bookEntriesByUserData, 
                  bookEntriesByBookData, booksBySameAuthorData, 
                  booksBySameIllustratorData, booksInBookEntryData]) => {
                      setBookEntries(bookEntriesData);
                      setBooks(booksData);
                      setUsers(usersData);
                      setAuthors(authorsData);
                      setIllustrators(illustratorsData);
                      setBookEntriesByWantToRead(wantToReadData);
                      setBookEntriesByCurrentlyReading(currentlyReadingData);
                      setBookEntriesByHaveRead(haveReadData);
                      setBookEntriesByUserId(bookEntriesByUserData);
                      setBookEntriesByBookId(bookEntriesByBookData);
                      setBooksBySameAuthor(booksBySameAuthorData);
                      setBooksBySameIllustrator(booksBySameIllustratorData);
                      setBooksInBookEntry(booksInBookEntryData);
                    })
                  }

    const addBookEntry = (newBookEntry) => {
      createBookEntry(newBookEntry).then((savedBookEntry) => setBookEntries([...bookEntries, savedBookEntry]));
    }

    // const updateBookEntry= async (id, updatedBookEntry) => {
    //   await updateBookEntry(id, updatedBookEntry)
    //   const bookEntryToEdit = bookEntries.find((bookEntry) => bookEntry._id === id)
    //   const bookEntryIndex = bookEntries.indexOf(bookEntryToEdit)
    //   bookEntryToEdit.name = updatedBookEntry.name
    //   bookToEdit.image_url = updatedBookEntry.image_url
    //   const newBookEntryArray = bookEntries.toSpliced(bookEntryIndex, 1, bookEntryToEdit)
    //   setBookEntries(newBookEntryArray)
    // }

    return  <>
    <div className='flex-wrapper'>
      <Header />
         <Router>
            <Routes>
              <Route 
                path="/" 
                element={< HomePage/>} />
              <Route 
                path="/mybooks" 
                element={< MyBooksContainer bookEntryData={bookEntries}/>} />
              <Route 
                path="/newbookentry" 
                element={< NewBookEntry addBookEntry={addBookEntry} fetchData={fetchData} bookEntries={bookEntries} />} />
              <Route 
                path="/books" 
                element={< BooksContainer bookData={books}/>} />
              <Route 
                path="/profile" 
                element={< UserContainer userData={users}/>}  />
              <Route 
                path="/search" 
                element={< SearchContainer/>} />
              <Route 
                path="/bookentries" 
                element={< BookEntriesContainer bookEntryData={bookEntries}/>} />
              <Route 
                path="*" 
                element={< ErrorPage/>} />
            </Routes>
         </Router>
      <Footer />
      </div>
   </>
    
}
 
export default Container;