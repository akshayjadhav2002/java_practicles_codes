import java.util.*;

class program{

	public static void main(String args [] ){
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
			int arr [] = new int [size];
		System.out.println("Enter elements of array");
		
		for(int i = 0;i<size;i++){

		
			arr[i] = sc.nextInt();

		}
		int descFlag = 0;
		for(int i = 0;i<size-1;i++){
			
			if(arr[i]<arr[i+1]){

				descFlag = 1;
			}
			else{
				descFlag = 0;
				break;

			}

		}

			if(descFlag==1){

				System.out.println("The array is in descending order");
			}
			else{
				System.out.println("the array is not in ascending order");
		}

	}

}
