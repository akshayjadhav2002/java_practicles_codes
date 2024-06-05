import java.util.*;

class program2{


	public static void main(String args [] ){

		Scanner sc = new Scanner(System.in);

		int ele = sc.nextInt();

		int arr[] = {1,5,9,8,7,6};
		int flag = 0;
		for(int i =0;i<arr.length;i++){
			
			if(arr[i] == ele){
				flag = 1;
				System.out.println("Number" + ele + "occured at index" + i);
				break;
			}
		 
			
		}

			if(flag==0){
				System.out.println("Number "+ ele + " Not found in array" );
			}
			 
			
		
	}

}
