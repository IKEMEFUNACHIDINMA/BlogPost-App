import React, {useState} from "react";

function TodoAp(){
     const [task, setTask] = useState('');
     const [tasks, setTasks] = useState([]);

     function addTask(){
         if (task){
             setTasks([...tasks, task]);
             setTask('');
         }
     }
     return(
         <div>
             <h2>My To-do List</h2>
             <input value={task} onChange={(e) => setTask(e.target.value)}/>
             <button onClick={addTask}>Add Task</button>
             <ul>
                 {tasks.map((t, i) => (
                     <li key={i}>{t}</li>
                     ))}
             </ul>
         </div>
     );
}
export default TodoAp;