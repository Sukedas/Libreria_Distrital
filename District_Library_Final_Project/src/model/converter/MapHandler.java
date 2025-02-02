package model.converter;

import model.entities.*;
import model.DTO.*;

public class MapHandler {
	
	public static User convertUserDTOToUser(UserDTO userDTO) {
		User user = new User (userDTO.getId(),
				userDTO.getName(),
				userDTO.getMail(),
				userDTO.getPass(),
				userDTO.getRole()
				);
		return user;
	}
	
	public static UserDTO convertUserToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setMail(user.getMail());
		userDTO.setPass(user.getPass());
		userDTO.setRole(user.getRole());
		return userDTO;
	}//////////////////////////////////////////////////////////
	
	public static Book convertBookDTOToBook(BookDTO bookDTO) {
		Book book = new Book (
				bookDTO.getTitle_docu(), 
				bookDTO.getAuthor_docu(),
				bookDTO.getType_docu(),
				bookDTO.getMon_pub_docu(),
				bookDTO.getDay_pub_docu(),
				bookDTO.getUsers_id_user(),
				bookDTO.getPages_number(),
				bookDTO.getBook_ISBN()
				);
		return book;
		
	}
	public static BookDTO convertBookToBookDTO(Book book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId_docu(book.getId_docu()); // Exclusiva para la base de datos(?
		bookDTO.setTitle_docu(book.getTitle_docu());
		bookDTO.setMon_pub_docu(book.getMon_pub_docu());
		bookDTO.setAuthor_docu(book.getAuthor_docu());
		bookDTO.setDay_pub_docu(book.getDay_pub_docu());
		bookDTO.setType_docu(book.getType_docu());
		bookDTO.setUsers_id_user(book.getUsers_id_user());
		bookDTO.setPages_number(book.getPages_number());
		bookDTO.setBook_ISBN(book.getBook_ISBN());
		return bookDTO;
		
	}////////////////////////////////////////////////////////////
	
	public static Paper convertPaperDTOToPaper(PaperDTO paperDTO) {
		Paper paper = new Paper (
				paperDTO.getTitle_docu(), 
				paperDTO.getAuthor_docu(),
				paperDTO.getType_docu(),
				paperDTO.getMon_pub_docu(),
				paperDTO.getDay_pub_docu(),
				paperDTO.getUsers_id_user(),
				paperDTO.getCongrest(),
				paperDTO.getPaper_ISBN()
				);
		return paper;
		
	}
	public static PaperDTO convertPaperToPapeDTO(Paper paper) {
		PaperDTO paperDTO = new PaperDTO();
		paperDTO.setId_docu(paper.getId_docu()); // Exclusiva para la base de datos(?)
		paperDTO.setTitle_docu(paper.getTitle_docu());
		paperDTO.setMon_pub_docu(paper.getMon_pub_docu());
		paperDTO.setAuthor_docu(paper.getAuthor_docu());
		paperDTO.setDay_pub_docu(paper.getDay_pub_docu());
		paperDTO.setType_docu(paper.getType_docu());
		paperDTO.setUsers_id_user(paper.getUsers_id_user());
		paperDTO.setCongrest(paper.getName_congrest());
		paperDTO.setPaper_ISBN(paper.getPaper_ISBN());
		return paperDTO;
	}/////////////////////////////////////////////////////////////////
	
	public static Article convertArticleDTOToArticle(ArticleDTO articleDTO)	{
		Article article = new Article(
				articleDTO.getTitle_docu(),
				articleDTO.getAuthor_docu(),
				articleDTO.getType_docu(),
				articleDTO.getMon_pub_docu(),
				articleDTO.getDay_pub_docu(),
				articleDTO.getUsers_id_user(),
				articleDTO.getSSN());
		return article;
	}
	
	public static ArticleDTO convertArticleToArticleDTO(Article article) {
		ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setId_docu(article.getId_docu()); // Exclusiva para la base de datos(?
        articleDTO.setTitle_docu(article.getTitle_docu());
        articleDTO.setMon_pub_docu(article.getMon_pub_docu());
        articleDTO.setAuthor_docu(article.getAuthor_docu());
        articleDTO.setDay_pub_docu(article.getDay_pub_docu());
        articleDTO.setType_docu(article.getType_docu());
        articleDTO.setUsers_id_user(article.getUsers_id_user());
        articleDTO.setSSN(article.getSSN());
		return articleDTO;
	}////////////////////////////////////////////////////////////////////////////////////////
	public static Reserve convertReserveDTOToReserve(ReserveDTO reserveDTO) {
		Reserve reserve = new Reserve(
				reserveDTO.getDate_reserve(),
				reserveDTO.getDate_return());
		return reserve;
	}
	public static ReserveDTO convertReserveToReserveDTO(Reserve reserve) {
		ReserveDTO reserveDTO = new ReserveDTO();
		reserveDTO.setDate_reserve(reserve.getDate_reserve());
		reserveDTO.setDate_return(reserve.getDate_return());
		return reserveDTO;
	}
}
