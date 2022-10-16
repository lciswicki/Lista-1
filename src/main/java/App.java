
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String input, inputLetter;
		int output;
		EnumClass.InputType type = EnumClass.InputType.NULL;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Specify input type:");
		System.out.println("type 'b' for binary");
		System.out.println("type 'd' for decimal");
		inputLetter = scanner.nextLine();
		
		if(inputLetter.equals("b")) {
			type = EnumClass.InputType.BINARY;
		}
		else if(inputLetter.equals("d")) {
			type = EnumClass.InputType.DECIMAL;
		}
		
		System.out.println("Input a number");
		input = scanner.nextLine();
		
		if(type == EnumClass.InputType.BINARY) {
			System.out.println("Your number in decimal:");
			System.out.println(methods.binaryToDecimal(input));
			
		};
		if(type == EnumClass.InputType.DECIMAL) {
			System.out.println("Your number in binary:");
			System.out.println(methods.decimalToBinary(Integer.parseInt(input)));
			
		};
	}
}
