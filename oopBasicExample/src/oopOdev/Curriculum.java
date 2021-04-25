package oopOdev;

public class Curriculum {

	public Curriculum() {

	}

	public Curriculum(int id, int courseId, int parentId, String title, String description, boolean isActive, boolean isCompleted) {

		this();
		this.id = id;
		this.courseId = courseId;
		this.parentId = parentId;
		this.title = title;
		this.description = description;
		this.isActive = isActive;
		this.isCompleted = isCompleted;
		
	}

	int id;
	int courseId;
	int parentId;
	String title;
	String description;
	boolean isActive;
	boolean isCompleted;

}
