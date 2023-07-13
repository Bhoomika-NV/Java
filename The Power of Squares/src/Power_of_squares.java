import java.util.Scanner;

public class Power_of_squares {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to be squared");
	int num =scan.nextInt();
	System.out.println(squareNumber(num));
	scan.close();
	
}
public static int squareNumber(int num)
{
	return num*num;
}
}
