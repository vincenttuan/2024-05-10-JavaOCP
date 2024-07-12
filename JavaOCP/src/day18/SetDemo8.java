package day18;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo8 {

	public static void main(String[] args) {
		// Set 排序使用 TreeSet
		SortedSet<Exam> exams = new TreeSet<>();
		exams.add(new Exam("VB", 80));
		exams.add(new Exam("Javascript", null));
		exams.add(new Exam("Java", 90));
		exams.add(new Exam("Pascal", -40));
		exams.add(new Exam("Python", null));
		exams.add(new Exam("C#", 70));
		// 1.印出所有成績資料
		System.out.println(exams);
		
		// 2.移除 score = null 或 score < 0 的元素
		exams.removeIf(exam -> exam.getScore() == null || exam.getScore().intValue() < 0);
		System.out.println(exams);
		
		// 3.最後根據分數由大到小印出 (例如:Java:90, VB:80, C#:70)
		// [Exam [subject=Java, score=90], Exam [subject=VB, score=80], [Exam [subject=C#, score=70]]
		// 建立一個 exams2 集合來存放由大到小的結果
		// 此集合的 Comparator 需自行實現由大到小的邏輯並放到 TreeSet 建構子當中
		Comparator<Exam> comparator = (o1, o2) -> o2.getScore() - o1.getScore();
		SortedSet<Exam> exams2 = new TreeSet<>(comparator);
		exams2.addAll(exams); // 將 exams 加入
		System.out.println(exams2);
		
		

	}

}
