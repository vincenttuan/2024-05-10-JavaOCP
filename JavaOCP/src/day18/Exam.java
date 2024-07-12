package day18;

import java.util.Objects;

public class Exam implements Comparable<Exam> {
	private String subject;
	private Integer score;
	
	public Exam(String subject, Integer score) {
		this.subject = subject;
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(score, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		return Objects.equals(score, other.score) && Objects.equals(subject, other.subject);
	}
	
	public String getSubject() {
		return subject;
	}

	public Integer getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", score=" + score + "]";
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public int compareTo(Exam o) {
		if(this.score == null && o.score == null) {
			return 0;
		}
		if(this.score == null) {
			return 1;
		}
		if(o.score == null) {
			return -1;
		}
		return this.score - o.score; // 由小到大
	}
	
}
