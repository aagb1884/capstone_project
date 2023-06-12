const CurrentlyReadingItem = ({bookEntry}) => {

    // map author and illustrators to get names

    return ( 
        <div className="currently-reading-item">
            
        <ul>
        <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
        <li>{bookEntry.book.title}</li>
        <li>{bookEntry.startedReading}</li>
    </ul>
    </div>
     );
}
 
export default CurrentlyReadingItem;