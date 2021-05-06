public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(1,"haldun","tekbudak", "ali@hotmail.com");
		Student student2 = new Student(2,"an�l","y�cesan", "yuce@hotmail.com");
		
		Instructor instructor1 = new Instructor(3,"engin","demiro�","engin@gmail.com","Full Stack Developer");
		Instructor instructor2 = new Instructor(4,"g�kay","g�ne�","gunes@gmail.com","Backend");
		
		NewUserI newUserI = new NewUserI(); //Yeni bir kullanici Manager eklersek kullaniriz.
		
		newUserI.newUserAdd(new InstructorManager());
		
		StudentManager studentManager = new StudentManager(); //Ogrenci metotlar� icin
		
		studentManager.addStudent(student1);
		studentManager.delete(student2);
		
		InstructorManager instructorManager = new InstructorManager(); //Egitmen metotlar� icin
		
		instructorManager.delete(instructor2);
		instructorManager.addInstructor(instructor1);
		instructorManager.login(instructor2);
	}
}
