public class Student
{
	public static void main(String args[])
	{
		Student1 s=new Student1();
		s.setStudentName("Manoj");
		s.setAge(28);
		s.setGrade('A');
		System.out.println(s.getStudentName());
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
	}
}

class Student1
{
	private String StudentName;
	private int age;
	private char grade;
	
	public String getStudentName()
	{
		return StudentName;
	}
	public void setStudentName(String StudentName)
	{
		this.StudentName=StudentName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public char getGrade()
	{
		return grade;
	
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
}
