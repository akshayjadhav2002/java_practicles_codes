class program3 {

	public static void main(String args []) {

	String str1 = "Akshay";
	String str2 = "Tukaram";
	String str3 = new String("Jadhav");
	String str4 = str1+str2; //str4 will get memory at run time on heap
	String str5 =str3;       //It will point to the old string with same address
	str3 = str3+ "Akshay";   //It will also create new String on heap as we are concating string the old
				 //referecne to only "jadhav" is deleted and new String is created with new reference
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	System.out.println(str3);
	System.out.println(System.identityHashCode(str4)); //It will create new String on Heap 

	
	System.out.println(System.identityHashCode(str5));  
		
	String str6 = "Akshay";
	String str7 = "Akshay";
	System.out.println(str6);
	System.out.println(str7);
	str7 =str6 + "Jadhav";
	System.out.println(str6);
	System.out.println(str7);

	}
}
