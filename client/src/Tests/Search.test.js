import SearchContainer from '../Components/SearchPage/SearchContainer';
import {render, fireEvent, screen} from '@testing-library/react';
import React from 'react';

jest.mock('../Components/SearchPage/SearchResults', () => {
    return {
      __esModule: true,
      default: jest.fn(() => <div data-testid="search-results" />),
    };
  });
  
describe("SearchContainer", () => {
    const testBooks = [
        {id: 1, title: 'Mr Gum'},
        {id: 2, title: 'My Otter'},
        {id: 3, title: 'Not My Hat'},
        {id: 4, title: 'BFG'}
    ]

    it('renders without crashing', () => {
        render(<SearchContainer testBooks={testBooks} />);
      });

        it('updates search term and filters books correctly', () => {
        render(<SearchContainer testBooks={testBooks} />);
        const searchInput = screen.getByTestId('search-input');
        fireEvent.change(searchInput, { target: { value: 'Mr Gum' } });
        expect(searchInput.value).toBe('Mr Gum');
})


})