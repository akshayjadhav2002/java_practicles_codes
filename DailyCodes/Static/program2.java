class program2{
	void methodGun(){
	System.out.println("In method Gun");
	}
	
	static void methodFun(){
	System.out.println("In method Fun");
	}
	public static void main (String [] args){
		program2 obj = new program2();
		obj.methodGun();
		//we can call the static method on object because of the 
		//pointer to special structure that points to the special 
		//structure in side the metaspace
		obj.methodFun();
	}
}
