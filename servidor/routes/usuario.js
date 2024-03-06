const express = require('express');
const router = express.Router();




const usuariosList = [
    "manu@gmail.com",
    "jose@gmail.com",
    "elu@gmail.com"
];


//Obtener información de los productos


router.get('/get-users', (req,res) => {
    console.log("devolviendo usuarios");
    res.send(JSON.stringify({usuarios:usuariosList}))
});



module.exports = router;