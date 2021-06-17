package method1shangji;

public class TestStudent {
	public static void main(String[] args) {
	   Student student = new Student("小明",88,98,77);
	   student.study();
	   System.out.println("学生姓名："+student.getName());
	   System.out.println("java成绩："+student.getJavaGrade());
	   System.out.println("总成绩："+student.getTotalGrade());
	   System.out.println("平均成绩："+student.getAvgGrade());
	   
	}
}
