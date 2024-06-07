package day09;

// 學生
public class Student {
	private int id; // 學號
	private String name; // 姓名
	
	public Student() {
		this(-1, "Unknow");
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
