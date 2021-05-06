
public class StudentManager extends UserManager {
	
	public void addStudent(Student student) {
		System.out.println("Öğrenci eklendi : " + student.getName() +" "+ student.getSurName());

	}

	public void delete(Student student) {
		System.out.println("Öğrenci silindi : " + student.getName() +" "+ student.getSurName());

	}

}