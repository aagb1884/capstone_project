import UserInfoPage from "./UserInfoPage";

const UserContainer = ({userData}) => {

    const userInfo = userData.map((user, index) => {
        return < UserInfoPage key={index} user={user}/>
    })

    return ( 
    <>
       {userInfo}
    </> );
}
 
export default UserContainer;