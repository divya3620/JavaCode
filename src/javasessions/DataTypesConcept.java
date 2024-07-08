package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {

		
		//data types:
		
		//1. primitive data types: it takes the space in the memory - without object
		
		//boolean type: true/false
		//Numeric Type: 
				//a. character type: char
				//b. Integral Value:
						//b.1: Integer: byte, short, int, long
						//b.2: Floating-point: float, double
		
		//2. non primitive data types: with Object. Array, String, Classes, Interface -- OOP
		
		
		//1. byte: 
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b=10;
		b=50;
		byte n= -120;
		byte o=16;
		
		
		System.out.println(b);
		System.out.println(n);
		System.out.println(o);
		
		
		//2. short:
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767
		short s = 234;
		short s1 = 1;
		System.out.println(s);
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647 ==> -2^31 to 2^31-1
		int i = 2300;
		int j = 909998;
		int k = 0;
		int m=38390040;
		//int p = 100.12;
		System.out.println(m);
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//-2^63 to 2^63-1
		
		long num = 121212121;
		long distance = 989898765456l;
		long phone = 2345678919L;//Not recommended
		long aadharNo=3953164499L;
		System.out.println(aadharNo);
		
		System.out.println(distance);
		
		//BigInteger
		
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after . it can take upto 7 digits
		float f1 = 12.33f;
		float n4= 33333.334834492f;
		System.out.println(n4);
		float f2 = (float)34.44;
		float m3=(float)99.098868;
		System.out.println(m3);
		float f3 = 100; //100.00
		System.out.println(f1);
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after . it can take upto 15 digits
		double d = 12.333;
		double d1 = 1.1;
		double h8=5790078900.99876765444;
		System.out.println(h8);
		
		//BigDecimal
		
		
		//7. char:
		//size: 2 bytes = 16 bits
		char c1 = 'a'; //a-z , A-Z
		char c3 = 'A';
		char c4 = 'H';
		char c2 = '1'; //0-9
		char c5 = '$';
		char c6 = '*';
		char c0='D';
		
		System.out.println(c1);
		System.out.println(c5);

		//0-9
		//a-z
		//A-Z
		//all special chars
		
		//8. boolean:true/false
		//size: ~ 1 bit
		boolean flag = true;
		boolean test = false;
		System.out.println(flag);
		
		
		System.out.println(100);
		int pop = 1000;
		System.out.println(pop);				
		
	}

}
