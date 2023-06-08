import React from "react";
import BookEntryList from "./BookEntryList";
import Footer from "../Footer";

const MyBooksContainer = ({bookData}) => {

    return ( 
<>
        <h3>books container</h3>
        <BookEntryList bookData={bookData} />
        <Footer />
</>
     );
}
 
export default MyBooksContainer;