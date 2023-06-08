import { useState, useEffect } from "react";
import MyBooksContainer from "../Components/userBookshelf/MyBooksContainer";

const Container = () => {

    const [bookData, setBookData] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/books")
    .then(res => res.json())
    .then(data => setBookData(data))
  }, [])

    return ( 
    <>
        <h2>container</h2>
        <MyBooksContainer bookData={bookData}/>
        
        
    </>
    );
}
 
export default Container;