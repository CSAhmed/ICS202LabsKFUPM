//Ahmed Adel Al-Khawahir 	201949310	sec:55
public abstract class Student {
	private String ID;
	private double GPA;
	
	public Student(String studentID, double GPA){
		this.ID = studentID;
		this.GPA = GPA;
		
	}
	public double getGPA() {
		return GPA;
	}
	public abstract String getStatus();
	
	public String displayStudent() {
		return ("ID: "+ ID + " >> GPA: " + GPA + " >> Status: " + getStatus());
	}

}
