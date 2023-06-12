const WantToReadItem = ({bookEntry}) => {

// map author and illustrators to get names

    return ( 
        <div className="want-to-read-item">
        
        <ul>
        <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
        <li>{bookEntry.book.title}</li>
    </ul>
    </div>
     );
}
 
export default WantToReadItem;