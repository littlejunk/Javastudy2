package method1kehou;

public class Date {
     
	private int year;
	
	private int month;
	
	private int day;
	
	public Date(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return year+"Äê"+month+"ÔÂ"+day+"ÈÕ";
	}
	
	public int getDaysofThisMoth() {
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0){
			if(month == 2) {
				return 29;
			}else if(month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12) {
				return 31;
			}else {
			          return 30;
		          }
	    }else {
	    	if(month == 2) {
				return 28;
			}else if(month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12) {
				return 31;
			}else {
			         return 30;
		          }
		}
	}
}
