public class variableexample {

	int a=10;
	static int b=20;
	public void display()
	{
		
		int a=10;
		int b=20;
	
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		variableexample v=new variableexample();
		System.out.println(v.a);
		v.display();
		variableexample v1=new variableexample();
		v1.display();
		
	}

}
