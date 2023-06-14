import './header.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faBars } from '@fortawesome/free-solid-svg-icons';

const Header = () => {



    return (
       <div className='header'> 
       <h2>Slightly</h2>
        <div className='better-reads-header'>
                <h1>Better Reads</h1>
            </div>         
                <div className="dropdown">
                    <button class="dropbtn"><FontAwesomeIcon icon={faBars} style={{color: "#ffffff",}} size="2x" /></button>
                        <div className="dropdown-content">
                            <ul>
                            <li><a rel='noopener' href="/">Home</a></li>
                            <li><a rel='noopener' href="/mybooks">My Books</a></li>
                            <li><a rel='noopener' href="/books">All Books</a></li>
                            <li><a rel='noopener' href="/search" >Search</a></li>
                            <li><a rel='noopener' href="/profile" >User Profile</a></li>
                            <li><a rel='noopener' href="/newbookentry">Add Book to Shelf</a></li>
                            <li><a rel='noopener' href="/about">About</a></li>
                            </ul>
                        </div>
                </div>
            </div>      
      );
    }


export default Header;