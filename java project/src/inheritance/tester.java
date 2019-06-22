package inheritance;

public class tester extends employeeclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tester t=new tester();
		t.getsalary();
		
	}


public void getsalary(){
	tester t=new tester();

	t.salary=1000;

	int bonus=2000;
	System.out.println("salary of a testeris:"+(t.salary+bonus));
		
}	
}