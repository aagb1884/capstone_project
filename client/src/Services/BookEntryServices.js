    const baseURL = "http://localhost:8080/bookentries/";

    export const getBookEntries = () => {
      return fetch(baseURL).then((res) => res.json());
    };
    
    export const getSelectedBookEntry = (id) => {
      return fetch(baseURL + id).then(res => res.json())
    }
    
    export const updateBookEntry = (id, payload) => {
      return fetch(baseURL + id, {
        method: "PUT",
        body: JSON.stringify(payload),
        headers: { "Content-Type": "application/json" },
      });
    };
    
    export const deleteBookEntry = (id) => {
      return fetch(baseURL + id, {
        method: "DELETE",
      })
      .then(res => res.json())
    };
    
    export const createBookEntry = (newBookEntry) => {
        return fetch(baseURL, {
            method: 'POST',
            body: JSON.stringify(newBookEntry),
            headers: { 'Content-Type': "application/json" }
        })
        .then(res => res.json())
        .then(data => {
            return {
            ...data,
            ...newBookEntry
            }
        })
    }
  
    export const getBookEntriesByUserId =  (userId) => {
        return fetch(baseURL + "users?id=" + userId).then(res => res.json())};
    
    export const getBookEntriesWantToRead = (userId) => {
        return fetch(baseURL + "users/" + userId + "/wanttoread")
          .then(res => res.json())};
  
    export const getBookEntriesCurrentlyReading = (userId) => {
        return fetch(baseURL + "users/" + userId + "/currentlyreading").then(res => res.json())};
     
    export const getBookEntriesHaveRead = (userId) => {
        return fetch(baseURL + "users/" + userId + "/haveread").then(res => res.json())};
  
    export const getBookEntriesByBookId =  (bookId) => {
        return fetch(baseURL + "books?id=" + bookId).then(res => res.json())};


  