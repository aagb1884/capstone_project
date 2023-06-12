import './expandedshelf.css'

const ExpandedShelf = ({bookEntry}) => {

// map through lists of authorrs and illustrators after lunch

    return ( 
        <div className='expanded-shelf'>
        <ul>
            <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
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
            <li>Average Rating: {bookEntry.book.averageRating}</li>
        </ul>
        </div>
     );
}
 
export default ExpandedShelf;
