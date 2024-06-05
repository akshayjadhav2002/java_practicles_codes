class program5{
	

	public static void main( String args [] ){

		
		int arr1 [] = { 5 ,10, 15, 20 , 25, 30 , 35};
		int arr2 []= { 4 , 8 ,12 ,16 , 20 };

		int n = arr1.length + arr2.length;
		int arr3[] = new int [ n];
		for(int i =0; i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i = 0;i<arr2.length;i++){
			arr3[i+arr1.length]=arr2[i];
		}
		
		for(int i = 0;i<arr3.length;i++){

			System.out.print(arr3[i] + " " );
		}
	}

}
