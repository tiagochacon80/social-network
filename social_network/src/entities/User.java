package entities;

public class User extends People {
	private String login;
	private int toAssisted;
	
	
	
	public User(String name, int age, String sex, String login, int toAssisted) {
		super(name, age, sex);
		this.login = login;
		this.toAssisted = 0;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getToAssisted() {
		return toAssisted;
	}
	public void setToAssisted(int toAssisted) {
		this.toAssisted = toAssisted;
	}
	
	
}
