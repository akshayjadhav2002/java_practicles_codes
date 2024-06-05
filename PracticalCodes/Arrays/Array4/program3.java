package Arrays.Array4;

public class program3 {
    
    public static void main (String args []){
        int arr [ ] = {1,5,7,3,9};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

            if(arr[i]>max){
                max = arr[i];
            }
        }

        int secLargest = 0;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>min && arr[i]<max && secLargest<arr[i]){
                secLargest = arr[i];
            }
        }

        System.out.println(secLargest);
    }
}
