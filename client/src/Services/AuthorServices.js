const baseURL = "http://localhost:8080/authors";

export const getAuthors = () => {
  return fetch(baseURL).then((res) => res.json());
};

export const getSelectedAuthor = (id) => {
  return fetch(baseURL + id).then(res => res.json())
}

// export const updateAuthor = (id, payload) => {
//   return fetch(baseURL + id, {
//     method: "PUT",
//     body: JSON.stringify(payload),
//     headers: { "Content-Type": "application/json" },
//   });
// };

// export const deleteAuthor = (id) => {
//   return fetch(baseURL + id, {
//     method: "DELETE",
//   })
//   .then(res => res.json())
// };

// export const createAuthor = (newAuthor) => {
//     return fetch(baseURL, {
//         method: 'POST',
//         body: JSON.stringify(newAuthor),
//         headers: { 'Content-Type': "application/json" }
//     })
//     .then(res => res.json())
//     .then(data => {
//         return {
//         ...data,
//         ...newAuthor
//         }
//     })
// }