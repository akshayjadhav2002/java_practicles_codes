import java.util.*;

class program4{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		char ch = 'A';
		for(int i =1;i<=row;i++){
			for(int j =1;j<=row;j++){
				System.out.print(ch +" ");
			ch+=2;
			}
			
			System.out.println();

		}
	}

}
