public class ForTest03{
	public static void main(String[] arg){
		int i = 0,j = 0,count = 0;
		for(i = 2;i < 1000;i ++){
			boolean flag = true;
			for(j = 2; j <= Math.sqrt(i);j ++){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				count++;
				if(count % 8 != 0){
					System.out.print(i + " ");
				}
				else{
					System.out.println(i);
				}
			}
		}
		System.out.println(count);
	}
}