package method1shangji;

public class TestStudent {
	public static void main(String[] args) {
	   Student student = new Student("С��",88,98,77);
	   student.study();
	   System.out.println("ѧ��������"+student.getName());
	   System.out.println("java�ɼ���"+student.getJavaGrade());
	   System.out.println("�ܳɼ���"+student.getTotalGrade());
	   System.out.println("ƽ���ɼ���"+student.getAvgGrade());
	   
	}
}
