
public class StudentManager extends UserManager {
	
	public void addStudent(Student student) {
		System.out.println("��renci eklendi : " + student.getName() +" "+ student.getSurName());

	}

	public void delete(Student student) {
		System.out.println("��renci silindi : " + student.getName() +" "+ student.getSurName());

	}

}