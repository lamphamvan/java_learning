public class Example{
	public static void main(String[] args){
		int age = 17;
		String job = "Sinh vien";
		
		if(age >= 18)
		{
			System.out.println("Du tuoi dang ky ket hon");
		}
		else
		{
			System.out.println("Chua du tuoi dang ky ket hon");
		}
		
		if(job == "Sinh vien")
		{
			System.out.println("Ban la sinh vien");
		}
		else if(job == "Giao vien")
		{
			System.out.println("Ban la giao vien");
		}
		else
		{
			System.out.println("Ban chang la gi ca");
		}
	}
}