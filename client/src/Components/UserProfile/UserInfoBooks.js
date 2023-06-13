import './userprofile.css'

const UserInfoBooks = ({userBooks}) => {

    const userBookInfo = userBooks.map((bookEntry, index) => {
        const authorInfo = bookEntry.book.authors.map((author, index) => {
            return <span>{author.firstname} {author.lastname}
            {index < bookEntry.book.authors.length - 1 && <span>, </span>}</span> 
        })
        const illustratorInfo = bookEntry.book.illustrators.map((illustrator, index) => {
            return <span>{illustrator.firstname} {illustrator.lastname}
            {index < bookEntry.book.illustrators.length - 1 && <span>, </span>}</span>
        })
        return <span> 
        <ul>
        <li><img src={bookEntry.book.coverUrl} alt="Book cover" width="175" height="200"/></li>
        <li>{bookEntry.book.title}</li>
        <li>Written by {authorInfo}</li>
        <li>Illustrated by {illustratorInfo}</li>
        </ul>
        </span>
    })


    return ( 
        <div className="user-book-entry">
        {userBookInfo}
        </div>
     );
}
 
export default UserInfoBooks