const BookItem = ({book}) => {

    const authorInfo = book.authors.map((author, index) => {
        return <span>{author.firstname} {author.lastname}
        {index < book.authors.length - 1 && <span>, </span>}</span> 
    })
    const illustratorInfo = book.illustrators.map((illustrator, index) => {
        return <span>{illustrator.firstname} {illustrator.lastname}
        {index < book.illustrators.length - 1 && <span>, </span>}</span>
    })
    const descriptiveTags = book.descriptions.map((description, index) => {
        return <span>{description} 
        {index < book.descriptions.length - 1 && <span>, </span>}</span>
    })
    
    return ( 
        <div className="book-item">
        <ul>
            <li><img src={book.coverUrl} alt="Book cover" width="175" height="200"/></li>
            <li>{book.title}</li>
            <li>Written by {authorInfo}</li>
            <li>Illustrated by {illustratorInfo}</li>
            <li>Synopsis: {book.synopsis}</li>
            <li>No. Pages: {book.lengthInPages}</li>
            <li>Format: {book.format}</li>
            <li>Tags: {descriptiveTags}</li>
            <li>Date Published: {book.datePublished}</li>
            <li>Publisher: {book.publisher}</li>
            <li>ISBN: {book.isbn}</li>
            <li>Average Rating: {book.averageRating}</li>
        </ul>
        </div>
     );
}
 
export default BookItem;