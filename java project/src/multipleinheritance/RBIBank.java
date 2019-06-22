package multipleinheritance;

public class RBIBank extends Bank{
public void interestrate() {
	System.out.println("interest rate is 1%");
	
}
public void carinterestrate() {
	System.out.println("car interest rate is 2%");
	
}
public void homeinterestrate() {
	System.out.println("home interest rate is 3%");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBIBank r=new RBIBank();
		r.interestrate();
		r.homeinterestrate();
		r.carinterestrate();
	}

}
