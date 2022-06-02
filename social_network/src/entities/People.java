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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", sex=" + sex + ", experience=" + experience + "]";
	}
	
	
	
}
