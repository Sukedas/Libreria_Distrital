package model.BDConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para gestionar la conexión a una base de datos Oracle.
 * Implementa el patrón Singleton para asegurar una única instancia.
 */
public class BDConnect {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    private static final String USERNAME = "DAVID";
    private static final String PASSWORD = "D4V1D";
    private Connection connection;

    // Instancia única de la clase
    private static BDConnect instance;

    // Constructor privado para evitar la creación de instancias fuera de la clase
    private BDConnect() {
        openConnection();
    }

    /**
     * Método estático que devuelve la única instancia de la clase.
     * Si no existe, la crea.
     *
     * @return La única instancia de BDConnect.
     */
    public static BDConnect getInstance() {
        if (instance == null) {
            instance = new BDConnect();
        }
        return instance;
    }

    /**
     * Método para abrir la conexión a la base de datos.
     */
    private void openConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Conexión a Oracle establecida con éxito.");
            }
        } catch (SQLException e) {
            System.err.println("¡Falló la conexión! Verifica la configuración.");
            e.printStackTrace();
        }
    }

    /**
     * Método para cerrar la conexión a la base de datos.
     */
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }

    /**
     * Método para obtener la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
    public Connection getConnection() {
        return connection;
    }
}