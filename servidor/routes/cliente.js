const express = require('express');
const router = express.Router();

const clientesList = [
    "manuel",
    "juan",
    "luis"
];

//Obtener información de los clientes
router.get('/get-clients', (req,res) => {
    console.log("devolviendo clientes");
    res.send(JSON.stringify({clientes:clientesList}))
});


//Borrar Cliente
router.delete('/delete-client/:index', (req,res) => {
    console.log("borrando cliente");
    let index = req.params.index;
    clientesList.splice(index,1);
    res.send(JSON.stringify({clientes:clientesList}))
});


//Obtener el cliente más habitual
router.get('/get-client-fav', (req,res) => {
    console.log("devolviendo cliente mas abitual");
    let nombreCliente =clientesList[0];
    
    res.send(JSON.stringify({clienteHabitual:nombreCliente}))
});



module.exports = router;