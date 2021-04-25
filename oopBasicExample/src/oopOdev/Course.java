package oopOdev;

public class Course {

	public Course() {

	}

	public Course(int id,String name,String description,String imageUrl, int instructorId,double completionRate,double price) {

		this();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.instructorId = instructorId;
		this.completionRate = completionRate;
		this.price = price;
		
	}

	int id;
	String name;
	String description;
	String imageUrl;
	int instructorId;
	double completionRate;
	double price;

}
