import UserInfoPage from "./UserInfoPage";
import UserInfoBooks from "./UserInfoBooks";

const UserContainer = ({userData, userBooks}) => {

    const userInfo = userData.map((user, index) => {
        return < UserInfoPage key={index} user={user}/>
    })

   

    return ( 
    <div className="user-container">
       {userInfo}
       <UserInfoBooks userBooks={userBooks} />
    </div> );
}
 
export default UserContainer;