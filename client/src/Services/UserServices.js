const baseURL = "http://localhost:8080/users/";

export const getUsers = () => {
  return fetch(baseURL).then((res) => res.json());
};

export const getSelectedUser= (id) => {
  return fetch(baseURL + id).then(res => res.json())
}

export const updateUser = (id, payload) => {
  return fetch(baseURL + id, {
    method: "PUT",
    body: JSON.stringify(payload),
    headers: { "Content-Type": "application/json" },
  });
};

export const deleteUser = (id) => {
  return fetch(baseURL + id, {
    method: "DELETE",
  })
  .then(res => res.json())
};

export const createUser = (newUser) => {
    return fetch(baseURL, {
        method: 'POST',
        body: JSON.stringify(newUser),
        headers: { 'Content-Type': "application/json" }
    })
    .then((res) => {
      console.log('API Response:', res);
      return res.json();
    })
    .then((data) => {
      console.log('API Data:', data);
      return {
        ...data,
        ...newUser,
      };
    })
    .catch((error) => {
      console.error('Error:', error);
      throw error; // Rethrow the error to be caught by the calling code
    });
};
