public class program8 {
    public static void main (String args [] ){

        char arr [] = { 'A' , 'B' , 'c','D', 'E', 'F', 'G','H','I','J'};


        System.out.println("Before reverse");
        for(int i =0 ; i<arr.length-1;i+=2){
            System.out.println(arr[i] );
        }


        int first  = 0;
        int last  = arr.length-1;
        while (first<=last) {
            char temp = arr[first];
            arr[first]= arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("After reverser");
        for(int i =0;i<arr.length-1;i+=2){
            System.out.print(arr[i] + " ");

        }
    }
}
