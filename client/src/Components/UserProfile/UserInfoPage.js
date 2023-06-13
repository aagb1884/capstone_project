import UserInfoBooks from "./UserInfoBooks";

const UserInfoPage = ({user}) => {

    
   

    return ( 
        <>
        <h2>{user.firstname} {user.lastname}'s Profile</h2>
        <div className="userInfo">
            <img src={user.imgUrl} alt="userImage" width="100px" height="100px"/>
            <h2>{user.firstname} {user.lastname}</h2>
            <p>{user.bio}</p>
                <div className="user-books">
                    <h3>{user.firstname}'s Books</h3>
                   
                </div>
        </div>
        </>
     );
}
 
export default UserInfoPage;