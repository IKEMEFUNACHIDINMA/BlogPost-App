import {useState} from "react";

export default function Register(){
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    function handleRegister(e){
        e.preventDefault();
        alert(`Register: ${email}`);
    }

    return(
        <form onSubmit={handleRegister}>
            <input type="email" placeholder="Email" value={email} onChange={e => setEmail(e.target.value)}/>
            <input type="password" placeholder="Password" value={password} onChange={e => setPassword(e.target.value)}/>
            <button type="submit">Register</button>
        </form>
    );
}