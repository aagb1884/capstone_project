import UserInfoPage from "./UserInfoPage";
import UserInfoBooks from "./UserInfoBooks";

const UserContainer = ({userData, userBooks}) => {

    const userInfo = userData.map((user, index) => {
        return < UserInfoPage key={index} user={user}/>
    })

   

    return ( 
    <section className="user-container">
       {userInfo}
       <UserInfoBooks userBooks={userBooks} />
    </section> );
}
 
export default UserContainer;