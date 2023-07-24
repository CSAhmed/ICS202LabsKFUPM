//Ahmed Adel Al-Khawahir 	201949310	sec:55
public class Graduate extends Student {

	public Graduate(String studentID, double GPA) {
		super(studentID, GPA);
		
	}

	@Override
	public String getStatus() {
		double GPA = super.getGPA();
		
		if (GPA >= 3) {
			return "Good";
		}
		else {
			return "Probation";
		}
		
	}

}
