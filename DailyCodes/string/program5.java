class program5{
    public static void main(String args []){
        String str = "akshay";
        char arr []  = str.toCharArray(); 
        for(int i =0;i<arr.length;i++){
            if(arr[i]=='a'){
                arr[i] = 'e';
                
            }

        }
        System.out.println(arr);

    }
}