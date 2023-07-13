import java.util.Scanner;
public class JCA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed=scan.nextInt();
		double time= scan.nextDouble();
		JC jc =new JC();
		System.out.println(jc.calculateDistance(speed,time));
		scan.close();
		
	}

}
