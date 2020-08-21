package mypack;

public abstract class Person{
	protected String name;
	protected int age;
	protected float height;
	
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
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		if(age > 0 && age < 100){
			this.age = age;
		}
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public void setHeiht(float height){
		if(height > 0.0 && height < 2.0){
			this.height = height;
		}
	}
	
	public void info(){
		System.out.println(this.name + " " + this.age + " " + this.height);
	}
	
	public void eat(String foodName){
		System.out.println(name + " is eating " + foodName);
		this.info();
	}
}