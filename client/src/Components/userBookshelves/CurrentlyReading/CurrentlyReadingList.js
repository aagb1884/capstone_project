import CurrentlyReadingItem from "./CurrentlyReadingItem";

const currentlyReadingList = ({currentlyReading}) => {
    const currentlyReadingInfo = currentlyReading.map((bookEntry, index) => {
        return <CurrentlyReadingItem key={index} bookEntry={bookEntry}/>
    })

    return ( 
        <section>
        <h2>Currently Reading</h2>
                <div className="currently-reading">
                    {currentlyReadingInfo}
                </div>
        </section>
     );
}
 
export default currentlyReadingList;