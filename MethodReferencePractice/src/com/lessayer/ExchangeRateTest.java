package com.lessayer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ExchangeRateTest {
	
	public static void main(String... args) {
		Product product1 = new Product("Smart phone", 599.0f, Currency.EUR);
		
		product1.printProductInfo(Currency.EUR, /* Write your code here! */);
		product1.printProductInfo(Currency.USD, /* Write your code here! */);
		product1.printProductInfo(Currency.JPY, /* Write your code here! */);
	}
	
}

class Product {
	
	private String name;
	private Float price;
	private Currency currency;
	
	public Product(String name, Float price, Currency currency) {
		this.name = name;
		this.price = price;
		this.currency = currency;
	}
	
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	/* Remember to round the price to 2 digits after point. */
	public void printProductInfo(Currency currency, BiFunction<Float, Currency, Float> calculatePriceMethod) {
		System.out.println("Product name: " + name);
		System.out.println("Price: " + Math.round(calculatePriceMethod.apply(price, currency) * 100.0) / 100.0  + " " + currency);
	}
	
}

class CurrencyConvertor {
	
	private static final Map<Currency, Float> exchangeRateTable;
	static {
		HashMap<Currency, Float> map = new HashMap<>();
		map.put(Currency.AUD, 1.48f);
		map.put(Currency.CAD, 1.35f);
		map.put(Currency.CHF, 1.02f);
		map.put(Currency.CNY, 6.95f);
		map.put(Currency.EUR, 1.0f);
		map.put(Currency.GBP, 0.84f);
		map.put(Currency.JPY, 136.70f);
		map.put(Currency.USD, 1.05f);
		exchangeRateTable = map;
	}
	
	/* Write your code here! 
	 * static public Float convertCurrency(...) {
	 * 	   ...
	 * } */

}

enum Currency {
	AUD, CAD, CHF, CNY, EUR, GBP, JPY, USD
}