package q614;

class Student {
	private String school = "Jejuelementary";
	private int grade = 6;
	
	public Student() {
		System.out.println(grade + " grade in " + school + " School");
	}
	
	public void setInfo(String school, int grade) {
		this.school = school;
		this.grade = grade;
		System.out.println(this.grade + " grade in " + this.school + " School");
	}
}
