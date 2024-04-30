class Shape
{
	String draw()
	{
		return "Drawing a Shape";
	}
}
class Rectangle extends Shape
{
	String draw()
	{
		return "Drawing a Rectangle";
	}
}
class Circle extends Shape
{
	String draw()
	{
		return "Drawing a Circle";
	}
}
class Shapes
{
	public static void main(String args[])
	{
		Shape s;
		s=new Shape();
		System.out.println(s.draw());
		s=new Rectangle();
		System.out.println(s.draw());
		s=new Circle();
		System.out.println(s.draw());
	}
}
