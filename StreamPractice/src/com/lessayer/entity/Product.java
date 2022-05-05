package com.lessayer.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
	
	protected Integer id;
	protected String name;
	protected ProductType type;
	// Unit of price is EURO.
	protected Double price;
	protected String placeOfOrigin;
	
	public Product(Integer id, String name, ProductType type, Double price, String placeOfOrigin) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.placeOfOrigin = placeOfOrigin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPlaceOfOrigin() {
		return placeOfOrigin;
	}

	public void setPlaceOfOrigin(String placeOfOrigin) {
		this.placeOfOrigin = placeOfOrigin;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price
				+ ", placeOfOrigin=" + placeOfOrigin + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, placeOfOrigin, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(placeOfOrigin, other.placeOfOrigin)
				&& Objects.equals(price, other.price) && type == other.type;
	}



	protected static List<Product> productList = new ArrayList<>();
	
	public static List<Product> getProductList() {
		productList.add(new Product(1, "Toast", ProductType.Bakery, 2.0, "France"));
		productList.add(new Product(2, "Croissant", ProductType.Bakery, 2.2, "France"));
		productList.add(new Product(3, "Green Tea", ProductType.Beverage, 8.3, "Vietanm"));
		productList.add(new Product(4, "Black Tea", ProductType.Beverage, 7.9, "Sri Lanka"));
		productList.add(new Product(5, "Soy Bean Milk", ProductType.Beverage, 6.2, "France"));
		productList.add(new Product(6, "Cheese", ProductType.Dairy, 6.2, "France"));
		productList.add(new Product(7, "Goat Milk", ProductType.Dairy, 10.2, "Spain"));
		productList.add(new Product(8, "Apple", ProductType.Fruit, 3.1, "France"));
		productList.add(new Product(9, "Orange", ProductType.Fruit, 2.2, "Italy"));
		productList.add(new Product(10, "Cherry", ProductType.Fruit, 5.5, "United States"));
		productList.add(new Product(11, "Pork", ProductType.Meat, 3.6, "Denmark"));
		productList.add(new Product(12, "Chicken", ProductType.Meat, 2.9, "France"));
		productList.add(new Product(13, "Tomato", ProductType.Vegetable, 1.8, "Spain"));
		productList.add(new Product(14, "Cabbage", ProductType.Vegetable, 2.0, "Spain"));
		productList.add(new Product(15, "Lettuce", ProductType.Vegetable, 1.5, "France"));
		productList.add(new Product(16, "Carrot", ProductType.Vegetable, 0.8, "France"));
		return productList;
	}
	
}
