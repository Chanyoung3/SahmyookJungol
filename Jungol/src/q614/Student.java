package q614;

class Student {
	private String school = "Jejuelementary";
	private int grade = 6;
	
	public void setInfo(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
}
