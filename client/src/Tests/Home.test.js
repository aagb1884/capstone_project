import HomePage from '../Components/Homepage/HomePage';
import {render, fireEvent} from '@testing-library/react';
import React from 'react';
import { BrowserRouter as Router } from 'react-router-dom';

describe("HomePage", () => {
    let homepage;
  
    beforeEach(() => {
      homepage = render(<Router>
                        <HomePage />
                        </Router>);
    });

  it('renders My Books link with image', () => {
    const myBooksImgButton = homepage.getByTestId('my-books-img-button');
    expect(myBooksImgButton.closest('a')).toHaveAttribute('href', '/mybooks');
  });

  it('renders "Enter Here" link to My Books', () => {
    const enterHereLink = homepage.getByText('Enter Here');
    expect(enterHereLink.closest('a')).toHaveAttribute('href', '/mybooks');
  });


})