import './footer.css';

const Footer = () => {

    return ( 
        <div className='footer'>
        <a href="http://localhost:3000/profile"><img src="footer_images/icons8-customer-100.png" alt="profile"/></a>
        <a href="http://localhost:3000/mybooks"><img src="footer_images/icons8-bookcase-100.png" alt="bookshelves" height="98"/></a>
        <a href="http://localhost:3000/search"><img src="footer_images/icons8-google-web-search-100.png" alt="search"/></a>
        </div>
     );
}
 
export default Footer;


