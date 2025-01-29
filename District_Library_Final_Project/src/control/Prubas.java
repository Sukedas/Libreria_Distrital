package control;

import java.util.Scanner;
import model.BDConnect.BDConnect;
import model.DAO.UserDAO;

public class Prubas {
    public static void main(String[] args) {
        BDConnect dbConnect = new BDConnect();
        UserDAO userDAO = new UserDAO(dbConnect);
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

        dbConnect.closeConnection();
        scanner.close();
    }
}
