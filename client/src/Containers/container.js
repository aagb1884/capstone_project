import React, { useState, useEffect } from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from '../Components/Header/Header';
import Footer from "../Components/Footer/Footer";
import HomePage from "../Components/Homepage/HomePage";
import MyBooksContainer from "../Components/userBookshelves/MyBooksContainer";
import UserContainer from '../Components/UserProfile/UserContainer';
import SearchContainer from '../Components/SearchPage/SearchContainer';
import ErrorPage from '../Components/ErrorPage';
import { createBookEntry, getBookEntries, getBookEntriesByBookId, getBookEntriesByUserId, getBookEntriesCurrentlyReading, getBookEntriesHaveRead, getBookEntriesWantToRead } from '../Services/BookEntryServices';
import { getBooks } from '../Services/BookServices';
import { getUsers } from '../Services/UserServices';
import { getAuthors } from '../Services/AuthorServices';
import { getIllustrators } from '../Services/IllustratorServices';
import { createUser } from '../Services/UserServices';
import NewBookEntry from '../Components/Forms/NewBookEntry';
import AboutPage from '../About';
import NewUserEntry from '../Components/Forms/NewUserEntry';

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
  const [loggedInUser, setLoggedInUser] = useState(null)
  const [authors, setAuthors] = useState([]);
  const [illustrators, setIllustrators] = useState([]);


  useEffect(() => {
    fetchData()
  }, []);
  
    const fetchData = () => {
      getUsers()
        .then(users => {
          setLoggedInUser(users[0])
          const userId = users[0].id
        Promise.all([getBookEntries(), getBooks(), 
            getAuthors(), getIllustrators(), getBookEntriesWantToRead(userId),
          getBookEntriesCurrentlyReading(userId), getBookEntriesHaveRead(userId),
        getBookEntriesByUserId(userId)])
            .then(([bookEntriesData, booksData,
              authorsData, illustratorsData, wantToReadData,
            currentlyReadingData, haveReadData, bookEntriesByUserData, booksBySameAuthorData, 
            booksBySameIllustratorData, booksInBookEntryData]) => {
                setBookEntries(bookEntriesData);
                setBooks(booksData);
                setUsers(users);
                setAuthors(authorsData);
                setIllustrators(illustratorsData);
                setBookEntriesByWantToRead(wantToReadData);
                setBookEntriesByCurrentlyReading(currentlyReadingData);
                setBookEntriesByHaveRead(haveReadData);
                setBookEntriesByUserId(bookEntriesByUserData);
                setBooksBySameAuthor(booksBySameAuthorData);
                setBooksBySameIllustrator(booksBySameIllustratorData);
                setBooksInBookEntry(booksInBookEntryData);
              })
        })
      
                  }

    const addBookEntry = (newBookEntry) => {
      createBookEntry(newBookEntry, loggedInUser).then((savedBookEntry) => setBookEntries([...bookEntries, savedBookEntry]));
    }

    const addNewUser = (newUser) => {
      createUser(newUser, loggedInUser).then((savedUser) => setUsers([...users, savedUser]));
    }


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
                element={< MyBooksContainer
                wantToRead={bookEntriesByWantToRead}
                currentlyReading={bookEntriesByCurrentlyReading}
                haveRead={bookEntriesbyHaveRead}
                />} />
              <Route 
                path="/newbookentry" 
                element={< NewBookEntry addBookEntry={addBookEntry} 
                fetchData={fetchData} 
                bookEntries={bookEntries} 
                books={books} />} />
              <Route 
                path="/profile" 
                element={< UserContainer 
                userData={users}
                userBooks={bookEntriesbyUserId}
                />}  />
              <Route 
                path="/booksearch" 
                element={< SearchContainer
                books={books}
                />} />
              <Route
                path='/about'
                element={< AboutPage />} />  
              <Route
                path='/newuser'
                element={< NewUserEntry 
                addNewUser={addNewUser}
                users={users}
                fetchData={fetchData} />} />  
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