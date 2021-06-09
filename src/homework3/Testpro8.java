package homework3;


import java.util.Scanner;

public class Testpro8 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("输入你的选择");
    	int type=sc.nextInt();
    	if(type==1){
    		System.out.println("咖啡  好苦");
    	}else if(type==2){
    		System.out.println("果汁  好甜");
    	}else if(type==3){
    		System.out.println("啤酒  喝醉了");
    	}else{
    		System.out.println("没有");
    	}
    }
}
