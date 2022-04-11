package BeanLifeCycle;

public class Student {
	private int studentId;
	private String studentname;
	private String education;
	public Student() {
		super();
	}
	public Student(int studentId, String studentname, String education) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.education = education;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", education=" + education + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

	public void start(){
		System.out.println("in Start Method");
	}

	public void end(){
		System.out.println("in End Method");
	}
}
