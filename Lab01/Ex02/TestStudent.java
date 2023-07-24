//Ahmed Adel Al-Khawahir 	201949310	sec:55
public class TestStudent {
	public static void main(String[] args) {
		
		//Making the array of students
		Student[] student = new Student[10];
		student[0] = new Undergraduate("164623", 3.5);
		student[1] = new Graduate("730234", 3.7);
		student[2] = new Graduate("719878", 2.4);
		student[3] = new Undergraduate("211734", 2.5);
		student[4] = new Undergraduate("569524", 1.5);
		student[5] = new Graduate("500724", 2.9);
		student[6] = new Undergraduate("110235", 3);
		student[7] = new Graduate("334575", 0.9);
		student[8] = new Graduate("745523", 1);
		student[9] = new Undergraduate("541220", 3.1);
		
		//Check if the student is Undergraduate or graduate and then print the informations
		for (int i=0; i<student.length; i++) {
			System.out.println(student[i] instanceof Undergraduate ? "Undergraduate" : "Graduate");
			System.out.println("("+(i+1)+") "+student[i].displayStudent());
			System.out.println();
			
		}
	}

}
