import java.util.*;

class program2{
	
	public static void main(String args [] ){

		Scanner sc =new Scanner(System.in);

		System.out.println("ENter the size of array");

		int size =  sc.nextInt();

		int arr [] = new int [size];
		for(int i =0;i<size;i++){

			arr[i] = sc.nextInt();

		}
		int cnt = 0;
		int sum = 0;
		for(int i = 0;i<size;i++){
			if(arr[i]<=1){
				
			}
			else{
			for(int j =2 ; j*j<arr[i];j++){

				if(arr[i]%j==0){
				continue;
				}
				else{
					cnt++;
					sum+=arr[i];
					break;
				}
			}
			}

		}

		System.out.println("Sum of prime no in array is" + sum + "and count is " + cnt);

	}
}
