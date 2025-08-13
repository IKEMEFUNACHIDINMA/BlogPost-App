import { useEffect, useState} from "react";
import axios from 'axios';

export default function Home(){
    const [posts, setPosts] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8082/post')
            .then(res => setPosts(res.data));
    }, []);

    return(
        <div>
            <h2>All Posts</h2>
            {posts.map(post => (
                <div key={post.id}>
                    <h3>{post.titile}</h3>
                    <p>{post.body}</p>
                </div>
            ))}
        </div>
    );
}