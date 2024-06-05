class program2{

	public static void main(String args []) {

	String str1 = new String("Akshay");  //creating string using "New" objext of String Class
	String str2 = new String("Akshay");
	
	//HashCode of both strings are different as they get place on the heap of jvm
	//every object gets place o heap and with use of "new" every object get new Space
	System.out.println(System.identityHashCode(str1));
	
	System.out.println(System.identityHashCode(str2));
	}
}
