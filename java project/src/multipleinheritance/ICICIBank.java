package multipleinheritance;

public class ICICIBank extends Bank {


 public void getinterestrste() {
	System .out.println("interest rate is 5%");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ICICIBank i=new ICICIBank();
i.getcarloanrate();
i.gethomeloanrate();
i.getinterestrate();
	}



}
