class prog7{
	public static void main(String [] args){
		int cost = 500;
		int selling = 700;

		if(selling>cost){
			System.out.println("Profit of " + (selling - cost));

		}
		else if(selling<cost){
			System.out.println("loss of " + (selling - cost));
		}
		else{
			System.out.println("NO profit no loss");

		}
	}
}
