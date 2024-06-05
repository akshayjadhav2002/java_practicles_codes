import java.util.Scanner;

public class program7 {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr [] = new int [size];
        // for(int i =0;i<size;i++){
        //     arr [i] = sc.nextInt();
        // }

        for(int i =0;i<arr.length;i++){
            int inpt = sc.nextInt();

            if(inpt>65 && inpt<97){
                arr[i]=(char) inpt;
            }
            else{
                arr[i]= inpt;
            }
        }
        for(int i = 0; i<arr.length;i++){
            
            if(arr[i]>=65 && arr[i]<=97){
                System.out.print((char)arr[i]);  
            }
            else{
                System.out.print(arr[i]);
            }
        }
    }
}
