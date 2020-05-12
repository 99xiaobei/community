public class switchtest01{
	public static void main(String[] arg){
		char c = 'D';
		switch(c){
			case'A':
				System.out.println("High");
				break;
			case'B':
				System.out.println("Mid");
				break;
			case'C':
				System.out.println("Low");
				break;
			default:
			    System.out.println("Wrong words");
				break;
		}
	}
}