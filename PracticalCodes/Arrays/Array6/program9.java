public class program9 {
    public static void main (String args []){
        int arr []= { 121, 1, 58 , 333, 616,9};
        int cnt =0;
        for(int i = 0 ;i<arr.length;i++){
            
           if(isPlindrome(arr[i])){
                cnt++;
           }

        }
        System.out.println(cnt);
    }

    public static boolean isPlindrome(int num){
        int number = num;
        int newnum =0;
        while (number>0) {
            int digit  = number%10;
            newnum =(newnum*10)+digit;
            number = number/10;
        }
        if(newnum == num){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
