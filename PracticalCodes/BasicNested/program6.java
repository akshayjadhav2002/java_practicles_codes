import java.util.*;

class program6{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		int num = 1;
		char ch = 'A';

		for(int i=1;i<=row;i++){
			for(int j =1;j<=row;j++){
			System.out.print(num);
			System.out.print(ch + " ");
			ch++;
			num++;
			}
			num =1;
			ch='A';
			System.out.println();
		}
	}
}