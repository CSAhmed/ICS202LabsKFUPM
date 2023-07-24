//Ahmed Adel Al-Khawahir 	201949310	sec:55
public class Book {
	private String title;
	private int pages;
	
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	public String getTitle() { return title; }
	
	public int getPages() { return pages; }
	
	public String toString() {
		return ("Book: "+title+", #Pages = "+pages);
	}
	

}
