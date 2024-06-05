import java.util.*;

class program9{

	public static void main(String [] agrs){

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i = row;i>0;i--){
			int num = 1;

			for(int j = 1 ;j<=i;j++){

			System.out.print(num + " ");

			num++;
			}
			System.out.println();


		}

	}

}
