import java.util.Scanner;

public class KodnestCalculaterApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	KodnestCalculater calci = new KodnestCalculater();
	while(true)
	{
	System.out.println("Welcome to kodnest calculater..........");
	System.out.println("+---------------------->addition");
	System.out.println("- ---------------------->Subtrcation");
	System.out.println("*---------------------->Multiplication");
	System.out.println("/---------------------->Division");
	System.out.println("%---------------------->Find the reaminder");
	System.out.println("^---------------------->power");
	System.out.println("!---------------------->to exit");
	System.out.println("Enter anyone operations mentioned above: ");
	
	
	char ch =scan.next().charAt(0);
	
	switch (ch)
	{
	
	case '+':
		
		calci.addition();
		break;
	case '-':
		calci.subtraction();
		break;
	case '*':
		calci.multiplication();
		break;
	case '/':
		calci.division();
		break;
	case '%':
		calci.findremainder();
		break;
	case '^':
		calci.findsquare();
		break;
	default:
		System.out.println("Please enter the valid charecter");
		break;
	}
		
}
}
}