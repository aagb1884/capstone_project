import React from "react";

const SearchResults = ({books}) => {

   const bookList = books.map((book, index) => {
    return <span>book.title</span>})

    return ( 
        <div className="search-results">
            {bookList}
        </div>
     );
}
 
export default SearchResults;