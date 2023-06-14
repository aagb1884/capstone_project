import BookItem from "./BookItem"

const BooksContainer = ({bookData, onSelectBook}) => {

    const bookInfo = bookData.map((book, index) => {
        return <BookItem key={index} book={book} onSelectBook={onSelectBook}/>
    })

    return ( 
<div className="books">
    <h2>All Books</h2>
    {bookInfo}
</div>
     );
}
 
export default BooksContainer;