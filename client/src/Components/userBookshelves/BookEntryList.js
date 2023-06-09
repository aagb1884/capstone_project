import BookEntryItem from "./BookEntryItem";

const BookEntryList = ({bookEntryData}) => {
  const bookEntryInfo = bookEntryData.map((bookEntry, index) => {
    return <BookEntryItem key={index} bookEntry={bookEntry}/>
})

    return (
        <>
        <h2>book entry list</h2>
        {bookEntryInfo}
        </>
      );
}
 
export default BookEntryList;