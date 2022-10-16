
public class methods {
	public static int binaryToDecimal(String input) {
		int output = Integer.parseInt(input,2);
		return output;
	}
	
	public static String decimalToBinary(int input) {
		String output = Integer.toBinaryString(input);
		return output;	
	}
}
