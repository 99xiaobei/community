public class OOTest01{
	public  static void main(String[] arg){
		int i = 10;
		User u = new User();
		
		System.out.println(u.userno);
		System.out.println(u.name);
		System.out.println(u.addr);
		
		u.userno = 110;
		u.name = "nizuzong";
		u.addr = new Address();
		
		u.addr.city = "Tianjin";
		u.addr.addr = "Machang Road 1 No";
		
		System.out.println(u.userno);
		System.out.println(u.addr.city);
		System.out.println(u.name);
	}
}