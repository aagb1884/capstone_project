import './homepage.css';
import { Link } from 'react-router-dom';

const HomePage = () => {
    return ( 
        <main>
        <h2>Slightly</h2>
            <div className='better-reads'>
                <h1>Better Reads</h1>
            </div>
        <Link to="/mybooks"><img SRC="images/icons8-open-book.gif" alt="book pages gif" data-testid="my-books-img-button" /> </Link>
        <p><Link to="/mybooks">Enter Here</Link></p>
        </main>
     );
}
 
export default HomePage;