import java.util.Scanner;

public class program6 {
    public static void main(String args []){

        Scanner sc  = new Scanner(System.in);

            System.out.println("Enter the key of Array");
            int key = sc.nextInt();

            int arr [] = { 5,10,16,20,25,30,35,4,8,112,16,20};

            for(int i = 0;i<arr.length;i++){
                if(arr[i]%key==0){
                    System.out.println("An element found at index" + i );
                }
            }

            

    }
}
