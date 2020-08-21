import mypack.Student;

public class HelloWorld{
	public static void main(String[] args){
		Student student = new Student("0341040104", "Lam", 30, 1.72f);
		student.setId("016774");
		student.setName("Van Anh");
		student.info();
	}
}