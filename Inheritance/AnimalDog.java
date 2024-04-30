class Animal
{
	public String name;
	public int age;
	public String species;
	
	public Animal(String name,int age,String species)//Animal class constructor
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
class Dog extends Animal
{
	private String breed;
	private String colour;
	
	public Dog(String name,int age,String species,String breed,String colour)
	{
		super(name,age,species);//call Animal class constructor 
		this.breed=breed;
		this.colour=colour;
	}
	public String getBreed()
	{
		return breed;
	}
	public String getColour()
	{
		return colour;
	}
}
class AnimalDog
{
	public static void main(String agrs[])
	{
		Dog d=new Dog("Tommy",5,"Canis lupus Familiaris","Golgen Retriever","Golden");
		System.out.println("Name: "+d.getName());
		System.out.println("Age: "+d.getAge());
		System.out.println("Species: "+d.getSpecies());
		System.out.println("Breed: "+d.getBreed());
		System.out.println("Colour: "+d.getColour());
	}
}	
