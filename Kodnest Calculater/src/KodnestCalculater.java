import java.util.Scanner;

public class KodnestCalculater {
Scanner scan = new Scanner(System.in);
public void addition()
{
System.out.println("User please Enter the num1 : ");
int num1=scan.nextInt();
System.out.println("User please Enter the num2: ");
int num2=scan.nextInt();
System.out.println("The addition result :"+(num1+num2));


}
void subtraction()
{
	System.out.println("User please Enter the num1 : ");
	int num1=scan.nextInt();
	System.out.println("User please Enter the num2: ");
	int num2=scan.nextInt();
	System.out.println("The Subtraction result :"+(num1-num2));
	
}
void multiplication()
{
	System.out.println("User please Enter the num1 : ");
	int num1=scan.nextInt();
	System.out.println("User please Enter the num2: ");
	int num2=scan.nextInt();
	System.out.println("The multiplication result :"+(num1*num2));
	
}
void division()
{
	System.out.println("User please Enter the num1 : ");
	int num1=scan.nextInt();
	System.out.println("User please Enter the num2: ");
	int num2=scan.nextInt();
	System.out.println("The division result :"+(num1/num2));
	
}
void findremainder()
{
	System.out.println("User please Enter the num1 : ");
	int num1=scan.nextInt();
	System.out.println("User please Enter the num2: ");
	int num2=scan.nextInt();
	System.out.println("The findremainder result :"+(num1%num2));
	
}
void findsquare()
{
	System.out.println("User please Enter the num1 : ");
	int num1=scan.nextInt();
	System.out.println("The findsquare result :"+(num1^num1));
	
	
}
}
