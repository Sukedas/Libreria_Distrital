package model.entities;

public class User {
	private long id;
    private String name;
    private String mail;
    private String pass;
    private String role;

    
    public User(long id, String name, String mail, String pass, String role) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.pass = pass;
		this.role = role;
	}

	// Getters y Setters
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
    
}