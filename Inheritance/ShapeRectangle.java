abstract class Shape
{
	public int numSides;
	public int area;
	
	public Shape(int numSides)
	{
		this.numSides=numSides;
	}
	public int getNumSides()
	{
		return numSides;
	}
	public int getArea()
	{
		return area;
	}
	public abstract void calculateArea();
}
class Rectangle extends Shape
{
	private int length;
	private int width;
	
	public Rectangle(int length,int width)
	{
		super(4); 
		this.length=length;
		this.width=width;
	}
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public void calculateArea()
	{
		area=length*width;
	}
}
class ShapeRectangle
{
	public static void main(String agrs[])
	{
		Rectangle r=new Rectangle(3,4);
		r.calculateArea();
		System.out.println("Number of Sides: "+r.getNumSides());
		System.out.println("Area: "+r.getArea());
		System.out.println("Length: "+r.getLength());
		System.out.println("Width: "+r.getWidth());
	}
}	
