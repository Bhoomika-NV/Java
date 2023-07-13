import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature! : ");
		double temp = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.printf("%.2f\n",temperatureConverter.convertFahrenheitToCelsius(temp));
		scan.close();
		
		

	}

}
