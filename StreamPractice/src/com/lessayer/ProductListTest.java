package com.lessayer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lessayer.entity.Product;
import com.lessayer.entity.ProductType;

public class ProductListTest {
	
	public static void main(String... args) {
		
		List<Product> productList = Product.getProductList();
		
		// Create a list recording all products come from France.

		
		// Create a French food list containing only product name.
		
		
		// Calculate the total price of all beverage.

		
		// Find the most expensive product in the list and return the price.

		
		// Return the cheapest product from the list.

		
		// Return the count of products that come from France.

		
		// Confirm if any product comes from United Kingdom

		
		// Sort all the product by name and return the product list.

		
		// Generate a map containing only name and price of each product.


	}
	
	static class Answer {
		public static List<Product> answer1 = Arrays.asList(
				new Product(1, "Toast", ProductType.Bakery, 2.0, "France"), new Product(2, "Croissant", ProductType.Bakery, 2.2, "France"),
				new Product(5, "Soy Bean Milk", ProductType.Beverage, 6.2, "France"), new Product(6, "Cheese", ProductType.Dairy, 6.2, "France"),
				new Product(8, "Apple", ProductType.Fruit, 3.1, "France"), new Product(12, "Chicken", ProductType.Meat, 2.9, "France"),
				new Product(15, "Lettuce", ProductType.Vegetable, 1.5, "France"), new Product(16, "Carrot", ProductType.Vegetable, 0.8, "France")
				);
		
		public static List<String> answer2 = Arrays.asList("Toast", "Croissant", "Soy Bean Milk", "Cheese", "Apple", "Chicken", "Lettuce", "Carrot");
		
		public static Double answer3 = 22.4;
		
		public static Double answer4 = 10.2;
		
		public static Product answer5 = new Product(16, "Carrot", ProductType.Vegetable, 0.8, "France");
		
		public static Long answer6 = 8L;
		
		public static Boolean answer7 = false;
		
		public static List<Product> answer8 = Arrays.asList(
				new Product(8, "Apple", ProductType.Fruit, 3.1, "France"), new Product(4, "Black Tea", ProductType.Beverage, 7.9, "Sri Lanka"),
				new Product(14, "Cabbage", ProductType.Vegetable, 2.0, "Spain"), new Product(16, "Carrot", ProductType.Vegetable, 0.8, "France"),
				new Product(6, "Cheese", ProductType.Dairy, 6.2, "France"), new Product(10, "Cherry", ProductType.Fruit, 5.5, "United States"),
				new Product(12, "Chicken", ProductType.Meat, 2.9, "France"), new Product(2, "Croissant", ProductType.Bakery, 2.2, "France"),
				new Product(7, "Goat Milk", ProductType.Dairy, 10.2, "Spain"), new Product(3, "Green Tea", ProductType.Beverage, 8.3, "Vietanm"),
				new Product(15, "Lettuce", ProductType.Vegetable, 1.5, "France"), new Product(9, "Orange", ProductType.Fruit, 2.2, "Italy"),
				new Product(11, "Pork", ProductType.Meat, 3.6, "Denmark"), new Product(5, "Soy Bean Milk", ProductType.Beverage, 6.2, "France"),
				new Product(1, "Toast", ProductType.Bakery, 2.0, "France"), new Product(13, "Tomato", ProductType.Vegetable, 1.8, "Spain")
				);
		
		public static Map<String, Double> answer9 = new HashMap<>();
		
		static {
			answer9.put("Carrot", 0.8); answer9.put("Cherry", 5.5); answer9.put("Croissant", 2.2); answer9.put("Cheese", 6.2);
			answer9.put("Black Tea", 7.9); answer9.put("Tomato", 1.8); answer9.put("Orange", 2.2); answer9.put("Apple", 3.1);
			answer9.put("Lettuce", 1.5); answer9.put("Goat Milk", 10.2); answer9.put("Toast", 2.0); answer9.put("Soy Bean Milk", 6.2); 
			answer9.put("Chicken", 2.9); answer9.put("Cabbage", 2.0); answer9.put("Green Tea", 8.3); answer9.put("Pork", 3.6);
		}
				
	}
	
}
