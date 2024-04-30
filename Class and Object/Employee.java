import java.util.Scanner;
public class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Detials E=new Detials();
		System.out.println("Enter the name of Employee: ");
		E.setName(sc.next());
		System.out.println("Enter the Salary of Emplpyee: ");
		E.setSalary(sc.nextInt());
		System.out.println("Enter the HireDate of Emplyee: ");
		E.setHireDate(sc.next());
		System.out.println(E.getName());
		System.out.println(E.getSalary());
		System.out.println(E.getHireDate());
	}
}

class Detials
{
	private String Name;
	private int Salary;
	private String HireDate;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public int getSalary()
	{
		return Salary;
	}
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public String getHireDate()
	{
		return HireDate;
	}
	public void setHireDate(String HireDate)
	{
		this.HireDate=HireDate;
	}
}
