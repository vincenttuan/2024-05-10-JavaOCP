package day18;

public class Exam {
	private String subject;
	private Integer score;
	
	public Exam(String subject, Integer score) {
		this.subject = subject;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", score=" + score + "]";
	}
	
}
