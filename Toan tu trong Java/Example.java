public class Example{
    public static void main(String[] args){
        int a = 1;
		int b = 2;
		System.out.println(a++);   //1
		System.out.println(++a);   //3
		System.out.println(a & b); //2
		System.out.println(a | b); //3
		System.out.println(~a);    //-4
		System.out.println(a << 1);//6
		System.out.println(a >> 1);//1
		
		Boolean c = true;
		Boolean d = false;
		System.out.println(c && d); //false
		System.out.println(c || d); //true
		System.out.println(!c); //false
		
		String name = "Lam";
		Boolean isString = name instanceof String;
		System.out.println(isString); //true
		
		int e = a < b ? a : b;
		System.out.println(e);
    }
}