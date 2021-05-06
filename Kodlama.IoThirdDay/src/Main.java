public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(1,"haldun","tekbudak", "ali@hotmail.com");
		Student student2 = new Student(2,"anýl","yücesan", "yuce@hotmail.com");
		
		Instructor instructor1 = new Instructor(3,"engin","demiroð","engin@gmail.com","Full Stack Developer");
		Instructor instructor2 = new Instructor(4,"gökay","güneþ","gunes@gmail.com","Backend");
		
		NewUserI newUserI = new NewUserI(); //Yeni bir kullanýcý Manager eklersek kullanýrýz.
		
		newUserI.newUserAdd(new InstructorManager());
		
		StudentManager studentManager = new StudentManager(); //Öðrenci metotlarý için
		
		studentManager.addStudent(student1);
		studentManager.delete(student2);
		
		InstructorManager instructorManager = new InstructorManager(); //Eðitmen metotlarý için
		
		instructorManager.delete(instructor2);
		instructorManager.addInstructor(instructor1);
		instructorManager.login(instructor2);
	}
}
