import React from "react";
import BookEntryList from "./BookEntryList";
import Footer from "../Footer/Footer";

const MyBooksContainer = ({bookEntryData}) => {

    return ( 
<>
        <h1>My Bookshelf</h1>
        <BookEntryList bookEntryData={bookEntryData} />
</>
     );
}
 
export default MyBooksContainer;