import './bookitem.css'

const BookItem = ({book}) => {

    const authorInfo = book.authors.map((author, index) => {
        return <span key={index}>{author.firstname} {author.lastname} 
        {index < book.authors.length - 1 && <span>, </span>}</span> 
    })
    const illustratorInfo = book.illustrators.map((illustrator, index) => {
        return <span key={index}>{illustrator.firstname} {illustrator.lastname} 
        {index < book.illustrators.length - 1 && <span>, </span>}</span>
    })
    const descriptiveTags = book.descriptions.map((description, index) => {
        return <span key={index}>{description} 
        {index < book.descriptions.length - 1 && <span>, </span>}</span>
    })
    
    return ( 
        <div className="book-item" data-testid="book-item">
            
        
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
            </div>
        
        
        </div>
     );
}
 
export default BookItem;