import UserInfoPage from "./UserInfoPage";
import UserInfoBooks from "./UserInfoBooks";

const UserContainer = ({userData, userBooks}) => {

    const userInfo = userData.map((user, index) => {
        return < UserInfoPage key={index} user={user}/>
    })

    const userBookInfo = userBooks.map((bookEntry, index) => {
        return <UserInfoBooks key={index} bookEntry={bookEntry}/>
    })

    return ( 
    <div className="user-container">
       {userInfo}{userBookInfo}
    </div> );
}
 
export default UserContainer;