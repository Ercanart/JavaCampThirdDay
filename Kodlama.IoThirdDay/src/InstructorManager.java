
public class InstructorManager extends UserManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Eðitmen eklendi : " + instructor.getInstructorName() + " " + instructor.getInstructorSurName());

	}

	public void delete(Instructor instructor) {
		System.out.println("Eðitmen silindi : " + instructor.getInstructorName() + " " + instructor.getInstructorSurName());

	}
}