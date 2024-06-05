import java.util.*;

class Arrays{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr [] = new int [size];
		for(int itr = 0 ; itr <size;itr++){
			arr[itr] = sc.nextInt();
		}
		int sum = 0;
		for(int itr = 0;itr<size;itr++){
			
			if(arr[itr]!=0){
				sum = sum + arr[itr];

			}
		}
		System.out.println("Sum od Odd no is " + sum);
	}

}
