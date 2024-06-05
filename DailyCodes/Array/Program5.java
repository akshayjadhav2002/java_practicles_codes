class program5 {

	public static void main(String [] args){

	int [] arr[] = new int [] [] {{1,2,3}};
	arr[1] = new int [5];
	//once we declare an initialize array
	//it has got memory on heap so again we cant assign it
	//
	System.out.println(arr[1][0]);

	}

}
