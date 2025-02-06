package model.DAO;

import model.BDConnect.BDConnect;
import model.DTO.UserDTO;
import model.converter.MapHandler;
import model.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO<UserDTO> {
    private BDConnect dbConnect;
   

    public UserDAO() {
        this.dbConnect = BDConnect.getInstance();
    }

    public String validateUser(String username, String password) {
        String sql = "SELECT name_user FROM users WHERE name_user = ? AND pass_user = ?";
        Connection conn = dbConnect.getConnection();
        if (conn == null) {
            System.err.println("Error: No se pudo obtener la conexión a la base de datos.");
            return null;
        }
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("name_user");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en la validación del usuario: " + e.getMessage());
        }
        return null;
    }

    ////--------------------------------------------------FUNCIONANDO insertar
    
    @Override
    public void insert(UserDTO userDTO) {
        
        User user = MapHandler.convertUserDTOToUser(userDTO);

        
        // Consulta para obtener el siguiente valor de la secuencia
        String sequenceQuery = "SELECT user_seq.nextval FROM dual";
        // Consulta para insertar un usuario con el ID generado por la secuencia
        String insertQuery = "INSERT INTO users (id_user, name_user, mail_user, pass_user, role_user, date_regis_user) "
                           + "VALUES (?, ?, ?, ?, ?, SYSDATE)";

        
        try (Connection connection = BDConnect.getInstance().getConnection();
             PreparedStatement sequenceStmt = connection.prepareStatement(sequenceQuery);
             PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {

            // Obtener el siguiente valor de la secuencia
            ResultSet rs = sequenceStmt.executeQuery();
            long userId = 0;
            if (rs.next()) {
                userId = rs.getLong(1);
                user.setId(userId);      
            }

            // Establecer los parámetros del PreparedStatement para la inserción
            insertStmt.setLong(1, userId);
            insertStmt.setString(2, user.getName()); 
            insertStmt.setString(3, user.getMail());
            insertStmt.setString(4, user.getPass());  
            insertStmt.setString(5, user.getRole()); 
            // Ejecutar la inserción
            insertStmt.executeUpdate();

            System.out.println("Usuario insertado exitosamente con ID: " + userId);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Hubo un problema al insertar el usuario.");
        }
    }
    
    
    ///----------------------------------------------FUNCIONANDO update
    @Override
    public void update(UserDTO userDTO) {
        // Convertir UserDTO a User usando MapHandler
        User user = MapHandler.convertUserDTOToUser(userDTO);

        // Consulta para actualizar un usuario por su ID
        String query = "UPDATE users SET name_user = ?, mail_user = ?, pass_user = ?, role_user = ? "
                     + "WHERE id_user = ?";

        try (Connection connection = BDConnect.getInstance().getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            // Establecer los parámetros del PreparedStatement
            stmt.setString(1, user.getName());  // name_user
            stmt.setString(2, user.getMail());  // mail_user
            stmt.setString(3, user.getPass());  // pass_user
            stmt.setString(4, user.getRole());  // role_user
            stmt.setLong(5, user.getId());      // id_user (para identificar el registro a actualizar)

            // Ejecutar la actualización
            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuario actualizado exitosamente.");
            } else {
                System.out.println("No se encontró ningún usuario con el ID: " + user.getId());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Hubo un problema al actualizar el usuario.");
        }
    }
    
    

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id_user = ?"; // Asegúrate de que "id_user" sea el nombre de la columna en tu tabla
        try (Connection conn = dbConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id); // Establece el ID como parámetro
            int rowsAffected = stmt.executeUpdate(); // Ejecuta la consulta
            if (rowsAffected > 0) {
                System.out.println("Usuario con ID " + id + " eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún usuario con ID " + id + ".");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar el usuario: " + e.getMessage());
        } finally {
            dbConnect.closeConnection(); // Cierra la conexión
        }
    }
    
    
    
    
    

    
    //FUNCIONANDO-------------------------------------------------------- el buscar por id
    
    @Override
    public UserDTO findById(int id) {
        // Consulta SQL para buscar un usuario por su ID
        String query = "SELECT id_user, name_user, mail_user, pass_user, role_user "
                     + "FROM users WHERE id_user = ?";

        // Objeto UserDTO para almacenar el resultado
        UserDTO userDTO = null;

        try (Connection connection = BDConnect.getInstance().getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            // Establecer el parámetro del PreparedStatement (el ID del usuario)
            stmt.setInt(1, id);

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                // Verificar si se encontró un resultado
                if (rs.next()) {
                    // Crear un nuevo objeto UserDTO y asignar los valores
                    userDTO = new UserDTO();
                    userDTO.setId(rs.getInt("id_user"));           // id_user
                    userDTO.setName(rs.getString("name_user"));    // name_user
                    userDTO.setMail(rs.getString("mail_user"));    // mail_user
                    userDTO.setPass(rs.getString("pass_user"));    // pass_user
                    userDTO.setRole(rs.getString("role_user"));    // role_user
                    // date_regis_user no se asigna porque no está en el DTO
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Hubo un problema al buscar el usuario por ID.");
        }

        // Devolver el objeto UserDTO (será null si no se encontró el usuario)
        return userDTO;
    }

    
    
   
    ///FUNCIONANDO------------------------- EL BUSCAR TODOS
     
    @Override
    public List<UserDTO> findAll() {
        // Consulta SQL para obtener todos los usuarios
        String query = "SELECT id_user, name_user, mail_user, pass_user, role_user FROM users";

        // Lista para almacenar los usuarios
        List<UserDTO> userList = new ArrayList<>();

        try (Connection connection = BDConnect.getInstance().getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            // Recorrer todos los registros del ResultSet
            while (rs.next()) {
                // Crear un nuevo objeto UserDTO y asignar los valores
                UserDTO userDTO = new UserDTO();
                userDTO.setId(rs.getInt("id_user"));           // id_user
                userDTO.setName(rs.getString("name_user"));    // name_user
                userDTO.setMail(rs.getString("mail_user"));    // mail_user
                userDTO.setPass(rs.getString("pass_user"));    // pass_user
                userDTO.setRole(rs.getString("role_user"));    // role_user

                // Agregar el UserDTO a la lista
                userList.add(userDTO);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Hubo un problema al obtener la lista de usuarios.");
        }

        // Devolver la lista de usuarios
        return userList;
    }
}