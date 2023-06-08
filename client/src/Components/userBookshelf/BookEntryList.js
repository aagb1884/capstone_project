import BookEntryItem from "./BookEntryItem";

const BookEntryList = ({bookData}) => {
  const bookInfo = bookData.map((book, index) => {
    return <BookEntryItem key={index} book={book}/>
})

    return (
        <>
        <h2>book entry list</h2>
        {bookInfo}
        </>
      );
}
 
export default BookEntryList;