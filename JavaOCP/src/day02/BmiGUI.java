package day02;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.Locale;

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
		// 5(有 5 列) 2(有 2 欄) 5(水平間隙) 5(垂直間隙)
		jFrame.setLayout(new GridLayout(5, 2, 5, 5)); // 設定布局樣式
		
		jFrame.add(new JLabel("身高(cm):"));
		heightField = new JTextField();
		jFrame.add(heightField);
		
		jFrame.add(new JLabel("體重(cm):"));
		weightField = new JTextField();
		jFrame.add(weightField);
		
		calcBmiButton = new JButton("計算 BMI");
		jFrame.add(calcBmiButton);
		
		bmiLabel = new JLabel("您的 BMI 是:");
		jFrame.add(bmiLabel);
		
		resultLabel = new JLabel("診斷結果:");
		jFrame.add(resultLabel);
		
		jFrame.setVisible(true); // 顯示視窗
		
		// 計算 bmi 的按鈕按下去所要執行的方法
		calcBmiButton.addActionListener((event) -> calcBmi());
	} 
	
	private static void calcBmi() {
		// heightField.getText() 取得的是字串所以要利用 Double.parseDouble() 轉型
		double h = Double.parseDouble(heightField.getText());
		double w = Double.parseDouble(weightField.getText());
		double bmi = BmiUtil.getBmi(h, w);
		String result = BmiUtil.getResult(bmi);
		// 將 bmi 值與診斷結果顯示在畫面中
		bmiLabel.setText(String.format("您的 BMI 是:%.2f", bmi));
		resultLabel.setText(String.format("診斷結果:%s", result));
	}
	
	public static void main(String[] args) {
		createUI();
	}

}
