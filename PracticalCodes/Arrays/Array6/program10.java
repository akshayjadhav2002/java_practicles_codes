public class program10 {
    
    public static void main (String args []){
    int arr [] = { 56 , 15 , 8 , 26 , 7 , 50 ,54};
        for(int i = 0 ;i<=arr.length-1;i++){
            int min = i;
            for(int j = i;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }


}
