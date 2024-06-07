package day09;

public class Book {
	private String name;
	private String author;
	private int totalPages;
	
	public Book() {
		
	}
	
	public Book(String name) {
		this.name = name;
	}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public Book(String name, String author, int totalPages) {
		this.name = name;
		this.author = author;
		this.totalPages = totalPages;
	}
	
}
