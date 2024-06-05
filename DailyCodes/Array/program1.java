import java.util.*;

class program1{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the row and column");

	int row  =  sc.nextInt();
	int column = sc.nextInt();

	int arr [] [] = new int [row] [column];

	for(int i =0;i<arr.length;i++){
		for(int j =0;j<arr.length;j++){
		arr[i] [j] = sc.nextInt();
		}
		
	}

	for(int i=0;i<arr.length;i++){
		for(int j = 0;j<arr.length;j++){
			System.out.print(arr[i][j]);
		}
		System.out.println();

	}
	System.out.println(arr); //gives address[[I@45f45fa1

	System.out.println(arr[1]); //gives address here we are in the second row but not in column so it gives addred					 //of the second row look it as building floor as we are in building floor we have a					//cces to all the rooms in this floor  
	System.out.println(arr[1][1]);

}
}
