public class Instructor extends User {

	private String departmentName;   
	private String instructorName;
	private String instructorSurName;

	public Instructor() {}

	public Instructor(int id, String instructorName, String instructorSurName, String email, String departmentName) {
		super(id,email);
		setInstructorName(instructorName);
		setInstructorSurName(instructorSurName);
		setDepartmentName(departmentName);
	}


	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getInstructorName() {
		return instructorName.toUpperCase();
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorSurName() {
		return instructorSurName.toUpperCase();
	}

	public void setInstructorSurName(String instructorSurName) {
		this.instructorSurName = instructorSurName;
	}
}
