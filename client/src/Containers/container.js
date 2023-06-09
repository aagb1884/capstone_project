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

const Container = () => {
  const [bookEntries, setBookEntries] = useState([]);
  const [books, setBooks] = useState([]);
  const [users, setUsers] = useState([]);

  useEffect(() => {
    const urls = [
      'http://localhost:8080/bookentries',
      'http://localhost:8080/books',
      'http://localhost:8080/users',
    ];

    const fetchData = url => {
      return fetch(url)
        .then(response => response.json())
        .catch(error => {
          console.error(error);
        });
    };

    Promise.all(urls.map(url => fetchData(url)))
      .then(dataArray => {
        setBookEntries(dataArray[0]);
        setBooks(dataArray[1]);
        setUsers(dataArray[2]);
      })
      .catch(error => {
        console.error(error);
      });
  }, []);






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
                path="/books" 
                element={< BooksContainer bookData={books}/>} />
              <Route 
                path="/profile" 
                element={< UserContainer />} userData={users} />
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