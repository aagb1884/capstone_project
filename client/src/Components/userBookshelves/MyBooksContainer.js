import React from "react";
import BookEntryList from "./BookEntryList";
import Footer from "../Footer/Footer";

const MyBooksContainer = ({bookEntryData}) => {

    return ( 
<>
        <h3>books container</h3>
        <BookEntryList bookEntryData={bookEntryData} />
        <Footer />
</>
     );
}
 
export default MyBooksContainer;