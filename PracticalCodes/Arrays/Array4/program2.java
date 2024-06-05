package Arrays.Array4;

public class program2 {

    public static void main (String args []){

    int [] arr = {3,6,9,8,10};

    int min = Integer.MAX_VALUE ;
    int max = Integer.MIN_VALUE;

    for(int i =0;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
    }

    System.out.println(max - min);
    }
}
