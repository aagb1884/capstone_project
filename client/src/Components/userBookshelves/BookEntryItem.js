const BookEntryItem = ({bookEntry}) => {
    
    return (  
        <ul>
            <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
            <li>{bookEntry.book.title}</li>
            <li>{bookEntry.starRating}</li>
            <li>{bookEntry.status}</li>

        </ul>
    );
}
 
export default BookEntryItem;