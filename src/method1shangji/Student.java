package method1shangji;

public class Student {
    
	private String name;
	
	private int javaGrade;
     
    private int csGrade; 
    
    private int sqlGrade;
    
    
    
    public Student(String name, int javaGrade, int csGrade, int sqlGrade) {
		super();
		this.name = name;
		this.javaGrade = javaGrade;
		this.csGrade = csGrade;
		this.sqlGrade = sqlGrade;
	}

	public void study() {
    	System.out.println("学生在学习");
    }

	public String getName() {
		return name;
	}

	public int getJavaGrade() {
		return javaGrade;
	}
    
	public int getTotalGrade() {
		return javaGrade+csGrade+sqlGrade;
	}
	
	public double getAvgGrade() {
		return getTotalGrade()/3.0;
	}
    
}
