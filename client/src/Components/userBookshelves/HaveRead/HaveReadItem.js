import StarRating from "../StarRating"

const HaveReadItem = ({bookEntry}) => {

    const authorInfo = bookEntry.book.authors.map((author, index) => {
        return <span>{author.firstname} {author.lastname}
        {index < bookEntry.book.authors.length - 1 && <span>, </span>}</span> 
    })
    
    const illustratorInfo = bookEntry.book.illustrators.map((illustrator, index) => {
        return <span>{illustrator.firstname} {illustrator.lastname}
        {index < bookEntry.book.illustrators.length - 1 && <span>, </span>}</span>
    })
    
    
    return ( 
        <div className="have-read-item">
        <ul>
            <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
            <li>{bookEntry.book.title}</li>
            <li>Written by {authorInfo}</li>
            <li>Illustrated by {illustratorInfo}</li>
            <li>Started reading on {bookEntry.startedReading}</li>
            <li>Finished reading on {bookEntry.finishedReading}</li>
            
            <li>How much my child enjoyed it: <StarRating rating={bookEntry.childRating} /></li>
            <li>How much I enjoyed it: <StarRating rating={bookEntry.adultRating} /></li>
            <li>Thoughts: {bookEntry.review}</li>
        </ul>
    </div>
    );
}
 
export default HaveReadItem;