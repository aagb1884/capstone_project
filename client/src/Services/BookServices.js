const baseURL = "http://localhost:8080/books";

export const getBooks = () => {
  return fetch(baseURL).then((res) => res.json());
};

export const getSelectedBook = (id) => {
  return fetch(baseURL + id).then(res => res.json())
}

export const updateBook = (id, payload) => {
  return fetch(baseURL + id, {
    method: "PUT",
    body: JSON.stringify(payload),
    headers: { "Content-Type": "application/json" },
  });
};

export const deleteBook = (id) => {
  return fetch(baseURL + id, {
    method: "DELETE",
  })
  .then(res => res.json())
};

export const createBook = (newBook) => {
    return fetch(baseURL, {
        method: 'POST',
        body: JSON.stringify(newBook),
        headers: { 'Content-Type': "application/json" }
    })
    .then(res => res.json())
    .then(data => {
        return {
        ...data,
        ...newBook
        }
    })
}

export const fetchAllBooksBySameAuthor = (authorId) => {
    return fetch(baseURL + "/author?id=" + authorId.then(res => res.json()))};

export const fetchAllBooksBySameIllustrator =  (illustratorId) => {
    return fetch(baseURL + "/illustrator?id=" + illustratorId.then(res => res.json()))};

export const fetchBookInBookEntry =  (bookEntryId) => {
    return fetch(baseURL + "/bookentry?id=" + bookEntryId.then(res => res.json()))};