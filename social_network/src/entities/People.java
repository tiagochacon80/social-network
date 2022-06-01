package entities;

public abstract class People {
	protected String name;
	protected int age;
	protected String sex;
	protected float experience;
	
	public People(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.experience = 0;
	}
}
