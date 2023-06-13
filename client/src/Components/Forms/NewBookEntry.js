import React, { useState } from "react";
import './forms.css'

const NewBookEntry = ({addBookEntry, fetchData, bookEntries}) => {


    const [book, setBook] = useState("");
    const [shelf, setShelf] = useState("");
    const [startedReading, setStartedReading] = useState("");
    const [finishedReading, setFinishedReading] = useState("");
    const [starRating, setStarRating] = useState("");
    const [review, setReview] = useState("");
  
    const handleBookChange = (e) => {
      setBook(e.target.value);
    };
  
    const handleShelfChange = (e) => {
      setShelf(e.target.value);
    };

    const handleStartedReadingChange = (e) => {
      setShelf(e.target.value);
    };

    const handleFinishedReadingChange = (e) => {
      setFinishedReading(e.target.value);
    };

    const handleStarRatingChange = (e) => {
      setStarRating(e.target.value);
    };

    const handleReviewChange = (e) => {
      setReview(e.target.value);
    };
  
    const handleSubmit = e => {
      e.preventDefault();
      
      addBookEntry({
        book: book,
        shelf: shelf,
        startedReading: startedReading,
        finishedReading: finishedReading,
        starRating: starRating,
        review: review
      });
      setBook("");
      setShelf("");
      setStartedReading("");
      setFinishedReading("");
      setStarRating("");
      setReview("");
      fetchData()    
    };
  
    return (
      <form onSubmit={handleSubmit}>
      
      <h2>Enter book details:</h2>
        <div>
          <label htmlFor="book">Book</label>
          <br/>
          <input
            type="text"
            id="book"
            name="book"
            value={book}
            onChange={handleBookChange}
            required
          />
        </div>
        <div>
          <label htmlFor="shelf">Shelf</label>
          <br/>
          <select 
          id="shelf"
          name="shelf"
          value={shelf}
          onChange={handleShelfChange}
          required>
          {/* {bookEntries.map((bookEntry) => (
            <option key={bookEntry.status} >
             {bookEntry.status} */}
            <option value="">Please choose one</option>
            <option value="want-to-read">WANTTOREAD</option>
            <option value="currently-reading">CURRENTLYREADING</option>
            <option value="have-read">HAVEREAD</option>
          
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
          <input type="radio" id="star5" name="star-rating" value="5"
          onChange={handleStarRatingChange}/>
          <label for="star5" title="text">5 stars</label>
          <input type="radio" id="star4" name="star-rating" value="4"
          onChange={handleStarRatingChange}/>
          <label for="star4" title="text">4 stars</label>
          <input type="radio" id="star3" name="star-rating" value="3"
          onChange={handleStarRatingChange} />
          <label for="star3" title="text">3 stars</label>
          <input type="radio" id="star2" name="star-rating" value="2" 
          onChange={handleStarRatingChange}/>
          <label for="star2" title="text">2 stars</label>
          <input type="radio" id="star1" name="star-rating" value="1"
          onChange={handleStarRatingChange} />
          <label for="star1" title="text">1 star</label>
        </div>
          <br />
        <div>
          <label htmlFor="review">Your Review</label>
          <br/>
          <input
          type="text"
          id="review"
          name="review"
          value={review}
          onChange={handleReviewChange}
          className="review"
            />
          </div>
        <button type="submit">Add Book</button>
      </form>
    );
  }
  
  
 
export default NewBookEntry;




