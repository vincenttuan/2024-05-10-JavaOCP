package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AccountFile {
	
	private static final String BALANCE_FILE = "src/day26/balance.txt"; // 餘額檔
	
	static { // 類別資源初始化區段
		Path path = Paths.get(BALANCE_FILE); // 檔案路徑物件
		if(!Files.exists(path)) { // 若檔案路徑不存在
			try {
				// 將 10000 寫入到檔案
				// TRUNCATE_EXISTING: 如果文件已經存在, 則在寫入之前清空
				Files.writeString(path, "10000", 
						StandardOpenOption.CREATE, 
						StandardOpenOption.WRITE, 
						StandardOpenOption.TRUNCATE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 讀取餘額
	private static int readBalance() {
		Path path = Paths.get(BALANCE_FILE); // 檔案路徑
		try {
			// 讀取檔案內容
			String content = Files.readString(path).trim();
			// 將內容轉 int
			return Integer.parseInt(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	// 寫入檔案餘額
	private static void writeBalance(int balance) {
		Path path = Paths.get(BALANCE_FILE); // 檔案路徑
		try {
			Files.writeString(path, // 檔案路徑 
					String.valueOf(balance), // 要寫入的資料 
					StandardOpenOption.CREATE, 
					StandardOpenOption.WRITE, 
					StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 提款
	public synchronized void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 要提款 $%d%n", tName, amount);
	
		// 取得提款金額(從檔案中讀取)
		int currentBalance = readBalance();
		if(currentBalance >= amount) {
			// 開始提款
			for(int i=0;i<=999999999;i++); // 模擬提款延遲時間
			// 餘額扣除
			int newbalance = currentBalance - amount;
			// 寫入檔案
			writeBalance(newbalance);
			System.out.printf("%s 提款 $%d 成功%n", tName, amount);
		} else {
			System.out.printf("%s 提款 $%d 失敗%n", tName, amount);
		}
		System.out.printf("帳戶餘額 $%d%n", readBalance());
	}
	
}
