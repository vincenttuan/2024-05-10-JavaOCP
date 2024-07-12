package day18;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo8 {

	public static void main(String[] args) {
		// Set 排序使用 TreeSet
		SortedSet<Exam> exams = new TreeSet<>();
		exams.add(new Exam("VB", 80));
		exams.add(new Exam("Javascript", null));
		exams.add(new Exam("Java", 90));
		exams.add(new Exam("Python", null));
		exams.add(new Exam("C#", 70));
		// 請根據分數由大到小印出 (例如:Java:90, VB:80, C#:70)
		
		

	}

}
