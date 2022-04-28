package com.lessayer.entity;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class DogShelter {
	
	private List<Dog> dogRoster;
	
	public DogShelter() {
		dogRoster = Dog.createRoster();
	}

	public List<Dog> getDogRoster() {
		return dogRoster;
	}

	public void setDogRoster(List<Dog> dogRoster) {
		this.dogRoster = dogRoster;
	}
	
	/* Remove the adopted dog in the dog roster.
	 * Remember to print the adopt list. */
	public void adoptDog(Dog dog, Consumer<Dog> adoptMethod) {
		adoptMethod.accept(dog);
	}
	
	/* Every time a dog is rescued, the shelter would extend the dog roster.
	 * One dog will be first diagnosed by the veterinary and thus the status of
	 * the dog is UNDERDIAGNOSIS.*/
	public void rescueDog(Supplier<Dog> rescueMethod) {
		dogRoster.add(rescueMethod.get());
	}
	
	public void printRoster() {
		for (Dog dog : dogRoster) {
			dog.printDog();
		}
	}
	
}
