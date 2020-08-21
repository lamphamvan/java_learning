public class HelloWorld{
	public static void main(String[] args){
		Person person = new Person("Lam", 30, 1.72f);
		System.out.println(person.getAge());
		System.out.println(person.getHeight());
		person.eat("Rice");
	}
}