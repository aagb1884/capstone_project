const BookItem = ({book}) => {
    return ( 
        <div className="book-item">
        <ul>
            <li><img src={book.coverUrl} alt="Book cover" width="175" height="200"/></li>
            <li>{book.title}</li>
            <li>Written by: {book.authors.firstname} {book.authors.lastname}</li>
            <li>Illustrated by:{book.illustrators.firstname} {book.illustrators.lastname}</li>
            <li>Synopsis: {book.synopsis}</li>
            <li>No. Pages: {book.lengthInPages}</li>
            <li>Format: {book.format}</li>
            <li>Date Published: {book.datePublished}</li>
            <li>Publisher: {book.publisher}</li>
            <li>ISBN: {book.isbn}</li>
            <li>Average Rating: {book.averageRating}</li>
        </ul>
        </div>
     );
}
 
export default BookItem;