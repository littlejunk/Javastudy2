

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		int num, temp;
		int[] array = new int[4];
		System.out.println("���������ǰ��λ��");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		//ÿ��λ����5ȡ��
		for(int i = 0; i < 4; i ++) {
			array[3-i] = num %10;
			num /= 10;
			array[3-i] += 5;
			if(array[3-i] >= 10) {
				array[3-i] -= 10;
			}
		}
		//��������
        temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        System.out.print("���ܺ�");
        for(int i = 0; i < 4; i ++) {
        	System.out.print(array[i]);
        }
       

	}
}
