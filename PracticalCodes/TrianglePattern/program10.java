import java.util.*;

class program10{


	public static void main (String [] args){


		Scanner sc = new Scanner(System.in);			int row  =  sc.nextInt();

		int num = 1;
		for(int i = row ; i>0; i--){
			
	
			for(int j = 1 ;j<=i;j++){


			System.out.print(num + " " );
			num++;
			}

			System.out.println();
			num = num-(i-1);


		}


	}

}
