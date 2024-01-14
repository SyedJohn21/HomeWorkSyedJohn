package hw09Encapsulation;

public class Employee {

	private String name;
	private int age;
	private char sex;
	private boolean citizen;

	public String getName() { //We can access above variables by "right click -> source -> Generate Getters and Setters -> select variables -> insertion point: after the last variable present inside the class -> sorts by: Fields in getter/setter pair"
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isCitizen() {
		return citizen;
	}

	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}


		
	}


