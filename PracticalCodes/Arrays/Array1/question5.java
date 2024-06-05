import java.util.*;

class Arrays {

	public static void main(String [] args){
	
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int arr [] = new int [size];

		for(int itr = 0;itr <size;itr++){

		arr[itr] = sc.nextInt();	

		}
		for(int itr = 0;itr<size;itr++){
			if(itr%2!=0){
			System.out.println(arr[itr]);

			}
		
		}

	}

}
