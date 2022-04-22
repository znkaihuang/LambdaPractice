package com.lessayer.entity.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lessayer.entity.Person;

public class RosterMyTest {
	
	public static void main(String... args) {
		
		List<Person> roster = Person.createRoster();
		Person person = roster.get(0);
		
		String[][] fieldAndMethodNames = {
				// Expected field names
				{"name", "gender", "birthday", "emailAddress"},
				// Expected method names
				{"getAge", "getGender", "getBirthday"}};
		EntitySanityCheck.entitySanityCheck(person, fieldAndMethodNames);
		
		System.out.println("==========================================");
		System.out.println("Person detail table");
		System.out.println("==========================================");
		roster.forEach(Person::printPerson);
		
		PersonFilter myPersonFilter = new PersonFilter(roster);
		
		System.out.println("==========================================");
		System.out.println("Verify Your Answer");
		System.out.println("==========================================");
		Verifier.verifyAgeIsGreaterOrEqualTo18(/* Enter your lambda expression here */);
		Verifier.verifyGenderIsMale(/* Enter your lambda expression here */);
		Verifier.verifyEmailIsAtTestDotCom(/* Enter your lambda expression here */);
		Verifier.verifyMaleLessThan30(/* Enter your lambda expression here */);
		
	}
	
}

interface PersonCheckInterface {
	public boolean check(Person person);
}

class PersonFilter {
	
	List<Person> roster;
	
	public PersonFilter(List<Person> roster) {
		this.roster = roster;
	}
	
	public List<Person> filter(PersonCheckInterface personCheck) {

		List<Person> filterList = new ArrayList<>();
		
		for (Person person : roster) {
			if (personCheck.check(person)) 
				filterList.add(person);
		}
		
		return filterList;
	}
	
}

class Verifier {
	
	private static List<List<String>> truth = Arrays.asList(
			Arrays.asList("Fred", "Jane", "George", "Bob"),
			Arrays.asList("Fred", "George", "Bob", "Ronan", "Nagi"),
			Arrays.asList("George", "Zanya"),
			Arrays.asList("Bob", "Ronan", "Nagi"));
	
	public static void verifyAgeIsGreaterOrEqualTo18() {
		
		System.out.println("  FilterAgeIsGreaterOrEqualTo18Test: Fail");
		
	}
	
	public static void verifyAgeIsGreaterOrEqualTo18(List<Person> inspectedAnswers) {
		
		System.out.print("  FilterAgeIsGreaterOrEqualTo18Test: ");
		System.out.println(verify(inspectedAnswers, truth.get(0)) ? "Pass" : "Fail");
		
	}
	
	public static void verifyGenderIsMale() {
		
		System.out.println("  FilterGenderIsMaleTest: Fail");
		
	}
	
	public static void verifyGenderIsMale(List<Person> inspectedAnswers) {
		
		System.out.print("  FilterGenderIsMaleTest: ");
		System.out.println(verify(inspectedAnswers, truth.get(1)) ? "Pass" : "Fail");
		
	}
	
	public static void verifyEmailIsAtTestDotCom() {
		
		System.out.println("  FilterEmailIsAtTestDotComTest: Fail");
		
	}
	
	public static void verifyEmailIsAtTestDotCom(List<Person> inspectedAnswers) {
		
		System.out.print("  FilterEmailIsAtTestDotComTest: ");
		System.out.println(verify(inspectedAnswers, truth.get(2)) ? "Pass" : "Fail");
		
	}
	
	public static void verifyMaleLessThan30() {
		
		System.out.println("  FilterMaleLessThan30Test: Fail");
		
	}
	
	public static void verifyMaleLessThan30(List<Person> inspectedAnswers) {
		
		System.out.print("  FilterMaleLessThan30Test: ");
		System.out.println(verify(inspectedAnswers, truth.get(3)) ? "Pass" : "Fail");
		
	}
	
	private static boolean verify(List<Person> inspectedAnswers, List<String> truth) {
		
		int length = truth.size();
		if (inspectedAnswers.size() != length) 
			return false;
		
		for (int index = 0; index < length; index++) {
			if (!inspectedAnswers.get(index).getName().equals(truth.get(index))) 
				return false;
		}
		
		return true;
	}
	
}