import React, { useState, useEffect } from 'react';
import SearchResults from './SearchResults';

const SearchContainer = ({books}) => {
   const [searchTerm, setSearchTerm] = useState("");
   
   useEffect(() => {
      onchange(searchTerm);
    }, [searchTerm]);

   const handleChange = (event) => {
      event.preventDefault();
      setSearchTerm(event.target.value);
    };

    if (searchTerm.length > 0) {
      books.filter((book) => {
         return book.title.match(searchTerm)
      })
    }


    
  
   
    return ( 
        <div className="search-page">
         <h2>SEARCH PAGE - UNDER CONSTRUCTION</h2>
            {/* <form id="form" onSubmit={handleSubmit}>  */}
               <input  id="search" 
                placeholder="Search..." 
                onchange={handleChange}
                type="text"
                name="searchTerm"
                value={searchTerm}/>
               {/* <button>Search</button> */}
               <SearchResults books={books}/>
            {/* </form> */}
        </div>
     );
}
 
export default SearchContainer
;