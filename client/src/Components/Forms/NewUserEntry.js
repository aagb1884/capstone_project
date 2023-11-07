import { useState } from "react";

const NewUserEntry = ({ addNewUser, users, fetchData }) => {

    // const [userId, setUserId] = useState("");
    const [username, setUsername] = useState("");
    const [userFirstName, setUserFirstName] = useState("");
    const [userLastName, setUserLastName] = useState("");
    const [userBio, setUserBio] = useState("");
    const [userImgUrl, setUserImageUrl] = useState("");

    // const handleUserChange = (e) => {
    //     setUserId(e.target.value);
    //   };

      const handleUsernameChange = (e) => {
        setUsername(e.target.value);
      };

    const handleFirstNameChange = (e) => {
        setUserFirstName(e.target.value);
      };

    const handleLastNameChange = (e) => {
        setUserLastName(e.target.value);
      };
   
    const handleUserBioChange = (e) => {
        setUserBio(e.target.value);
      };

    const handleUserImgUrlChange = (e) => {
        setUserImageUrl(e.target.value);
      };

      const handleSubmit = e => {
        e.preventDefault();

        addNewUser({
            username: username,
            userFirstName: userFirstName,
            userLastName: userLastName,
            userBio: userBio,
            userImgUrl: userImgUrl
          });
          
          setUsername("");
          setUserFirstName("");
          setUserLastName("");
          setUserBio("");
          setUserImageUrl("");
          fetchData()    
        };

    return ( 
        <div className="new-user-page">
            
        <div className="new-user-form">
            <form onSubmit={handleSubmit}>
      
      <h2>Enter User details:</h2>
        <div>
          <label htmlFor="started-reading">Username</label>
          <br/>
          <input
          type="text"
          placeholder="Enter username"
          id="username"
          name="username"
          value={username}
          onChange={handleUsernameChange}
            />
          </div>
        <div>
          <label htmlFor="user-first-name">Firstname</label>
          <br/>
          <input
          type="text"
          id="user-first-name"
          placeholder="Enter firstname(s)"
          name="user-first-name"
          value={userFirstName}
          onChange={handleFirstNameChange}
            />
          </div>
        <div>
          <label htmlFor="user-last-name">Last name</label>
          <br/>
          <input
          type="text"
          id="user-last-name"
          placeholder="Enter last name(s)"
          name="user-last-name"
          value={userLastName}
          onChange={handleLastNameChange}
            />
          </div>
        <div>
          <label htmlFor="user-bio">Short biography (500 Characters max)</label>
          <br/>
          <input
          type="text"
          id="user-bio"
          placeholder="Enter bio"
          name="user-bio"
          value={userBio}
          onChange={handleUserBioChange}
            />
          </div>
        <div>
          <label htmlFor="user-image-url">Profile Image Link</label>
          <br/>
          <input
          type="text"
          id="user-img-url"
          placeholder="Enter url for profile image"
          name="user-img-url"
          value={userImgUrl}
          onChange={handleUserImgUrlChange}
            />
          </div>
          <div className="form-button">
        <button type="submit">Add User</button>
        </div>
        </form>

            </div>
        </div>
     );
}
 
export default NewUserEntry;