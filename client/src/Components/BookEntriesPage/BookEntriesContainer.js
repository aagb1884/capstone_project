import ExpandedShelf from "./ExpandedShelf";

const BookEntriesContainer = ({bookEntryData}) => {
    
    const bookEntryInfo = bookEntryData.map((bookEntry, index) => {
        return <ExpandedShelf key={index} bookEntry={bookEntry}/>
    })
  
    return ( 
        <>
        {bookEntryInfo}
        </>
     );
}
 
export default BookEntriesContainer;