package aop.pojo;

public class User {
	private int uno;
	private String name;
	private int age;
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(int uno, String name, int age) {
		super();
		this.uno = uno;
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
	}
	
}
