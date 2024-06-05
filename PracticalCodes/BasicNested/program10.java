import java.util.*;

class program10{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	
	for(int i=1;i<=row;i++){
		int num =i;
		for(int j=1;j<=row;j++){
		System.out.print(num + " ");
		num++;	
		}
		
		System.out.println("");
	}

	}

}
