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
        <div className="search-page">
         <h2>SEARCH PAGE - UNDER CONSTRUCTION</h2>
            {/* <form id="form" onSubmit={handleSubmit}>  */}
               <input  id="search" 
                placeholder="Search..." 
                onChange={handleSearch}
                type="text"
                name="searchTerm"
                value={searchTerm}/>
               {/* <button>Search</button> */}
               <SearchResults filteredBooks={filteredBooks}/>
            {/* </form> */}
        </div>
     );
}

 
export default SearchContainer
;