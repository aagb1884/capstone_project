import React, { useState } from "react";
import './forms.css'

const NewBookEntry = ({addBookEntry, fetchData, books, selectedBook}) => {

  const statusOptions = [
    { label: 'Want to Read', value: 'WANTTOREAD' },
    { label: 'Have Read', value: 'HAVEREAD' },
    { label: 'Currently Reading', value: 'CURRENTLYREADING' },
  ];

    const [bookId, setBookId] = useState("");
    const [status, setStatus] = useState("");
    const [startedReading, setStartedReading] = useState("");
    const [finishedReading, setFinishedReading] = useState("");
    const [childRating, setChildRating] = useState(0);
    const [adultRating, setAdultRating] = useState(0);
    const [review, setReview] = useState("");
    const [bookData, setBookData] = useState({
      title: selectedBook?.title || ""
    });

    const handleDataChange = (e) => {
      setBookData({...bookData, [e.target.name]: e.target.value })
    }
  
    const handleBookChange = (e) => {
      setBookId(e.target.value);
    };
  
    const handleStatusChange = (e) => {
      setStatus(e.target.value);
    };

    const handleStartedReadingChange = (e) => {
      setStartedReading(e.target.value);
    };

    const handleFinishedReadingChange = (e) => {
      setFinishedReading(e.target.value);
    };

    const handleChildRatingChange = (e) => {
      setChildRating(parseInt(e.target.value));
    };
    const handleAdultRatingChange = (e) => {
      setAdultRating(parseInt(e.target.value));
    };

    const handleReviewChange = (e) => {
      setReview(e.target.value);
    };
  
    const handleSubmit = e => {
      e.preventDefault();
      
      addBookEntry({
        book: {id:bookId},
        status: status,
        user: {id:1},
        // this will need changed when there is more than one user
        startedReading: startedReading,
        finishedReading: finishedReading,
        childRating: childRating,
        adultRating: adultRating,
        review: review
      });
      setBookData("");
      setBookId("");
      setStatus("");
      setStartedReading("");
      setFinishedReading("");
      setChildRating(0);
      setAdultRating(0);
      setReview("");
      fetchData()    
    };
  
    return (
      <form onSubmit={handleSubmit}>
      
      <h2>Enter book details:</h2>
        <div>
          <label htmlFor="book">Select Book</label>
          <br/>
          <select
            id="book"
            name="book"
            value={bookId}
            onChange={handleDataChange}
            required>
              <option value=""></option>
                {books.map((book)=> (
                <option key={book.id} value={book.id}>
                  {book.title}
              </option>
    ))}
        </select>
            </div>
        <div>
          <label htmlFor="shelf">Select Bookshelf</label>
          <br/>
          <select 
          id="status"
          name="status"
          value={status}
          onChange={handleStatusChange}
          required>
            <option value=""></option>
        {statusOptions.map((option) => (
          <option key={option.value} value={option.value}>
            {option.label}
          </option>
        ))}
      </select>          
          </div>
        <div>
          <label htmlFor="started-reading">Date Started Reading</label>
          <br/>
          <input
          type="text"
          placeholder="dd-mm-yyyy"
          id="started-reading"
          name="started-reading"
          value={startedReading}
          onChange={handleStartedReadingChange}
            />
          </div>
        <div>
          <label htmlFor="finished-reading">Date Finished Reading</label>
          <br/>
          <input
          type="text"
          id="finished-reading"
          placeholder="dd-mm-yyyy"
          name="finished-reading"
          value={finishedReading}
          onChange={handleFinishedReadingChange}
            />
          </div>
          <br />
          <label htmlFor="child-rating">How much did the young person enjoy it?</label>
          <br />
        <div className="child-rating">
          <input type="radio" id="star5" name="child-rating" value="5" checked={childRating === 5}
          onChange={handleChildRatingChange}/>
          <label for="star5" title="text">5 stars</label>
          <input type="radio" id="star4" name="child-rating" value="4" checked={childRating === 4}
          onChange={handleChildRatingChange}/>
          <label for="star4" title="text">4 stars</label>
          <input type="radio" id="star3" name="child-rating" value="3" checked={childRating === 3}
          onChange={handleChildRatingChange} />
          <label for="star3" title="text">3 stars</label>
          <input type="radio" id="star2" name="child-rating" value="2" checked={childRating === 2}
          onChange={handleChildRatingChange}/>
          <label for="star2" title="text">2 stars</label>
          <input type="radio" id="star1" name="child-rating" value="1" checked={childRating === 1}
          onChange={handleChildRatingChange} />
          <label for="star1" title="text">1 star</label>
        </div>
        <br />
        <label htmlFor="star-rating">How much did you enjoy reading it to them?</label>
          <br />
        <div className="adult-rating">
          <input type="radio" id="star5" name="adult-rating" value="5" checked={adultRating === 5}
          onChange={handleAdultRatingChange}/>
          <label for="star5" title="text">5 stars</label>
          <input type="radio" id="star4" name="adult-rating" value="4" checked={adultRating === 4}
          onChange={handleAdultRatingChange}/>
          <label for="star4" title="text">4 stars</label>
          <input type="radio" id="star3" name="adult-rating" value="3" checked={adultRating === 3}
          onChange={handleAdultRatingChange} />
          <label for="star3" title="text">3 stars</label>
          <input type="radio" id="star2" name="adult-rating" value="2" checked={adultRating === 2}
          onChange={handleAdultRatingChange}/>
          <label for="star2" title="text">2 stars</label>
          <input type="radio" id="star1" name="adult-rating" value="1" checked={adultRating === 1}
          onChange={handleAdultRatingChange} />
          <label for="star1" title="text">1 star</label>
        </div>
        <div>
          <label htmlFor="review">Your Review</label>
          <br/>
          <textarea
          type="text"
          id="review"
          name="review"
          value={review}
          onChange={handleReviewChange}
          className="review"
            />
          </div>
          <div className="form-button">
        <button type="submit">Add Book</button>
        </div>
      </form>
    );
  }
  
  
 
export default NewBookEntry;




