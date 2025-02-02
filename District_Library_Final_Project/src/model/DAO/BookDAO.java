package model.DAO;

import java.sql.*;
import model.BDConnect.BDConnect;
import model.entities.Book;
import model.DTO.BookDTO;
import model.converter.MapHandler;

public class BookDAO {
    private BDConnect connBD;

    public BookDAO() {
        connBD = BDConnect.getInstance();
    }

    public void insertBook(BookDTO bookDTO) throws SQLException {
    	String sqlInsertDocument = "BEGIN " +
    		    "INSERT INTO DOCUMENTS (id_docu, title_docu, mon_pub_docu, author_docu, day_pub_docu, state_docu, users_id_user, type_docu) " +
    		    "VALUES (documents_seq.NEXTVAL, ?, ?, ?, ?, DEFAULT, ?, ?) " +
    		    "RETURNING id_docu INTO ?; " +
    		    "END;";


        String sqlInsertBook = "INSERT INTO BOOK (id_docu, isbn_book, num_pag_book) VALUES (?, ?, ?)";

        try (Connection conn = connBD.getConnection();
        	     CallableStatement stmtDoc = conn.prepareCall(sqlInsertDocument);
        	     PreparedStatement stmtBook = conn.prepareStatement(sqlInsertBook)) {

        	    conn.setAutoCommit(false);

        	    Book book = MapHandler.convertBookDTOToBook(bookDTO);

        	    stmtDoc.setString(1, book.getTitle_docu());
        	    stmtDoc.setDate(2, new java.sql.Date(book.getMon_pub_docu().getTime()));
        	    stmtDoc.setString(3, book.getAuthor_docu());
        	    stmtDoc.setDate(4, new java.sql.Date(book.getDay_pub_docu().getTime()));
        	    stmtDoc.setInt(5, book.getUsers_id_user());
        	    stmtDoc.setString(6, book.getType_docu());

        	    // Registrar el parámetro de salida en la posición correcta (último parámetro)
        	    stmtDoc.registerOutParameter(7, Types.INTEGER);

        	    // Ejecutamos la sentencia
        	    stmtDoc.executeUpdate();

        	    // Recuperamos el ID generado
        	    int generatedId = stmtDoc.getInt(7);

        	    // Insertamos el libro usando el ID generado
        	    stmtBook.setInt(1, generatedId);
        	    stmtBook.setString(2, book.getBook_ISBN());
        	    stmtBook.setInt(3, book.getPages_number());
        	    stmtBook.executeUpdate();

        	    conn.commit();
        	} catch (SQLException e) {
        	    throw e;
        	}

    }


    public void deleteBook(int id) throws SQLException {
        String sqlDeleteBook = "DELETE FROM book WHERE ID_DOCU = ?";
        String sqlDeleteDocument = "DELETE FROM documents WHERE id_docu = ?";

        try (Connection conn = connBD.getConnection();
             PreparedStatement stmtBook = conn.prepareStatement(sqlDeleteBook);
             PreparedStatement stmtDoc = conn.prepareStatement(sqlDeleteDocument)) {

            conn.setAutoCommit(false);

            stmtBook.setInt(1, id);
            stmtBook.executeUpdate();

            stmtDoc.setInt(1, id);
            stmtDoc.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            throw e;
        }
    }
}
