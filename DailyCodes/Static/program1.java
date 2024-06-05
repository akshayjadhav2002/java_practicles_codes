class program1{
	
	void methodFun(){
		System.out.println("In method Fun");
	}
	static void methodGun(){
		System.out.println("In method Gun");

	}

	public static void main(String [] args){
		System.out.println("In method main");
		methodGun();
		//methodFun();
		//non-static method methodFun() cannot be referenced from a static context
		//from static method we cant call the non static method as nonstatic method 
		//gets the memory when the object of class is created and static method gets 
		//memory when they are accessed on method area.

	}
}
