import LoginForm from "./LoginForm"
import SignUpForm from "./SignUpForm"
import { useState, React } from 'react'




export default function LoginSignUp({ setUser }) {

    const [signUp, setSignUp] = useState(false)

    function handleFormDisplay() {
        setSignUp(current => !current)
    }

    return (
        <>

            {signUp ?


                <SignUpForm setUser={setUser} handleFormDisplay={handleFormDisplay} /> : <LoginForm setUser={setUser} handleFormDisplay={handleFormDisplay} />

            }


        </>

    )
}