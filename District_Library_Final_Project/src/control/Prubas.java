package control;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import model.DAO.BookDAO;
import model.DAO.PaperDAO;
import model.DAO.UserDAO;
import model.DTO.BookDTO;
import model.DTO.PaperDTO;
import model.DTO.UserDTO;

public class Prubas {
	public static void main(String[] args) {
		// Ya esta con el singleton, uso la misma instancia
		UserDAO userDAO = new UserDAO(); // UserDAO obtiene la instancia única de BDConnect internamente
		Scanner scanner = new Scanner(System.in);

		// BookDAO bookDAO = new BookDAO();
		// BookDTO nuevoLibro = new BookDTO();

		PaperDAO paperDAO = new PaperDAO();
		PaperDTO nuevoPaper = new PaperDTO();
		
		
		try {
            // Usar un SimpleDateFormat para el manejo de fechas
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            // Asignar valores al BookDTO
            nuevoPaper.setTitle_docu("Análisis detallado de porque no usar GPT");
            nuevoPaper.setMon_pub_docu(sdf.parse("2010-16-5"));
            nuevoPaper.setAuthor_docu("David Ospino y ");
            nuevoPaper.setDay_pub_docu(sdf.parse("2023-05-10"));
            nuevoPaper.setUsers_id_user(1); 
            nuevoPaper.setType_docu("Paper");
            nuevoPaper.setPaper_ISBN("979-4-16-148410-0");
            nuevoPaper.setCongrest("Congreso iberoamericano de pollitos");

            // Llamar al método insertPaper para insertar el paper
            paperDAO.insertPaper(nuevoPaper);

            System.out.println("Ponencia insertada correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al insertar la ponencia");
        } finally {
            scanner.close();
        }
    }


		/*
		 * try { // Usar un SimpleDateFormat para el manejo de fechas SimpleDateFormat
		 * sdf = new SimpleDateFormat("yyyy-MM-dd");
		 * 
		 * // Asignar valores al BookDTO nuevoLibro.setTitle_docu("Luna de Plutón");
		 * nuevoLibro.setMon_pub_docu(sdf.parse("2010-16-5"));
		 * nuevoLibro.setAuthor_docu("Dross");
		 * nuevoLibro.setDay_pub_docu(sdf.parse("2023-05-10"));
		 * nuevoLibro.setUsers_id_user(1); nuevoLibro.setType_docu("Libro");
		 * nuevoLibro.setBook_ISBN("979-4-16-148410-0");
		 * nuevoLibro.setPages_number(800);
		 * 
		 * // Llamar al método insertBook para insertar el libro
		 * bookDAO.insertBook(nuevoLibro);
		 * 
		 * System.out.println("Libro insertado correctamente.");
		 * 
		 * } catch (Exception e) { e.printStackTrace();
		 * System.out.println("Error al insertar el libro."); } finally {
		 * scanner.close(); } }
		 */
//--------------------------------FUNCIONAL GUARDADO ID

		/// prueba insercion creando mi objeto dto

		/*
		 * // Crear un objeto UserDTO con los datos del nuevo usuario UserDTO
		 * nuevoUsuario = new UserDTO(); nuevoUsuario.setName("José");
		 * nuevoUsuario.setMail("José@gmail.com"); nuevoUsuario.setPass("c322");
		 * nuevoUsuario.setRole("Escritor");
		 * 
		 * // Crear una instancia del UserDAO
		 * 
		 * // Llamar al método insert() para insertar al nuevo usuario
		 * userDAO.insert(nuevoUsuario);
		 * 
		 * // Verificar si el ID ha sido asignado correctamente
		 * System.out.println("Usuario insertado correctamente. ID asignado: " +
		 * nuevoUsuario.getId());
		 * 
		 */

		/// FUNCIONANDO UPDATE--------------------------------------------------------

		/*
		 * ///prueba de update UserDTO user = new UserDTO(); user.setId(1);
		 * user.setName("Jimenez"); user.setMail("jimenes@mail.com");
		 * user.setPass("Cabo123"); user.setRole("Administrador");
		 * 
		 * // Llamar al método update userDAO.update(user);
		 * 
		 */

		/// BUSQUEDA POR ID FUNCIONANDO------------------------------
		/*
		 * UserDTO user = userDAO.findById(5);
		 * 
		 * if (user != null) { System.out.println("Usuario encontrado:");
		 * System.out.println("ID: " + user.getId()); System.out.println("Nombre: " +
		 * user.getName()); System.out.println("Correo: " + user.getMail());
		 * System.out.println("Rol: " + user.getRole()); } else {
		 * System.out.println("No se encontró ningún usuario con ese ID."); }
		 * 
		 */

		//// ENCONTRAR TODOS

		// Obtener todos los usuarios
		/*
		 * List<UserDTO> users = userDAO.findAll();
		 * 
		 * if (!users.isEmpty()) { System.out.println("Usuarios encontrados:"); for
		 * (UserDTO user : users) { System.out.println("ID: " + user.getId());
		 * System.out.println("Nombre: " + user.getName());
		 * System.out.println("Correo: " + user.getMail()); System.out.println("Rol: " +
		 * user.getRole()); System.out.println("-----------------------------"); } }
		 * else { System.out.println("No se encontraron usuarios."); } ¨ }
		 */
}