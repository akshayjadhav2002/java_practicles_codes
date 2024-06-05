package Arrays.Array4;
import java.util.*;
public class program1 {
    
    public static void main(String args []){

        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr [] = new int [n];
       System.out.println("enter array elements"); 
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int avg = 0;
        for(int i =0;i<n;i++){
            avg = avg+arr[i];
        }

        avg = avg/n;

        System.out.println(avg);


    }
}
