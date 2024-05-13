package day02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BmiGUI {
	// 宣告 GUI 元件
	static JFrame jFrame; // 主視窗
	static JTextField heightField, weightField; // 身高, 體重輸入框
	static JButton calcBmiButton; // 計算 Bmi 的按鈕
	static JLabel bmiLabel, resultLabel; // 放置 bmi 值與診斷結果 
	
	private static void createUI() {
		// GUI 畫面初始化
		jFrame = new JFrame("BMI 計算器"); // 建立視窗與標頭
		jFrame.setSize(300, 200); // 視窗大小
		
		jFrame.setVisible(true); // 顯示視窗
	} 
	
	public static void main(String[] args) {
		createUI();
	}

}
