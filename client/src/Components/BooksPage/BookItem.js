import './bookitem.css'

const BookItem = ({book, onSelectBook}) => {

    const handleAddBook = () => {
        onSelectBook(book);
    };

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
         
        
            <div className='image-container'>
                <img src={book.coverUrl} alt="Book cover" />
            </div>
            <br />
            <div className='text-container'>
                <ul>
                <li><b>{book.title}</b></li>
                <li>Written by {authorInfo}</li>
                <li>Illustrated by {illustratorInfo}</li>
                <br />
                <li>{book.synopsis}</li>
                <br />
                <li>Pages: {book.lengthInPages}</li>
                <div className='change-caps'>
                <li>Format: {book.format}</li>
                <li>Tags: {descriptiveTags}</li>
                </div>
                <li>Date Published: {book.datePublished}</li>
                <li>Publisher: {book.publisher}</li>
                <li>ISBN: {book.isbn}</li>
                <li>Average Rating: {book.averageRating}</li>
                </ul>
                <div className='add-book-to-shelf'>
                <button onClick={handleAddBook}>Add Book to Bookshelf</button>
                </div>
            </div>
        
        
        </div>
     );
}
 
export default BookItem;