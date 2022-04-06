
const calculo = require ("../JS10v2/calculos");
const area = require("./areas");
const {suma, resta, multiplicar, dividir} = require ("./calculos")

//[a , b ,c] = [10 , 20, 50];
//{a , b , c} = { obja, objb, objc}

test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma (1 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
} );

test ("Debería sumar dos números negativos", ()=> {
    const operacion = calculo.suma (-4, - 10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta (10 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(7);
} );

test ("Debería restar dos números negativos", ()=> {
    const operacion = calculo.resta(-4, - 10);
    expect(operacion).toBe(6);
});

test ("Debería multiplicar dos números positivos", ()=>{
    const operacion = multiplicar(10 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(30);
} );

test ("Debería obtener el área de un cuadrado", ()=>{
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
});

test ("Debería obtener el área de un rectangulo", ()=>{
    const operacion = area.areaRectangulo(10, 20);
    expect(operacion).toBe(200);
});

