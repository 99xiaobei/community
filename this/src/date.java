
public class date {
	private int year;
	private int month;
	private int day;
	
	public date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public date(){
		this.day = 1;
		this.month = 1;
		this.year = 1970;
	}
	
	public void print(){
		System.out.println(this.year + "-" + this.month + "-" + this.day);
	}
}
