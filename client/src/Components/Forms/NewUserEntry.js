import { useState } from "react";

const NewUserEntry = ({ addNewUser, fetchData }) => {

    const [username, setUsername] = useState("");
    const [firstname, setFirstname] = useState("");
    const [lastname, setLastname] = useState("");
    const [bio, setBio] = useState("");
    const [imgUrl, setImgUrl] = useState("");


      const handleUsernameChange = (e) => {
        setUsername(e.target.value);
      };

    const handleFirstNameChange = (e) => {
        setFirstname(e.target.value);
      };

    const handleLastNameChange = (e) => {
        setLastname(e.target.value);
      };
   
    const handleUserBioChange = (e) => {
        setBio(e.target.value);
      };

    const handleUserImgUrlChange = (e) => {
        setImgUrl(e.target.value);
      };

      const handleSubmit = e => {
        e.preventDefault();

        addNewUser({
            firstname: firstname,
            lastname: lastname,
            username: username,
            imgUrl: imgUrl,
            bio: bio
          });
          
          setFirstname("");
          setLastname("");
          setUsername("");
          setImgUrl("");
          setBio("");
          fetchData()    
        };

    return ( 
        <div className="new-user-page">
            
        <div className="new-user-form">
            <form onSubmit={handleSubmit}>
      
      <h2>Enter User details:</h2>
        <div>
          <label htmlFor="enter-username">Username</label>
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
          <label htmlFor="user-first-name">First name</label>
          <br/>
          <input
          type="text"
          id="user-first-name"
          placeholder="Enter firstname(s)"
          name="user-first-name"
          value={firstname}
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
          value={lastname}
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
          value={bio}
          onChange={handleUserBioChange}
            />
        </div>
        <div>
          <label htmlFor="user-image-url">Profile Image Link</label>
          <br/>
          <input
          type="text"
          id="user-img-url"
          placeholder="Enter image url"
          name="user-img-url"
          value={imgUrl}
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