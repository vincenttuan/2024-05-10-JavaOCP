package day18;

import java.util.Comparator;
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
		int totalScore = 0; // 總分累計 
		Exam hightScoreExam = null; // 最高分的 Exam 物件
		
		for(Exam exam : exams) {
			// 總分累計
			totalScore += exam.getScore();
			// 判斷 exam 是否是最高分
			if(hightScoreExam == null ||
					exam.getScore().intValue() > hightScoreExam.getScore().intValue()) {
				hightScoreExam = exam;
			}
		}
		
		System.out.printf("總分: %d 最高分科目: %s%n", totalScore, hightScoreExam.getSubject());
		
		// 利用 Stream
		int totalScore2 = exams.stream()
							   .mapToInt(Exam::getScore)
							   .sum();
		Exam hightScoreExam2 = exams.stream()
									//.max(Comparator.comparingInt(exam -> exam.getScore()))
									.max(new Comparator<Exam>() {

										@Override
										public int compare(Exam o1, Exam o2) {
											return o1.getScore() - o2.getScore();
										}
										
									})
									.get();
		System.out.printf("總分: %d 最高分科目: %s%n", totalScore2, hightScoreExam2.getSubject());
		
									
	}

}
