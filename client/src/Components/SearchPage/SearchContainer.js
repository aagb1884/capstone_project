import React, { useState, useEffect } from 'react';
import SearchResults from './SearchResults';

const SearchContainer = ({books}) => {
   const [searchTerm, setSearchTerm] = useState("");


   const handleSearch = (event) => {
      event.preventDefault();
      setSearchTerm(event.target.value);
    };

    let filteredBooks = books;
    if (searchTerm.length > 0) {
      filteredBooks = books.filter((book) => {
        return book.title.toLowerCase().match(searchTerm.toLowerCase());
      });
   }
   
    return ( 
        <section className="search-page">
         <h2>All Books</h2>
         <h3>Please use the search bar to filter by title.</h3>
            
               <input  id="search" 
                placeholder="Search..." 
                onChange={handleSearch}
                type="text"
                name="searchTerm"
                value={searchTerm}
                data-testid="search-input"
               />
               <SearchResults filteredBooks={filteredBooks}/>
          
        </section>
     );
}

 
export default SearchContainer
;