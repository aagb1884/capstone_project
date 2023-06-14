import './expandedshelf.css'
import StarRating from "../userBookshelves/StarRating"

const ExpandedShelf = ({bookEntry}) => {

   
    const authorInfo = bookEntry.book.authors.map((author, index) => {
        return <span>{author.firstname} {author.lastname}
        {index < bookEntry.book.authors.length - 1 && <span>, </span>}</span> 
    })
    const illustratorInfo = bookEntry.book.illustrators.map((illustrator, index) => {
        return <span>{illustrator.firstname} {illustrator.lastname}
        {index < bookEntry.book.illustrators.length - 1 && <span>, </span>}</span>
    })
    const descriptiveTags = bookEntry.book.descriptions.map((description, index) => {
        return <span>{description} 
        {index < bookEntry.book.descriptions.length - 1 && <span>, </span>}</span>
    })

    return ( 
        
        <div className='expanded-shelf'>
        <ul>
            <div className='book-image-container'>
            <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="312px" height="390px"/></li>
            </div>
            <div className='book-text-container'>
            <li>{bookEntry.book.title}</li>
            <li>Written by {authorInfo}</li>
            <li>Illustrated by {illustratorInfo}</li>
            <li>How much my child enjoyed it<StarRating rating={bookEntry.childRating} /></li>
            <li>How much I enjoyed it<StarRating rating={bookEntry.adultRating} /></li>
            <br />
            <li>{bookEntry.book.synopsis}</li>
            <br />
            <li>Pages: {bookEntry.book.lengthInPages}</li>
            <li>Format: {bookEntry.book.format}</li>
            <li>Tags: {descriptiveTags}</li>
            <li>Date Published: {bookEntry.book.datePublished}</li>
            <li>Publisher: {bookEntry.book.publisher}</li>
            <li>ISBN: {bookEntry.book.isbn}</li>
            <li>Average Rating: {bookEntry.book.averageRating}</li>
            </div>
        </ul>
    
        </div>
     );
}
 
export default ExpandedShelf;
