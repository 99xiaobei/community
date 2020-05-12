public class ForTest02{
	public static void main(String[] arg){
		int i = 0,j = 0,res = 0;
		for(i = 1;i < 10;i ++){
			for(j = 1;j <= i; j ++){
				res = j * i;
				System.out.print(i + "*" + j + "=" + res + " ");
			}
			System.out.println();
		}
	}
}