const express = require('express');
const router = express.Router();




const productosList = [
    "bicicleta",
    "ps5",
    "pc gamming",
    "television LG",
    "Balon"
];


//Obtener información de los productos


router.get('/get-products', (req,res) => {
    console.log("devolviendo productos");
    res.send(JSON.stringify({productos:productosList}))
});


//Añadir un producto

router.post('/add-products', (req,res) => {
    const productoNuevo = req.body.producto;
    console.log(productoNuevo);
    productosList.push(productoNuevo);
    res.send(JSON.stringify({response:"producto añadido correctamente",productos:productosList}))
});
//Exportar un pdf con una tabla de los productos de una categoría concreta
router.get('/get-products-pdf', (req,res) => {
    
    res.send(JSON.stringify({mensaje:"Exportando pdf de productos de la categoría X"}))
});


//Borrar Producto
router.delete('/delete-product/:index', (req,res) => {
    console.log("borrando producto");
    let index = req.params.index;
    productosList.splice(index,1);
    res.send(JSON.stringify({productos:productosList}))
});



module.exports = router;