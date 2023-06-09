import './homepage.css';

const HomePage = () => {
    return ( 
        <div className='homepage'>
        <h2>Slightly</h2>
            <div className='better-reads'>
                <h1>Better Reads</h1>
            </div>
        <a href="/mybooks"><img SRC="images/icons8-open-book.gif" alt="book pages gif"/></a>
        <p><a href="/mybooks">Enter Here</a></p>
        </div>
     );
}
 
export default HomePage;