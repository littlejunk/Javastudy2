package method1shangji;

public class Computer {
     
	public boolean isEven(int number) {
    	 return number%2==0;
     }
	
	public boolean isLeap(int years) {
		return (years%4==0 && years%100!=0)||(years%400==0);
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int multi(int a,int b) {
		return a*b;
	}
	
	public int max(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public int[] getArray() {
		int[] array = new int[10];
		for(int i=0; i<10;i++) {
			array[i] = (int)(Math.random()*10);
		}
		return array;
	}
}
