import java.util.*;

class Arrays{
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int arr [] = new int [size];

		for(int itr = 0 ;itr<size;itr++){
			arr[itr] = sc.nextInt();

		}
		System.out.println("Even elements");

		for(int itr =0;itr <size;itr ++){
			if(arr[itr]%2==0){
			System.out.println(arr[itr]);
			}
		}

	}

}
