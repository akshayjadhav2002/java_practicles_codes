class program1{
	
	public static void main(String [] args){

	String str = "Akshay";
	String str1 = "Akshay"; //It is String Literal

	///Hashcode of both string are same means it goes in String Constant pool
	//SCP is special Area reserved on Method area of JVM where all String literal gets space
	System.out.println(System.identityHashCode(str));
	System.out.println(System.identityHashCode(str1));

	}

}
