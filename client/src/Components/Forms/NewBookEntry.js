import React, { useState } from "react";
import './forms.css'

const NewBookEntry = ({addBookEntry, fetchData, books}) => {

  const statusOptions = [
    { label: 'Want to Read', value: 'WANTTOREAD' },
    { label: 'Have Read', value: 'HAVEREAD' },
    { label: 'Currently Reading', value: 'CURRENTLYREADING' },
  ];

    const [bookId, setBookId] = useState("");
    const [status, setStatus] = useState("");
    const [startedReading, setStartedReading] = useState("");
    const [finishedReading, setFinishedReading] = useState("");
    const [starRating, setStarRating] = useState(0);
    const [review, setReview] = useState("");
  
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

    const handleStarRatingChange = (e) => {
      setStarRating(parseInt(e.target.value));
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
        starRating: starRating,
        review: review
      });
      setBookId("");
      setStatus("");
      setStartedReading("");
      setFinishedReading("");
      setStarRating(0);
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
            onChange={handleBookChange}
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
          <label htmlFor="star-rating">Star Rating</label>
          <br />
        <div className="star-rating">
          <input type="radio" id="star5" name="star-rating" value="5" checked={starRating === 5}
          onChange={handleStarRatingChange}/>
          <label for="star5" title="text">5 stars</label>
          <input type="radio" id="star4" name="star-rating" value="4" checked={starRating === 4}
          onChange={handleStarRatingChange}/>
          <label for="star4" title="text">4 stars</label>
          <input type="radio" id="star3" name="star-rating" value="3" checked={starRating === 3}
          onChange={handleStarRatingChange} />
          <label for="star3" title="text">3 stars</label>
          <input type="radio" id="star2" name="star-rating" value="2" checked={starRating === 2}
          onChange={handleStarRatingChange}/>
          <label for="star2" title="text">2 stars</label>
          <input type="radio" id="star1" name="star-rating" value="1" checked={starRating === 1}
          onChange={handleStarRatingChange} />
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




