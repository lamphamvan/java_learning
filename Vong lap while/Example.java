public class Example{
	public static void main(String[] args){
		int i = 0;
		while(i < 10)
		{
			System.out.println(i);
			i++;
		}
		
		i = 11;
		do{
			System.out.println(i);
			i++;
		}while(i < 10);
	}
}