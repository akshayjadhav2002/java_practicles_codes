import java.util.*;

class program3{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
			int num = row;
		for(int i=1;i<=row;i++){

			for(int j =1;j<=i;j++){

				System.out.print(num + " ");
				num--;

			}
			num = row;
			
			System.out.println();

		}

	}


}
