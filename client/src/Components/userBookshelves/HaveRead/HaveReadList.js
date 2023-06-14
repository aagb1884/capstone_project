import HaveReadItem from "./HaveReadItem";

const HaveReadList = ({haveRead}) => {
   
    const haveReadInfo = haveRead.map((bookEntry, index) => {
        return <HaveReadItem key={index} bookEntry={bookEntry}/>
    })

    return ( 
        <>
        <h2>Finished Reading</h2>
    <div className="have-read"> 
    {haveReadInfo}
    </div> 
    </>
    );
}
 
export default HaveReadList;