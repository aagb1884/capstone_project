const HaveReadItem = ({bookEntry}) => {

// map author and illustrators to get names
   
    return ( 
        <div className="have-read-item">
        
        <ul>
        <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
        <li>{bookEntry.book.title}</li>
        <li>{bookEntry.startedReading}</li>
        <li>{bookEntry.finishedReading}</li>
        <li>{bookEntry.starRating}</li>
        <li>{bookEntry.review}</li>
    </ul>
    </div>
    );
}
 
export default HaveReadItem;