//Ahmed Adel Al-Khawahir 	201949310	sec:55
public class Textbook extends Book {
	private String course;
	
	public Textbook(String title, int pages, String course) {
		super(title, pages);
		this.course = course;
		
	}
	
	public String getCourse() {
		return course;
	}
	
	@Override
	public String toString() {
		return ("Text Book: "+super.getTitle()+", "+course+", #Pages = "+super.getPages()+", Course = "+course);
	}
	
	

}
