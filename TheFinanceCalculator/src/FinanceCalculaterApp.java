import java.util.Scanner;

public class FinanceCalculaterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculater financialcalculater=new FinanceCalculater();
	System.out.printf("%.2f",financialcalculater.calculateSimpleInterest(principal,rate,time));
		
		

	}

}
