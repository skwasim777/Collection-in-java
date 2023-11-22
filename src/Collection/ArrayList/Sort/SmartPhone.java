package Collection.ArrayList.Sort;

public class SmartPhone {

	String brand;
	String model;
	int price;
	int rating;

	public SmartPhone(String brand, String model, int price, int rating) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.rating = rating;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "SamrtPhone [brand=" + brand + ", model=" + model + ", price=" + price + ", rating=" + rating + "]";
	}

	public int compareTo(SmartPhone p) {
		return this.price - p.price;

	}
}
