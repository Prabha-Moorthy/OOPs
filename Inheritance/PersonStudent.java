class Person
{
	public String name;
	public int age ;
	public String address;
	
	public Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getAddress()
	{
		return address;
	}
}
class Student extends Person
{
	private char grade;
	private String school;
	
	public Student(String name,int age,String address,char grade,String school)
	{
		super(name,age,address);
		this.grade=grade;
		this.school=school;
	}
	public char getGrade()
	{
		return grade;
	}
	public String getSchool()
	{
		return school;
	}
}
class PersonStudent
{
	public static void main(String agrs[])
	{
		Student s=new Student("Prabha",24,"109,Keelapatti Last,Srivilliputtur",'A',"Sacred Heart Girls Hr.Sec.School");
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
		System.out.println("Address: "+s.getAddress());
		System.out.println("Grade: "+s.getGrade());
		System.out.println("School: "+s.getSchool());
	}
}	
