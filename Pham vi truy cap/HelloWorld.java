import mypack.Person;

public class HelloWorld{
	public static void main(String[] args){
		Person person = new Person("Lam", 30, 1.72f);
		
		person.eat("Rice");
		person.show();
	}
}