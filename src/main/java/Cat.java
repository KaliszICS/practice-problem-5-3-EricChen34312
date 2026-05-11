abstract class Animal{
	protected String name;
	protected int age;
	protected String type;
	protected int position;

	public Animal(String name, int age, String type, int position){
		this.name = name;
		this.age = age;
		this.type = type;
		this.position = position;
	}

	public abstract String animalSound();

	public abstract void move();

	public String sleep(){
		return "Zzz";
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getType(){
		return this.type;
	}

	public int getPosition(){
		return this.position;
	}
}

class Cat extends Animal{

	public Cat(String name, int age, String type, int position){
		super(name, age, type, position);
	}

	public String animalSound(){
		return "Meow";
	}

	public void move(){
		this.position += 5;
	}
}

class Bird extends Animal{
	public Bird(String name, int age, String type, int position){
		super(name, age, type, position);
	}

	public String animalSound(){
		return "Chirp";
	}

	public void move(){
		this.position += 50;
	}
}

class Bear extends Animal{
	public Bear(String name, int age, String type, int position){
		super(name, age, type, position);
	}

	public String animalSound(){
		return "Roar";
	}

	public void move(){
		this.position += 1;
	}
}