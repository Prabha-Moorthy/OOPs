class Animal
{
	String Speak()
	{
		return "The animal says roar";
	}
}
class Dog extends Animal
{
	String Speak()
	{
		return "The Dog says woof";
	}
}
class Cat extends Animal
{
	String Speak()
	{
		return "The Cat says meow";
	}
}
class Animals
{
	public static void main(String args[])
	{
		Animal S;
		S=new Animal();
		System.out.println(S.Speak());
		S=new Dog();
		System.out.println(S.Speak());
		S=new Cat();
		System.out.println(S.Speak());
	}
}
