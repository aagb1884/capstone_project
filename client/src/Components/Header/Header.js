import './header.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faBars } from '@fortawesome/free-solid-svg-icons';

const Header = () => {



    return (
       <header> 
       <h2>Slightly</h2>
        <div className='better-reads-header'>
                <h1>Better Reads</h1>
            </div>         
                <nav>
                    <button class="dropbtn"><FontAwesomeIcon icon={faBars} style={{color: "#ffffff",}} size="2x" /></button>
                        <div className="dropdown-content">
                            <ul>
                            <li><a rel='noopener' href="/">Home</a></li>
                            <li><a rel='noopener' href="/mybooks">My Bookshelves</a></li>
                            <li><a rel='noopener' href="/booksearch" >Search All Books</a></li>
                            <li><a rel='noopener' href="/profile" >User Profile</a></li>
                            <li><a rel='noopener' href="/newbookentry">Add Book to Shelf</a></li>
                            <li><a rel='noopener' href="/about">About</a></li>
                            </ul>
                        </div>
                </nav>
            </header>      
      );
    }


export default Header;