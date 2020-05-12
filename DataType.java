public class DataType{
	public static void main(String[] arg){
		int a = 10;
		int b = 010;
		int c = 0x10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a+b+c);
		
		int i = 123;
		System.out.println(i);
		
		long x = 456;
		System.out.println(x);
		
		long y = 2147483648;
		System.out.println(y);
		
		long z = 2147483648L;
		System.out.println(z);
	}
}