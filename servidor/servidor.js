const express = require('express');
const bodyParser = require('body-parser');

const clienteRouter = require('./routes/cliente');
const productoRouter = require('./routes/producto');
const usuarioRouter = require('./routes/usuario');
const app = express();

const puerto = 3000;

app.use(bodyParser.urlencoded({extended:true}));

app.use(bodyParser.json());

//Añadimos las rutas a app

app.use("/clientes",clienteRouter);

app.use("/productos",productoRouter);

app.use("/usuarios",usuarioRouter);

app.listen(puerto, () =>{
    console.log(`App corriendo en puerto ${puerto}`)
})