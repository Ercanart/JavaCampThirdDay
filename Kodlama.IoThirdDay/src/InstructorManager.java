
public class InstructorManager extends UserManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("E�itmen eklendi : " + instructor.getInstructorName() + " " + instructor.getInstructorSurName());

	}

	public void delete(Instructor instructor) {
		System.out.println("E�itmen silindi : " + instructor.getInstructorName() + " " + instructor.getInstructorSurName());

	}
}