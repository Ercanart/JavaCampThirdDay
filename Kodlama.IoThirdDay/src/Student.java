public class Student extends User {
	
	private String name;
	private String surName;
	
	public Student() {}
	
	public Student(int id, String name, String surName, String email) {
		super(id,email);
		setName(name);
		setSurName(surName);	
	}
	
	public String getName() {
		return name.toUpperCase();
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getSurName() {
		return surName.toUpperCase();
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}

}