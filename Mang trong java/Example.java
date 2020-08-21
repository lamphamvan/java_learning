public class Example{
	public static void main(String[] args){
		int[] a;
		a = new int[3];
		a[0] = 5;
		a[1] = 2;
		a[2] = 4;
		
		System.out.println(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for(int i = 0 ; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.println(b[i][j]);
			}
		}
	}
}