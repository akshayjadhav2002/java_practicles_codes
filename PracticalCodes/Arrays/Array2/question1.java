import java.util.*;

class Array{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr [] = new int [size];

		for(int itr =0;itr<size;itr++){

			arr[itr] = sc.nextInt();

		}

		System.out.println("Even Numbers in Array");
		int evenCount = 0;
		for(int iter = 0 ; iter<size;iter++){
			if(arr[iter]%2==0){
				evenCount++;
			System.out.println(arr[iter] + " " );
			}

		}
		System.out.println("The count of even number is " + evenCount);
	}

}
