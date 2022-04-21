package com.lessayer.entity.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntitySanityCheck {
	
	public static <T> void entitySanityCheck(T entity, String[][] expectedNames) {
		
		System.out.println("==========================================");
		System.out.println("Start Entity Sanity Check");
		System.out.println("==========================================");
		checkExactlyMatchFields(entity, expectedNames[0]);
		checkContainMethods(entity, expectedNames[1]);
		
	}
	
	// Check the consistency between the field names of given entity and assigned field names
	
	private static <T> void checkExactlyMatchFields(T entity, String[] expectedFieldNames) {
		
		System.out.print("  checkExactlyMatchFields: ");
		
		List<Field> fields = Arrays.asList(entity.getClass().getDeclaredFields());
		
		if (fields.size() != expectedFieldNames.length) {
			System.out.println("Field length mismatches.");
			return;
		}
			
		List<String> fieldNames = new ArrayList<>();
		fields.forEach(f -> fieldNames.add(f.getName()));
		
		
		for (String fieldName : expectedFieldNames) {
			if (!fieldNames.contains(fieldName)) {
				System.out.println("Field name " + fieldName + " doesn't exist.");
				return;
			}
		}
		
		System.out.println("Pass");
	}
	
	// Check the class of given entity contains assigned method names
	
	private static <T> void checkContainMethods(T entity, String[] expectedMethodNames) {
		
		System.out.print("  checkContainMethods: ");
		
		List<Method> methods = Arrays.asList(entity.getClass().getDeclaredMethods());
		
		List<String> methodNames = new ArrayList<>();
		methods.forEach(m -> methodNames.add(m.getName()));
		
		for (String methodName : expectedMethodNames) {
			if (!methodNames.contains(methodName)) {
				System.out.println("Method name " + methodName + " doesn't exist.");
				return;
			}
		}
		
		System.out.println("Pass");
	
	}
	
}
