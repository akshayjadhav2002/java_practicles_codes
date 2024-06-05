class program4{

	public static void main(String args []){

		
		int arr[] = { 2,3,5,6,89,20,56,71,};

		for(int i =0;i<arr.length;i++){
			
			if(arr[i]<0){

				arr[i] = arr[i]*arr[i];
			}
			
				

		}

		for(int i = 0;i<arr.length;i++){


			System.out.print(arr[i] + " ");
		}

	}

}
