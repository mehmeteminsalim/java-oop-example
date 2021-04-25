package oopOdev;

public class Instructor {

	public Instructor() {

	}

	public Instructor(int id, String name, String description, String imageUrl) {
		
		this();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		
	}

	int id;
	String name;
	String description;
	String imageUrl;

}
