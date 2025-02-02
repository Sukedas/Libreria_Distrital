package model.DAO;

import java.sql.*;
import model.BDConnect.BDConnect;
import model.entities.Paper;
import model.DTO.PaperDTO;
import model.converter.MapHandler;

public class PaperDAO {
    private BDConnect connBD;

    public PaperDAO() {
        connBD = BDConnect.getInstance();
    }

    public void insertPaper(PaperDTO paperDTO) throws SQLException {
    	String sqlInsertDocument = "BEGIN " +
    		    "INSERT INTO DOCUMENTS (id_docu, title_docu, mon_pub_docu, author_docu, day_pub_docu, state_docu, users_id_user, type_docu) " +
    		    "VALUES (documents_seq.NEXTVAL, ?, ?, ?, ?, DEFAULT, ?, ?) " +
    		    "RETURNING id_docu INTO ?; " +
    		    "END;";


        String sqlInsertBook = "INSERT INTO paper (id_docu, isbn_paper, congrest_paper) VALUES (?, ?, ?)";

        try (Connection conn = connBD.getConnection();
        	     CallableStatement stmtDoc = conn.prepareCall(sqlInsertDocument);
        	     PreparedStatement stmtPaper = conn.prepareStatement(sqlInsertBook)) {

        	    conn.setAutoCommit(false);

        	    Paper paper = MapHandler.convertPaperDTOToPaper(paperDTO);

        	    stmtDoc.setString(1, paper.getTitle_docu());
        	    stmtDoc.setDate(2, new java.sql.Date(paper.getMon_pub_docu().getTime()));
        	    stmtDoc.setString(3, paper.getAuthor_docu());
        	    stmtDoc.setDate(4, new java.sql.Date(paper.getDay_pub_docu().getTime()));
        	    stmtDoc.setInt(5, paper.getUsers_id_user());
        	    stmtDoc.setString(6, paper.getType_docu());

        	    // Registrar el parámetro de salida en la posición correcta (último parámetro)
        	    stmtDoc.registerOutParameter(7, Types.INTEGER);

        	    // Ejecutamos la sentencia
        	    stmtDoc.executeUpdate();

        	    // Recuperamos el ID generado
        	    int generatedId = stmtDoc.getInt(7);

        	    // Insertamos el libro usando el ID generado
        	    stmtPaper.setInt(1, generatedId);
        	    stmtPaper.setString(2, paper.getPaper_ISBN());
        	    stmtPaper.setString(3, paper.getName_congrest());
        	    stmtPaper.executeUpdate();

        	    conn.commit();
        	} catch (SQLException e) {
        	    throw e;
        	}

    }


    public void deletePaper(int id) throws SQLException {
        String sqlDeletePaper = "DELETE FROM book WHERE ID_DOCU = ?";
        String sqlDeleteDocument = "DELETE FROM documents WHERE id_docu = ?";

        try (Connection conn = connBD.getConnection();
             PreparedStatement stmtPaper = conn.prepareStatement(sqlDeletePaper);
             PreparedStatement stmtDoc = conn.prepareStatement(sqlDeleteDocument)) {

            conn.setAutoCommit(false);

            stmtPaper.setInt(1, id);
            stmtPaper.executeUpdate();

            stmtDoc.setInt(1, id);
            stmtDoc.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            throw e;
        }
    }
}
