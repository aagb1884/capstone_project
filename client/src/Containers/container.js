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


const userData = ({users}) => {
    return <UserContainer userData={userData}/>
}

// const BookData = ({books}) => {
//   return <UserContainer BookData={BookData}/>
// }

const bookEntryData= ({bookEntries}) => {
  return <MyBooksContainer bookEntryData={bookEntryData}/>
}


    return  <>
      <Header />
         <Router>
            <Routes>
              <Route path="/" element={< HomePage/>} />
              <Route path="/mybooks" element={< MyBooksContainer/>} />
              <Route path="/books" element={< BooksContainer/>} />
              <Route path="/profile" element={< UserContainer/>} />
              <Route path="/search" element={< SearchContainer/>} />
              <Route path="/bookentries" element={< BookEntriesContainer/>} />
            </Routes>
         </Router>
      <Footer />
    </>
    
}
 
export default Container;