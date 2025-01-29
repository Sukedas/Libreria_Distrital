package model.BDConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para gestionar la conexión a una base de datos Oracle.
 */
public class BDConnect {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    private static final String USERNAME = "DAVID";
    private static final String PASSWORD = "D4V1D";
    private Connection connection;

    public BDConnect() {
        openConnection();
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

    public Connection getConnection() {
        return connection;
    }
}
