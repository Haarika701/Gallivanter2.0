
import './App.css'
import { Route } from 'react-router-dom'
import React, { useEffect, useState } from "react"
import DestinationContainer from "./DestinationContainer"
import UserAccount from './UserAccount'
import LoginSignUp from "./LoginSignup"
import 'react-calendar/dist/Calendar.css';

function App() {
  // const [user, setUser] = useState(null)
  // useEffect(() => {
  //   fetch("/me")
  //     .then((res) => res.json())
  //     .then((data) => {
  //       if (!data.errors) {
  //         setUser(data)
  //       }

  //     })
  // }, [])
  // if (!user) return <LoginSignUp setUser={setUser} />
  // function handleLogout() {
  //   console.log("Logging out")
  //   fetch("/logout", {
  //     method: "DELETE"
  //   })
  //     .then(resp => resp.json())
  //     .then(setUser(null))
  // }

  return (
    <>
      <div className="App-Container">
        <header>
          <button>Login</button>
          <button>Create Account</button>
        </header>
        {/* <div className='user'>
          {user ? <button variant="contained" onClick={handleLogout}>Logout!</button> : null}
          <img src={user.image} alt="user" />
          <p>Hi,{user.username}!!</p>
        </div> */}

        {/* <DestinationContainer user={user} setUser={setUser} /> */}
        {/* <LoginSignUp setUser={setUser} /> */}
        <br />
        <Route exact path="/useraccount">
          {/* <UserAccount user={user} /> */}
        </Route>
        <footer>
          <link href='#'>About</link>
          <link href='#'>Feedback</link>
        </footer>
      </div>
    </>
  );
}

export default App;