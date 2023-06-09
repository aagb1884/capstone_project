import UserInfoBooks from "./UserInfoBooks";

const UserInfoPage = ({user}) => {

    
   

    return ( 
        <div className="userInfo">
            <img src={user.imgUrl} alt="userImage" width="100px" height="100px"/>
            <h2>{user.firstname} {user.lastname}</h2>
            <p>{user.bio}</p>
                <div className="user-books">
                   <UserInfoBooks user={user}/>
                </div>
        </div>
     );
}
 
export default UserInfoPage;