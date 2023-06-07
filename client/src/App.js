import './App.css';
import { useState, useEffect } from "react";

function App() {

  const [bookData, setBookData] = useState(null)

  useEffect(() => {
    fetch("http://localhost:8080/books")
    .then(res => res.json())
    .then(data => setBookData(data))
  }, [])



  return (
    <div className="App">
 
    </div>
  );
}

export default App;
