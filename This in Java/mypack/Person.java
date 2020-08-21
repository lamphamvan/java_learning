package mypack;

public class Person{
	private String name;
	private int age;
	private float height;
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age){
		this(name);
		this.age = age;
	}
	
	public Person(String name, int age, float height){
		this(name, age);
		this.height = height;
	}
	
	public void info(){
		System.out.println(this.name + " " + this.age + " " + this.height);
	}
	
	public void eat(String foodName){
		System.out.println(name + " is eating " + foodName);
		this.info();
	}
}