import java.util.*;

class program7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
		char ch = 'a';
		for(int i = 1;i<=row;i++){
			for(int j =row;j>=1;j--){
			System.out.print((char)(ch +row-1) + " ");
			ch--;
			}
			ch = 'a';	
			System.out.println();
		
		}
	}

}
