class program2 {
 	public static void main(String [] args){
	int arr1 [] [] = new int [][] {{10,20,30},{40,50,60}};
	

	//this is the concept of jagged array here the length of the column vary
	int arr2 [] [] = new int [][] {{110,120,130,140},{140,150,160}};

	int arry3 [] [] =new int [2] [];
	// arry3[0] [0] = 10; Cannot store to int array because "<local3>[0]" is null
	// this is beacuse here the array does not get memory and we are accessing the elements of it
	// so it gives Exceptipn nullpionter
	
	
 }

}
