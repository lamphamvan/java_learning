package mypack;

public class Student extends Person{
	
	private String id;
	
	public Student(String id, String name, int age, float height){
		super(name, age, height);
		this.id = id;
	}
	
	public void info(){
		System.out.println(this.id);
		super.info();
	}
}