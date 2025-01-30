package control;

import java.util.Scanner;
import model.DAO.UserDAO;

public class Prubas {
    public static void main(String[] args) {
        // Ya esta con el singleton, uso la misma instancia
        UserDAO userDAO = new UserDAO(); // UserDAO obtiene la instancia única de BDConnect internamente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        String authenticatedUser = userDAO.validateUser(username, password);

        if (authenticatedUser != null) {
            System.out.println("Usuario autenticado: " + authenticatedUser);
        } else {
            System.out.println("Credenciales incorrectas.");
        }

        scanner.close();
    }
}