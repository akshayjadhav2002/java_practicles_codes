class program4{

	public static void main(String args []){

		
		int arr[] = { 2,3,5,6,89,20,56,71,};

		for(int i =0;i<arr.length;i++){
			
			if(arr[i]%2==0){

				arr[i] = 0;
			}
			else{
				arr[i] = 1;
			}

		}

		for(int i = 0;i<arr.length;i++){


			System.out.print(arr[i]);
		}

	}

}
