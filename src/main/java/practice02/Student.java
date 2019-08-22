package practice02;

public class Student extends Person {
	private int klass;
	public Student(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String introduce() {
		// TODO Auto-generated method stub
		return "I am a Student. I am at Class 2.";
	}
	public int getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}
}
