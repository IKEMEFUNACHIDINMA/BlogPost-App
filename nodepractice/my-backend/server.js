// const http = require('http');
//
// const server = http.createServer((req, res) => {
//     res.statusCode = 200;
//     res.setHeader('Content-Type', 'text/plain');
//     res.end('Hello, world!');
// });
//
// server.listen(3000, () => {
//     console.log('Server is running at http://localhost:3000/');
// });

require('dotenv').config();
const express = require('express');
const connectDB = require('./config/db');

connectDB();

const app = express();
app.use(express.json());

app.get('/', (req, res) => res.send('API is running...'));

//Routes
app.use('/api/users', require('./routes/userRoutes'));

app.listen(3000, () => console.log('Server is running on http://localhost:3000'));