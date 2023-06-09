import React, { useState, useEffect } from 'react';
import MyBooksContainer from "../Components/userBookshelves/MyBooksContainer";
import Footer from "../Components/Footer/Footer";

const Container = () => {
  const [bookEntryData, setBookEntryData] = useState([]);
  const [books, setBooks] = useState([]);
  const [users, setUsers] = useState([]);

  //   const [bookEntryData, setBookEntryData] = useState([])

  // useEffect(() => {
  //   fetch("http://localhost:8080/bookentries")
  //   .then(res => res.json())
  //   .then(data => setBookEntryData(data))
  // }, [])

  

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
        setBookEntryData(dataArray[0]);
        setBooks(dataArray[1]);
        setUsers(dataArray[2]);
      })
      .catch(error => {
        console.error(error);
      });
  }, []);

  // Rest of your component code

//   return (
//     <div>
//       {/* Render the fetched data */}
//       <h2>Book Entries</h2>
//       {bookEntries.map(entry => (
//         <div key={entry.id}>{entry.title}</div>
//       ))}

//       <h2>Books</h2>
//       {books.map(book => (
//         <div key={book.id}>{book.title}</div>
//       ))}

//       <h2>Users</h2>
//       {users.map(user => (
//         <div key={user.id}>{user.name}</div>
//       ))}
//     </div>
//   );
// };

    return ( 
    <>
        <h2>container</h2>
        <MyBooksContainer bookEntryData={bookEntryData}/>
        <Footer />
    </>
    );
}
 
export default Container;