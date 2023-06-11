import React, { useState } from "react";

const NewBookEntry = () => {


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
      setStarRating.target.value);
    };

    const handleReviewChange = (e) => {
      setReview.target.value);
    };
  
    const handleSubmit = e => {
      e.preventDefault();
      
      addBookEntry({
        book: book,
        shelf: shelf,
        startedReading: started-reading,
        finishedReading: finished-reading,
        starRating: star-rating,
        review: review
      });
      setBook("");
      setShelf("");
      setStarted_Reading("");
      setFinished_Reading("");
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
          <input
          type="text"
          id="shelf"
          name="shelf"
          value={shelf}
          onChange={handleShelfChange}
          required
            />
          </div>
        <div>
          <label htmlFor="started-reading">Date Started Reading (dd-mm-yyyy)</label>
          <br/>
          <input
          type="text"
          id="started-reading"
          name="started-reading"
          value={startedReading}
          onChange={handleStartedReadingChange}
            />
          </div>
        <div>
          <label htmlFor="finished-reading">Date Finished Reading (dd-mm-yyyy)</label>
          <br/>
          <input
          type="text"
          id="finished-reading"
          name="finished-reading"
          value={finishedReading}
          onChange={handleFinishedReadingChange}
            />
          </div>
        <div>
          <label htmlFor="star-rating">Star Rating</label>
          <br/>
          <input
          type="text"
          id="star-rating"
          name="star-rating"
          value={starRating}
          onChange={handleStarRatingChange}
            />
          </div>
        <div>
          <label htmlFor="review">Your Review</label>
          <br/>
          <input
          type="text"
          id="review"
          name="review"
          value={review}
          onChange={handleReviewChange}
            />
          </div>
        <btn type="submit">Add Book</btn>
      </form>
    );
  }
  
  
 
export default NewBookEntry;





