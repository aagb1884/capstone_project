import React from "react";
import BookEntryList from "./BookEntryList";

const MyBooksContainer = ({bookEntryData, wantToRead, currentlyReading, haveRead, byBookId, byUserId}) => {

    return ( 
<>
        <h1>My Bookshelf</h1>
        <BookEntryList 
        bookEntryData={bookEntryData}
        wantToRead={wantToRead}
        currentlyReading={currentlyReading}
        haveRead={haveRead}
        byBookId={byBookId}
        byUserId={byUserId}
         />
</>
     );
}
 
export default MyBooksContainer;