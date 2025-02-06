const container = document.querySelector(".container"); // obtenemos la referencia
const btnSignIn = document.getElementById("btn-sign-in");
const btnSignUp = document.getElementById("btn-sign-up");

btnSignIn.addEventListener("click",()=>{
	container.classList.remove("toggle");
});
btnSignUp.addEventListener("click",()=>{
	container.classList.add("toggle");
});

/*const btn = documentobjeto.getElementByIdmetodo("btn");obtenemos la referencia de nuestro boton
const container = document.querySelector(".container");


btn.addEventListener("click",()=>{funcion que se ejecutará cuando se haga click en el boton
	container.classList.toggle("toggle"); toogle añade la clase al container, si la tiene la elimina
});*/