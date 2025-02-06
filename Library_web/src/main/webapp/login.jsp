<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<div class="container">
			<div class="container-form">
				<form class="sign-in">
					<h2> Iniciar sesión</h2>
					<span> Use su correo y contraseña</span>
					<div class="container-input">
						<ion-icon name="mail-outline"></ion-icon>
						<input type="email" placeholder="Correo electrónico">
					</div>
					<div class="container-input">
						<ion-icon name="lock-closed-outline"></ion-icon>
						<input type="password" placeholder="Contraseña">
					</div>
					<a href="#">¿Olvidaste tu contraseña?</a>
					<button class="button">INICIAR SESIÓN</button>
				</form>
			</div>
			<div class="container-form">
				<form class="sign-up">
					<h2> Registrarse </h2>
					<span> Use su correo electrónico para registrarse</span>
					<div class="container-input">
						<ion-icon name="person-outline"></ion-icon>
						<input type="text" placeholder="Nombre">
					</div>
					<div class="container-input">
						<ion-icon name="mail-outline"></ion-icon>
						<input type="email" placeholder="Correo electrónico">
					</div>
					<div class="container-input">
						<ion-icon name="lock-closed-outline"></ion-icon>
						<input type="password" placeholder="Contraseña">
					</div>
					<button class="button">REGISTRARSE</button>
				</form>
				</form>
			</div>
			
			<div class="container-welcome">
				<div class="welcome-sign-up welcome">
					<h3>¡Bienvenido!</h3>
					<p>Ingrese sus datos personales para usar todas las funciones de la librería de documentos </p>
					<button class="button" id="btn-sign-up">Registrarse</button>
				</div>
				<div class="welcome-sign-in welcome">
					<h3>¡Hola!</h3>
					<p>Regístrese con sus datos personales para usar todas las funciones de la librería de documentos </p>
					<button class="button" id="btn-sign-in">Iniciar Sesión</button>
				</div>
			</div>
			
		</div>
		
		<script type="text/javascript" src="javaScript/script.js"></script>
		<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
		<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
	</body>
</html>