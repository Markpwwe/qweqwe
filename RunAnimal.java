import java.util.*;

public class RunAnimal{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String a = sc.nextLine();
		
		if (a.equalsIgnoreCase("B")){
		
	Bird b = new Bird();
	b.eat();
	b.sleep();
	b.makesound();
	}
	else if (a.equalsIgnoreCase("C")){
		Cat c = new Cat();
	
	c.eat();
	c.sleep();
	c.makesound();
	}
	else if (a.equalsIgnoreCase("D")){
		Dog d = new Dog();
	
	d.eat();
	d.sleep();
	d.makesound();
	}

	}
	}

	