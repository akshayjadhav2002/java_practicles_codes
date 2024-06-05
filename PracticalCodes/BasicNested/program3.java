import java.util.*;

class program3{
	public static void main(String [] str){
	
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		for(int i =1;i<=row;i++){
			for(int j =1;j<=row;j++){
				System.out.print(i+ " " );
			}
			System.out.println();
		}
	}

}
