package oopOdev;

public class Main {

	public static void main(String[] args) {
		
		/**** Course ****/
		
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","C# ile kurumsal backend","https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0",1,33.0,25.00);
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Java ile kurumsal backend","https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI",1,38.0,30.00);
		Course course3 = new Course(3,"Programlamaya Giriş için Temel Kurs","Temel yazılım","https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/BBLmG3XFTtm8XBTrzg4v",1,40.0,00.00);
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println("Kurs Resmi           : " + course.imageUrl);
			System.out.println("Kurs Adı             : " + course.name);
			System.out.println("Kurs Açıklaması      : " + course.description);
			System.out.println("Kurs Tamamlama Oranı : %" + course.completionRate);
			System.out.println("Kurs Fiyatı          : " + course.price);
			System.out.println("-----------------------------");
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollCourse(course1);
		courseManager.addToFavorite(course2);
		
		/**** Curriculum ****/
		
		Curriculum curriculum1 = new Curriculum(1,1,2,"Ders Programı","JAVA Temelleri 2",true,false);
		Curriculum curriculum2 = new Curriculum(2,1,0,"2. Gün","",true,false);
		
		Curriculum[] curriculums = {curriculum1,curriculum2};
		
		for (Curriculum curriculum : curriculums) {
			System.out.println("Kurs Id                 : " + curriculum.courseId);
			System.out.println("Üst Kategori Id         : " + curriculum.parentId);
			System.out.println("Bölüm Adı               : " + curriculum.title);
			System.out.println("Bölüm Açıklaması        : " + curriculum.description);
			System.out.println("Aktif/Pasif             : " + curriculum.isActive);
			System.out.println("Tamamlandı/Tamamlanmadı : " + curriculum.isCompleted);
			System.out.println("-----------------------------");
		}
		
		CurriculumManager curriculumManager = new CurriculumManager();
		curriculumManager.completed(curriculum1);
		
		/**** Instructor ****/
		
		Instructor instructor1 = new Instructor(1,"Engin Demiroğ","Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim.","https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3");
		
		Instructor[] instructors = {instructor1};
		
		for (Instructor instructor : instructors) {
			System.out.println("Eğitmen Adı                 : " + instructor.name);
			System.out.println("Eğitmen Hakkında            : " + instructor.description);
			System.out.println("Resim Url                   : " + instructor.imageUrl);
			System.out.println("-----------------------------");
		}
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.likeATutor(instructor1);
		
		
		/**** Category ****/
		
		Category category1 = new Category(1,"Kurslarım",0,true);
		Category category2 = new Category(2,"Tüm Kurslar",0,true);
		Category category3 = new Category(3,"Kampa Hazırlık",0,true);
		Category category4 = new Category(4,"SSS",0,true);
		
		Category[] categories = {category1,category2,category3,category4};
		
		for (Category category : categories) {
			System.out.println("Kategori Adı          : " + category.title);
			System.out.println("Kategori Üst Id       : " + category.parentId);
			System.out.println("Aktif/Pasif           : " + category.isActive);
			System.out.println("-----------------------------");
		}
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.clickCounter(category2);
		
	}

}
