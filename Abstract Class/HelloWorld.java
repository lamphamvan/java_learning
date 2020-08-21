import mypack.Student;
import mypack.Person;

public class HelloWorld{
	public static void main(String[] args){
		Person person = new Person("Lam", 30, 1.72f);
		Student student = new Student("0341040104", "Lam", 30, 1.72f);
		student.setId("016774");
		student.setName("Van Anh");
		student.info();
	}
}