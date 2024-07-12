package day18;

import java.util.HashSet;
import java.util.Set;

public class SetDemo6 {

	public static void main(String[] args) {
		// Set <>泛型應用
		Set<Exam> exams = new HashSet<>();
		exams.add(new Exam("VB", 80));
		exams.add(new Exam("Java", 90));
		exams.add(new Exam("C#", 70));
		// 求總分與最高分的科目 ?
		

	}

}
