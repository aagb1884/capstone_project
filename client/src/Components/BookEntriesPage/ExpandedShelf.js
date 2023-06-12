import './expandedshelf.css'

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
            <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
            <li>{bookEntry.book.title}</li>
            <li>Written by {authorInfo}</li>
            <li>Illustrated by {illustratorInfo}</li>
            <li>Star Rating: {bookEntry.starRating}</li>
            <li>Synopsis: {bookEntry.book.synopsis}</li>
            <li>Pages: {bookEntry.book.lengthInPages}</li>
            <li>Format: {bookEntry.book.format}</li>
            <li>Tags: {descriptiveTags}</li>
            <li>Date Published: {bookEntry.book.datePublished}</li>
            <li>Publisher: {bookEntry.book.publisher}</li>
            <li>ISBN: {bookEntry.book.isbn}</li>
            <li>Average Rating: {bookEntry.book.averageRating}</li>
        </ul>
    
        </div>
     );
}
 
export default ExpandedShelf;
