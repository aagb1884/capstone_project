import React from "react";
import WantToReadList from "./WantToRead/WantToReadList";
import CurrentlyReadingList from "./CurrentlyReading/CurrentlyReadingList";
import HaveReadList from "./HaveRead/HaveReadList";
import './myBooks.css';

const MyBooksContainer = ({wantToRead, currentlyReading, haveRead}) => {

    return ( 
<section className='my-bookshelf'>
        <h1>My Bookshelf</h1>
        <WantToReadList
        wantToRead={wantToRead} 
        />
        <CurrentlyReadingList
        currentlyReading={currentlyReading} />
        <HaveReadList
        haveRead={haveRead}
         />
</section>
     );
}
 
export default MyBooksContainer;