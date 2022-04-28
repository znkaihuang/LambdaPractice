package com.lessayer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.lessayer.entity.Dog;
import com.lessayer.entity.Dog.Size;
import com.lessayer.entity.DogShelter;

public class RosterMyTest {
	
	public static void main(String... args) {
		
		DogShelter dogShelter = new DogShelter();
		
		System.out.println("Roster");
		System.out.println("=================================");
		dogShelter.printRoster();
		System.out.println("=================================\n");
		
		System.out.println("Medium Dog List");
		System.out.println("=================================");
		DogFilter.searchDog(/* Write your code here! */);
		System.out.println("=================================\n");
		
		// A dog named BUDDY is adopted. Every dog's name is unique in the shelter.
		System.out.println("BUDDY is adopted by a gentle woman.");
		dogShelter.adoptDog(/* Write your code here! */);
		
		// We rescued a 6-year-old Medium dog. We name him "LUCKY".
		System.out.println("We rescued a dog and decide to call him \"LUCKY\".");
		dogShelter.rescueDog(/* Write your code here! */);
		
		System.out.println("\nRoster");
		System.out.println("=================================");
		dogShelter.printRoster();
		System.out.println("=================================\n");
		
		// Lucky becomes a police dog afterwards.
		System.out.println("LUCKY becomes a police dog afterwards.");
		DogTrainer<WorkingDog> dogTrainer = new DogTrainer<WorkingDog>();
		WorkingDog policeDog = dogTrainer.train(/* Write your code here! */);
		policeDog.printDog();
		
		System.out.println("\nRoster");
		System.out.println("=================================");
		dogShelter.printRoster();
		System.out.println("=================================\n");
	}
	

	
}

class DogTrainer <T extends Dog> {
	/* Need to remvoe the dog from the dog shelter since it no longer lives in the shelter now! 
	 * We make sure every dog is healthy before leaving our shelter.*/
	public T train(Dog dog, Function<Dog, T> trainMethod) {
		dog.setStatus(Dog.Status.HEALTHY);
		return trainMethod.apply(dog);
	}
}

class DogFilter {
	
	public static List<Dog> searchDog(List<Dog> dogRoster,Predicate<Dog> searchCondition) {
		List<Dog> returnList = new ArrayList<>();
		
		for (Dog dog : dogRoster) {
			if (searchCondition.test(dog)) returnList.add(dog);
		}
		
		return returnList;
	}
	
}

class WorkingDog extends Dog {
	
	public String job;
	
	public WorkingDog(String name, Integer age, Size size, Status status, String job) {
		super(name, age, size, status);
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	@Override
	public void printDog() {
		System.out.println(name + ", " + age + ", " + size.toString() + ", " + status.toString() + ", " + job);
	}
	
}