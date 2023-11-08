import React from "react";
import BookItem from "../../Deprecated/BooksPage/BookItem";

const SearchResults = ({filteredBooks}) => {
    if (!filteredBooks || filteredBooks.length === 0) {
        return <p>No results found.</p>;
      }

   const bookList = filteredBooks.map((filteredBook, index) => {
    return <BookItem key={index} book={filteredBook} />})

    return ( 
        <div className="search-results" data-testid="search-results" >
            {bookList}
        </div>
     );
}
 
export default SearchResults;