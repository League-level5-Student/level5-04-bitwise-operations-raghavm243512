package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		byte b = Byte.MAX_VALUE;
		short s = Short.MAX_VALUE;
		int i = 16;
		long l = Long.MAX_VALUE;
		printByteBinary(b);
		printShortBinary(s);
		printIntBinary(i);
		printLongBinary(l);
		
	}
	public static void printByteBinary(byte b) {
	for(int i =7;i>=0;i--) {
		System.out.print((b & (int)(Math.pow(2, i))) >> i);
	}
	System.out.println();
	
	}
	
	public static void printShortBinary(short s) {
		for(int i =15;i>=0;i--) {
			System.out.print((s & (int)(Math.pow(2, i))) >> i);
		}
		System.out.println();
	}
	
	public static void printIntBinary(int b) {
		for(int i =31;i>=0;i--) {
			System.out.print((b & (int)(Math.pow(2, i))) >> i);
		}
		System.out.println();
	}
	
	public static void printLongBinary(long l) {
		for(int i =63;i>=0;i--) {
			System.out.print((l & (int)(Math.pow(2, i))) >> i);
		}
		System.out.println();
	}
}
