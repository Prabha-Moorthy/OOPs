class Animal
{
	public String name;
	public int age;
	public String species;
	
	public Animal(String name,int age,String species)
	{
		this.name=name;
		this.age=age;
		this.species=species;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getSpecies()
	{
		return species;
	}
}
class Cat extends Animal
{
	private String colour;
	private int numLives;
	
	public Cat(String name,int age,String species,String colour,int numLives)
	{
		super(name,age,species);		
		this.colour=colour;
		this.numLives=numLives;
	}
	public String getColour()
	{
		return colour;
	}
	public int getNumLives()
	{
		return numLives;
	}
}
class AnimalCat
{
	public static void main(String agrs[])
	{
		Cat c=new Cat("Tom",5,"Persian","Golgen",18);
		System.out.println("Name: "+c.getName());
		System.out.println("Age: "+c.getAge());
		System.out.println("Species: "+c.getSpecies());
		System.out.println("Colour: "+c.getColour());
		System.out.println("Number of Lives: "+c.getNumLives());
	}
}	
