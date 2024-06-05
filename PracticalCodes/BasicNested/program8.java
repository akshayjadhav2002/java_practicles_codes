import java.util.*;

class program8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		String ch = sc.next();
		int num =1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
			System.out.print(ch);
			System.out.print(num);
			num++;
			}
			System.out.println();
		}
		
	
	}

}
