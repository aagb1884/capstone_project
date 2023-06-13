import React, { useState, useEffect } from 'react';

const SearchContainer = ({onChange, filteredBooks}) => {
   const [searchTerm, setSearchTerm] = useState("");

   const changeSearchTerm = (event) => {
      event.preventDefault();
      setSearchTerm(event.target.value);
    }
    useEffect(() => {
      onChange(searchTerm);
    }, [searchTerm]);
  
    const handleSubmit = (event) => {
      event.preventDefault();
    }

    return ( 
        <div className="search-page">
         <h2>SEARCH PAGE - UNDER CONSTRUCTION</h2>
            <form id="form" onSubmit={handleSubmit}> 
               <input  id="search" 
                placeholder="Search..." 
                onChange={changeSearchTerm}
                type="text"
                name="searchTerm"
                value={searchTerm}/>
               <button>Search</button>
            </form>
            <span>{filteredBooks}</span> 
        </div>
     );
}
 
export default SearchContainer
;