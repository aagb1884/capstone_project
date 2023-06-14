import React from "react";
import BookItem from "../BooksPage/BookItem";

const SearchResults = ({filteredBooks}) => {

   const bookList = filteredBooks.map((filteredBook, index) => {
    return <BookItem book={filteredBook} />})

    return ( 
        <div className="search-results">
            {bookList}
        </div>
     );
}
 
export default SearchResults;