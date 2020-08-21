package mypack;

public class Person{
	private String name;
	private int age;
	private float height;
	
	public Person(String name, int age, float height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void eat(String foodName){
		System.out.println(name + " is eating " + foodName);
	}
	
	public int getAge(){
		return age;
	}
	
	public float getHeight(){
		return height;
	}
	
	public void show(){
		System.out.println(name + " " + age + " " + height);
	}
}