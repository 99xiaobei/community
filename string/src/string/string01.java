package string;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = new String("abc");
		String[] ins = {"sport","music","food","sleep"};
		String temp = null;
		for(int i = 0;i < ins.length;i ++){
			temp += ins[i] + "," ;
		}
		System.out.println(temp);
	}

}
