import NewBookEntry from '../Components/Forms/NewBookEntry';
import {render, fireEvent} from '@testing-library/react';
import React from 'react';
import { BrowserRouter as Router } from 'react-router-dom';

describe("NewBookEntry", () => {
    const testBooks = [
        {id: 1, title: 'Mr Gum'},
        {id: 2, title: 'My Otter'},
        {id: 3, title: 'Not My Hat'},
        {id: 4, title: 'BFG'}
    ]

    let newBook;
  
    beforeEach(() => {
      newBook = render(
                          <NewBookEntry books={books}/>
                        );
    });

    it('renders without crashing', () => {
        render(<NewBookEntry books={books}/>);
      });

    //   it('updates bookId state on input change', () => {
    //     const input = newBook.getByLabelText('Select Book');
    //     fireEvent.change(input, { target: { value: '1' } });
    //     expect(input.value).toBe('1');
    //   });
      
    //   it('updates status state on select change', () => {
    //     const select = newBook.getByLabelText('Select Bookshelf');
    //     fireEvent.change(select, { target: { value: 'WANTTOREAD' } });
    //     expect(select.value).toBe('WANTTOREAD');
    //   });


    //   it('calls addBookEntry and fetchData when form is submitted', () => {
    //     const mockAddBookEntry = jest.fn();
    //     const mockFetchData = jest.fn();
    //     const { getByText, getByLabelText } = render(
    //       <NewBookEntry addBookEntry={mockAddBookEntry} fetchData={mockFetchData} />
    //     );
      
    //     const submitButton = getByText('Add Book');
    //     fireEvent.click(submitButton);
      
    //     expect(mockAddBookEntry).toHaveBeenCalled();
    //     expect(mockFetchData).toHaveBeenCalled();
    //   });
      
    //   it('updates childRating state on child rating input change', () => {
    //     const input = newBook.getByLabelText('How much did the young person enjoy it?');
    //     fireEvent.click(input);
    //     expect(input.value).toBe('5');
    //   });
      
    //   it('updates adultRating state on adult rating input change', () => {
    //     const input = newBook.getByLabelText('How much did you enjoy reading it to them?');
    //     fireEvent.click(input);
    //     expect(input.value).toBe('5');
    //   });
      
    //   it('updates review state on review textarea change', () => {
    //     const textarea = newBook.getByLabelText('Your Review');
    //     fireEvent.change(textarea, { target: { value: 'Great book!' } });
    //     expect(textarea.value).toBe('Great book!');
    //   });
      
})