
public class thisuse {

	public static void main(String[] args) {
		thisuse.doSome();
		doSome();
		thisuse u = new thisuse();
		u.doOther();
	}
	public void doOther(){//ÊµÀý·½·¨
		System.out.println("do other things!");
		
	}
	public static void doSome(){
		System.out.println("do some!");
		
	}

}
