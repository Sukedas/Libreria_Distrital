package model.DAO;

public class DocumentDAO {
	package model.DAO;

	import model.BDConnect.BDConnect;
	import model.DTO.User;

	import java.sql.*;
	import java.util.List;

	/**
	 * Implementación del DAO para la entidad User.
	 */
	public class UserDAO implements DAO<User> {
	    private BDConnect dbConnect;

	    // Constructor sin parámetros, ya que obtenemos la instancia de BDConnect directamente
	    public UserDAO() {
	        this.dbConnect = BDConnect.getInstance(); // Obtenemos la instancia única de BDConnect
	    }

	    /**
	     * Valida si un usuario existe en la base de datos por su contraseña.
	     * 
	     * @param username Nombre de usuario.
	     * @param password Contraseña del usuario.
	     * @return Nombre del usuario si existe, null si no.
	     */
	    public String validateUser(String username, String password) {
	        String sql = "SELECT name_user FROM users WHERE name_user = ? AND pass_user = ?";
	        try (Connection conn = dbConnect.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            try (ResultSet rs = stmt.executeQuery()) {
	                if (rs.next()) {
	                    return rs.getString("name_user"); 
	                }
	            }
	        } catch (SQLException e) {
	            System.err.println("Error en la validación del usuario: " + e.getMessage());
	        } finally {
	            dbConnect.closeConnection(); // Cerramos la conexión después de usarla
	        }
	        return null;
	    }

	    @Override
	    public void insert(User entity) {
	        // No implementado
	    }

	    @Override
	    public void update(User entity) {
	        // No implementado
	    }

	    @Override
	    public void delete(int id) {
	        // No implementado
	    }

	    @Override
	    public User findById(int id) {
	        return null; // No implementado
	    }

	    @Override
	    public List<User> findAll() {
	        return null; // No implementado
	    }
	}
}
