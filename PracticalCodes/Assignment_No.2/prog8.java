class prog8{
	public static void main(String [] args){
		int marks = 66;

		if(marks>=85){
			System.out.println("passed with first class and distinction");

		}
		else if(marks>=75 && marks<85){
			System.out.println("Passed with First class");
		}
		else if(marks>65 && marks < 75 ){
			System.out.println("passed with Second class");

		}
		else if(marks >40 && marks <65){
			System.out.println("Third class");
		}
		else {

			System.out.println("Failed..");
		}
		
	}
}
