public class switchtest{
	public static void main(String[] arg){
	    java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("please put in numbers:");
		String weekday = s.nextInt();
		switch(weekday){
			case "Mon":
			    System.out.println("1");
				break;
			case 2:
			    System.out.println("Tues");
//				break;
			case 3:
			    System.out.println("Wen");
//				break;
			case 4:
			    System.out.println("Thur");
				break;
			case 5:
			    System.out.println("Fri");
				break;
			case 6:
			    System.out.println("Sat");
				break;
			case 7:
			    System.out.println("Sun");
				break;
			default:
			    System.out.println("Wrong numbers");
				break;	
		}
	}
}