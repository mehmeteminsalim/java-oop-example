package oopOdev;

public class Category {

	public Category() {
		
	}

	public Category(int id, String title, int parentId, boolean isActive) {
		
		this();
		this.id = id;
		this.title = title;
		this.parentId = parentId;
		this.isActive = isActive;
	}

	int id;
	String title;
	int parentId;
	boolean isActive;
}
