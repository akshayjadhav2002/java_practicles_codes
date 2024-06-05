import java.util.*;

class Arrays{
 
 	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);;

		int size = sc.nextInt();

		char arr [] = new char[size];

		for(int itr =0;itr<size;itr++){
			arr[itr] = sc.next().charAt(0);
		}
		for(int itr = 0;itr <size;itr++){

			System.out.print(arr[itr]);

		}
	}

}
