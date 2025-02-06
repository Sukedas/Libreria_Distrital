<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<title>Inicio</title>
			<link rel="stylesheet" href="css/dashboard.css">
			<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
		</head>
		<body>
			<div class="sidebar" id="sidebar">
				  <div class="header">
				  	<div class="menu-btn" id="menu-btn">
				  		<i class='bx bxs-chevron-left'></i>
				  	</div>
				  	<div class="brand">
				  		<i class='bx bx-library'></i>
				  		<span>Librería UD</span>
				  	</div>
				  </div>
				  
				  <div class="menu-container">
				  		<div class="search">
				  			<i class='bx bx-search'></i>
				  			<input type="search" placeholder="search">
				  		</div>	 
				  		<ul class="menu">
					  		<li class="menu-item menu-item-static active">
					  			<a href="#" class="menu-link">
					  				<i class='bx bx-home-alt-2'></i>
					  				<span>Inicio</span>
					  			</a>
					  		</li>
					  		<li class="menu-item menu-item-dropdown">
					  			<a href="#" class="menu-link">
					  				<i class='bx bx-file'></i>
					  				<span>Documentos</span>
					  				<i class='bx bx-chevron-down'></i>
					  			</a>
					  			<ul class="sub-menu">
					  				<li>
					  					<a href="#" class="sub-menu-link">Artículos</a>
					  				</li>
					  				<li>
					  					<a href="#" class="sub-menu-link">Ponencias</a>
					  				</li>
					  				<li>
					  					<a href="#" class="sub-menu-link">Libros</a>
					  				</li>
					  			</ul>
					  		</li>
					  		<li class="menu-item menu-item-static">
					  			<a href="#" class="menu-link">
					  				<i class='bx bx-calendar'></i>
					  				<span>Reservas</span>
					  			</a>
					  		</li>
					  		<li class="menu-item menu-item-static">
					  			<a href="#" class="menu-link">
					  				<i class='bx bx-history'></i>
					  				<span>Historial</span>
					  			</a>
					  		</li>
				  		</ul> 	
				  </div>
				  <div class="footer">
				  	<ul class="menu">
						<li class="menu-item menu-item-static">
					  		<a href="#" class="menu-link">
					  			<i class='bx bx-cog'></i>
					  			<span>Ajustes</span>
					  		</a>
						</li>		  	
				  	</ul>
				  	<div class="user">
				  		<div class="user-img">
					  		<img alt="user" src="img/user.jpg">
					  	</div>
					  	<div class="user-data">
					  		<span class="name">Nombre de usuario</span>
					  		<span class="email">email de usuario</span>
					  	</div>
					  	<div class="user-icon">
					  		<i class='bx bx-exit'></i>
					  	</div>
				  	</div>
				  </div>
			  </div>
			
			  <!-- Contenido principal -->
				<main id="main">
				  <div class="main-bg"></div>
		
				  <div class="content-wrapper">
				    <section class="welcome">
				      <h1>Bienvenido, <span class="user-name">[Nombre de Usuario]</span>!</h1>
				      <p>Explora la información y gestiona tus documentos de forma sencilla y moderna.</p>
				    </section>
				
				    <section class="widgets">
					  <div class="widget">	
					    <h2>Total de Documentos</h2>
					    <p class="widget-value">150</p>
					    <p class="widget-desc">¡Genial! Tenemos 150 documentos en total.</p>
					  </div>
					  <div class="widget">
					    <h2>Documentos Reservados</h2>
					    <p class="widget-value">10</p>
					    <p class="widget-desc">10 documentos están en reserva.</p>
					  </div>
					  <div class="widget">
					    <h2>Modificaciones Recientes</h2>
					    <p class="widget-value">5</p>
					    <p class="widget-desc">Se han actualizado 5 documentos recientemente.</p>
					  </div>
					</section>
				  </div>
				</main>
		
			  <script type="text/javascript" src="javaScript/menu.js"></script>
			  <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
			  <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
		</body>
	</html>