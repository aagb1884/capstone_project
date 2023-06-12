const ExpandedShelf = ({bookEntry}) => {

// map through lists of authorrs and illustrators after lunch

    return ( 
        <ul>
            <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
            <li>{bookEntry.book.title}</li>
            <li>{bookEntry.book.authors.firstname} {bookEntry.book.authors.lastname}</li>
            <li>{bookEntry.book.illustrators.firstname} {bookEntry.book.illustrators.lastname}</li>
            <li>{bookEntry.starRating}</li>
            <li>{bookEntry.book.synopsis}</li>
            <li>{bookEntry.book.lengthInPages}</li>
            <li>{bookEntry.book.format}</li>
            <li>{bookEntry.book.datePublished}</li>
            <li>{bookEntry.book.publisher}</li>
            <li>{bookEntry.book.isbn}</li>
            <li>{bookEntry.book.averageRating}</li>

        </ul>
     );
}
 
export default ExpandedShelf;
