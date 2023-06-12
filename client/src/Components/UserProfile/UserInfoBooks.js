const UserInfoBooks = ({bookEntry}) => {
    console.log(bookEntry)
    return ( 
        <ul>
        {/* <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
        <li>{bookEntry.book.title}</li>
        <li>Written by: {bookEntry.book.authors.firstname} {bookEntry.book.authors.lastname}</li>
        <li>Illustrated by:{bookEntry.book.illustrators.firstname} {bookEntry.book.illustrators.lastname}</li>
        <li>Star Rating: {bookEntry.starRating}</li>
        <li>Synopsis: {bookEntry.book.synopsis}</li>
        <li>No. Pages: {bookEntry.book.lengthInPages}</li>
        <li>Format: {bookEntry.book.format}</li>
        <li>Date Published: {bookEntry.book.datePublished}</li>
        <li>Publisher: {bookEntry.book.publisher}</li>
        <li>ISBN: {bookEntry.book.isbn}</li>
        <li>Average Rating: {bookEntry.book.averageRating}</li> */}
    </ul>
     );
}
 
export default UserInfoBooks