console.log("Sesión Js06");

/**
 * Obtiene los datos del formulario.
 * @param {boolean} colorFondo Determina el color del formulario
 */
function obtenerFormulario(colorFondo) {
  colorFondo = "blue";
  let formulario = document.forms["formulario"];
  //console.log(formulario);
  let concatenacion = "";
  for (let i of formulario) {
    //console.log(i.value);
    concatenacion = concatenacion + " " + i.value;
  }
  console.log(concatenacion);
  console.log(formulario.nombre.name);
  console.log(formulario.apellido.value);
  localStorage.setItem(
    formulario["nombre"]["name"],
    formulario["nombre"]["value"]
  );
  localStorage.setItem(
    formulario["apellido"]["name"],
    formulario["apellido"]["value"]
  );
}

/**
 * Recuperación de los datos en memoria.
 */
function recuperarFormulario() {
  let formulario = document.forms["formulario"];
  console.log(
    "Datos en memoria: ",
    localStorage.getItem(formulario["nombre"]["name"])
  );
  formulario["nombre"]["value"] = localStorage.getItem(
    formulario["nombre"]["name"]
  );
  formulario["apellido"]["value"] = localStorage.getItem(
    formulario["apellido"]["name"]
  );
}

/**
 * Pone invisble al botón principal del formulario
 */
function setInvisible() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";
}

/**
 * Oculta el botón principal del formulario
 */
function setOcultar() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
}

function recordatorio() {
  let array = ["dato1", "dato2", ["dato3","dato4"]];
  let obtenerdato1 = array[0];

  let nuevoObjeto = {clave1: ["dato3","dato4"], clave2: true, clave3: 45}

  let objeto = { 
      clave1: true, 
      clave2: ["dato1", "dato2", "dato3"] , 
      clave3: { 
          claveinterna1:16, 
          claveinterna2:"datoobj2"} 
        };
        
        
}
