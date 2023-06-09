import { useState, useEffect } from "react";
import MyBooksContainer from "../Components/userBookshelves/MyBooksContainer";

const Container = () => {

    const [bookEntryData, setBookEntryData] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/bookentries")
    .then(res => res.json())
    .then(data => setBookEntryData(data))
  }, [])

    return ( 
    <>
        <h2>container</h2>
        <MyBooksContainer bookEntryData={bookEntryData}/>
        
        
    </>
    );
}
 
export default Container;