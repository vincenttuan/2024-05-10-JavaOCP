package day09;

public class Book {
	private String name;
	private String author;
	private int totalPages;
	
	public Book() {
		System.out.println("歡迎來閱讀本書");
		name = "unknow";
		author = "unknow";
		totalPages = -1;
	}
	
	public Book(String name) {
		System.out.println("歡迎來閱讀本書");
		this.name = name;
	}
	
	public Book(String name, String author) {
		System.out.println("歡迎來閱讀本書");
		this.name = name;
		this.author = author;
	}
	
	public Book(String name, String author, int totalPages) {
		System.out.println("歡迎來閱讀本書");
		this.name = name;
		this.author = author;
		this.totalPages = totalPages;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Java");
		Book book3 = new Book("Python", "John");
		Book book4 = new Book("MySQL", "Mary", 500);
		
	}
	
}
