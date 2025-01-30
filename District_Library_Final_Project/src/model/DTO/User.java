package model.DTO;

/**
 * Clase DTO para la entidad User.
 */
public class User {
    private String name;
    private String mail;
    private String pass;
    private String role;

    public String getName() { 
    	return name; 
    	}
    
    public void setName(String name) {
    	this.name = name; 
    	}

    public String getMail() {
    	return mail; 
    	}
    public void setMail(String mail) { 
    	this.mail = mail;
    	}

    public String getPass() { 
    	return pass;
    	}
    public void setPass(String pass) {
    	this.pass = pass; 
    	}

    public String getRole() { 
    	return role; 
    	}
    public void setRole(String role) {
    	this.role = role; 
    	}
}
