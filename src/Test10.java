

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		int num, temp;
		int[] array = new int[4];
		System.out.println("请输入加密前四位数");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		//每个位数加5取余
		for(int i = 0; i < 4; i ++) {
			array[3-i] = num %10;
			num /= 10;
			array[3-i] += 5;
			if(array[3-i] >= 10) {
				array[3-i] -= 10;
			}
		}
		//交换次序
        temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        System.out.print("加密后：");
        for(int i = 0; i < 4; i ++) {
        	System.out.print(array[i]);
        }
       

	}
}
