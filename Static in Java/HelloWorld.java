import mypack.Student;

public class HelloWorld{
	
	public static void main(String[] args){
		System.out.println(Student.universityName);
		System.out.println(Student.total);
		Student student1 = new Student("Lam", 30, 1.72f);
		Student student2 = new Student("Lam", 30, 1.72f);
		System.out.println(Student.total); 
	}
}