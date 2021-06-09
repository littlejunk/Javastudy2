package homework4;

public class Monkey {
     public static void main(String[] args) {
		 int peachNum = 1;
		 for(int i=0; i<9; i++) {
			 peachNum = (peachNum+1)*2;
		 }
		 System.out.println("第一天有"+peachNum+" 桃子");
	 }
}
