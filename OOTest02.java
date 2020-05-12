public class OOTest02{
	public  static void main(String[] arg){
		husband huang = new husband();
		huang.name = "Tony";
		
		wife yang = new wife();
		yang.name = "Amy";
		
		huang.w = yang;
		yang.h = huang;
		
		System.out.println(huang.name);
		System.out.println(yang.name);
		System.out.println(huang.w.name);
		System.out.println(yang.h.name);
	}
}