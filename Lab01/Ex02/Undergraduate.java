//Ahmed Adel Al-Khawahir 	201949310	sec:55
public class Undergraduate extends Student {

	public Undergraduate(String studentID, double GPA) {
		super(studentID, GPA);
		
	}

	@Override
	public String getStatus() {
		double GPA = super.getGPA();
		
		if (GPA >= 3) {
			return "Honor";
		}
		else if (GPA >= 2) {
			return "Good";
		}
		else {
			return "Probation";
		}
	}

}
