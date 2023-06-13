const SearchContainer
 = ({books, handleSearchChange}) => {

   const handleChange = (event) => {
      handleSearchChange(event.target.value);
    }

    return ( 
        <div className="search-page">
         <h2>SEARCH PAGE - UNDER CONSTRUCTION</h2>
            <form id="form"> 
               <input type="search" id="query" name="q" placeholder="Search..." onChange={handleChange}/>
               <button>Search</button>
            </form>
        </div>
     );
}
 
export default SearchContainer
;