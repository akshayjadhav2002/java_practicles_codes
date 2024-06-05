import java.util.*;

class Arrays {
	public static void main(String [] args){


		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char array[] = new char [size];
		for(int iter = 0; iter<size;iter++){
		
			array[iter] = sc.next().charAt(0);

		}
		for(int iter = 0;iter<size;iter++){

		if(array[iter] == 'a'||array[iter]=='e'||array[iter]=='i'||array[iter]=='o'||array[iter]=='u'){
			
			System.out.println("Vowel"+ array[iter] +"found at index" + iter);
		}
		}
		

	}

}
