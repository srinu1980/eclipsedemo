
public class AppMain {

	public static void main(String[] args) {


		
		Calculator c=new Calculator();
		
		int addResult=c.addition(10, 10);
		System.out.println("Addition is  "+addResult);
		
		
		int subResult=c.subtraction(30, 5);
		System.out.println("Subtraction is  "+subResult);
		
		
		
		int mulResult=c.multiplication(6, 8);
		System.out.println("Multiplication is  "+mulResult);
		
		
		
	}

}
