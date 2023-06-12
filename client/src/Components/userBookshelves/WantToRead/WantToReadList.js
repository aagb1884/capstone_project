import WantToReadItem from "./WantToReadItem";

const wantToReadList = ({wantToRead}) => {
    
    const wantToReadInfo = wantToRead.map((bookEntry, index) => {
        return <WantToReadItem key={index} bookEntry={bookEntry}/>
    })

    return ( 
        <>
        <h2>Want To Read</h2>
        <div className="want-to-read">   
        {wantToReadInfo}
        </div>
        </>
     );
}
 
export default wantToReadList;