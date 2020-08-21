package mypack;

public class Student extends Person{
	
	private String id;
	
	public Student(String id, String name, int age, float height){
		super(name, age, height);
		this.id = id;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void info(){
		System.out.println(this.id);
		super.info();
	}
	
	public void eat(String foodName){
		super.eat(foodName);
	}
}