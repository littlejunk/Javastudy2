package homework2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextOut {
	public static void main(String[] args) {
		creat();
	}
	
	public static void add(String s) {
		
	}
	
	public static void creat() {
		Scanner s = new Scanner(System.in);
		PrintWriter p = null;
		try {
		    p = new PrintWriter(new File("out.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("intput something end with end");
		String string;
		string = s.nextLine();
		while(!string.equals("end")) {
			p.println(string+"  ");
			string = s.nextLine();
		}
		if( p!= null) {
			p.print("end");
			p.close();
		}
	}
}
