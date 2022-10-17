
public class Methods {
	public static int binaryToDecimal(String input) {
		try
		{
			int output = Integer.parseInt(input,2);
			return output;
		} 
		catch(NumberFormatException nume)
		{
			System.out.println("You got to enter a number");
			return 1;
		}
	}
	
	public static String decimalToBinary(int input) {
		String output = Integer.toBinaryString(input);
		return output;	
	}
}
