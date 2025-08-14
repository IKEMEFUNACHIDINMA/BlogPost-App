const express = require('express');
const app = express();
app.use(express.json());

let users = [];

//create user
app.post('users', (req, res) => {
    users.push(req.body);
    res.status(201).send({ message: 'User created', data: req.body});
});

//Get all users
app.get('/users', (req, res) => {
    res.send(users);
});

//Get single user
app.get('/users/:id', (req, res) => {
    const user = users.find(u => u.id === req.params.id);
    if (!user) return res.status(404).send({message:'User not found'});
    res.send(user);
});
app.listen(3002, () => console.log('API running on http://localhost:3002'));