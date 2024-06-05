import java.util.*;
class Arrays {


	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
			
		int size = sc.nextInt();
			int arr[] = new int [size]; 
		for(int iter = 0; iter<arr.length; iter++){

			arr[iter] = sc.nextInt();

		}
		int min = Integer.MAX_VALUE;

		for(int iter = 0; iter <size;iter++){
		
			if(arr[iter]<min){
				min = arr[iter];
			}
		
		
		}
		System.out.println("Min value in Array is " + min );
	


	}

}
