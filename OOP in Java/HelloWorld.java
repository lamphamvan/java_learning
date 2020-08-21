public class HelloWorld{
	public static void main(String[] args){
		Person[] a = new Person[2];
		
		a[0] = new Person();
		a[0].name = "Lam";
		a[0].age = 30;
		a[0].height = 1.72f;
		System.out.println(a[0].name);
		System.out.println(a[0].age);
		System.out.println(a[0].height);
		
		a[1] = new Person();
		a[1].name = "Van Anh";
		a[1].age = 20;
		a[1].height = 1.50f;
		System.out.println(a[1].name);
		System.out.println(a[1].age);
		System.out.println(a[1].height);
	}
}