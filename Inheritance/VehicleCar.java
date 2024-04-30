class Vehicle
{
	public String make;
	public String model;
	public int year;
	
	public Vehicle(String make,String model,int year)//Vehicle class constructor
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
}
class Car extends Vehicle
{
	private String colour;
	private int numDoors;
	
	public Car(String make,String model,int year,String colour,int numDoors)
	{
		super(make,model,year);//call Vehicle class constructor 
		this.colour=colour;
		this.numDoors=numDoors;
	}
	public String getColour()
	{
		return colour;
	}
	public int getNumDoors()
	{
		return numDoors;
	}
}
class VehicleCar
{
	public static void main(String agrs[])
	{
		Car c=new Car("TATA","Manza",2012,"Red",4);
		System.out.println("Make: "+c.getMake());
		System.out.println("Model: "+c.getModel());
		System.out.println("Year: "+c.getYear());
		System.out.println("Colour: "+c.getColour());
		System.out.println("Number of Doors: "+c.getNumDoors());
	}
}	
