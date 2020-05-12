public class ForTest{
	public static void main(String[] arg){
		int i = 1;
		int sum = 0;
		for(i = 1; i < 100; i = i + 2){
			sum = sum + i;
		}
		System.out.println(sum);
/*		System.out.println("----------");
		for(i = 10; i > 0; --i){
			System.out.println("------------>"+i);
		}
		System.out.println(i);
*/
	}
}