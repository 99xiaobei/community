public class MethodTest01{
	public static void main(String[] arg){
		
		int a = 10,b = 20;
		int retValue = sumInt(a,b);
		
		System.out.println("retValue = " + retValue);
	}
	
	public static int sumInt(int i ,int j){
		int res = i + j;
		int num = 3;
		int retValue = divide(res,num);
		return retValue;
	}
	
	public static int divide(int x,int y){
		int z = x/y;
		return z;
	}
}