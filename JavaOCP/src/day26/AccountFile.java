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
			String content = Files.readString(path);
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
	
}
