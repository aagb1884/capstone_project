const baseURL = "http://localhost:8080/illustrators/";

export const getIllustrators = () => {
  return fetch(baseURL).then((res) => res.json());
};

export const getSelectedIllustrator = (id) => {
  return fetch(baseURL + id).then(res => res.json())
}

// export const updateIllustrator = (id, payload) => {
//   return fetch(baseURL + id, {
//     method: "PUT",
//     body: JSON.stringify(payload),
//     headers: { "Content-Type": "application/json" },
//   });
// };

// export const deleteIllustrator = (id) => {
//   return fetch(baseURL + id, {
//     method: "DELETE",
//   })
//   .then(res => res.json())
// };

// export const createIllustrator = (newIllustrator) => {
//     return fetch(baseURL, {
//         method: 'POST',
//         body: JSON.stringify(newIllustrator),
//         headers: { 'Content-Type': "application/json" }
//     })
//     .then(res => res.json())
//     .then(data => {
//         return {
//         ...data,
//         ...newIllustrator
//         }
//     })
// }