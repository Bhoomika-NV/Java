import java.util.Scanner;

public class SecretMessageDecoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char: ");
		char ch =scan.next().charAt(0);
		MessageDecoder messagedecoder = new MessageDecoder();
        System.out.println(messagedecoder.decodeCharacter(ch));
        scan.close();
	} 
	

}
