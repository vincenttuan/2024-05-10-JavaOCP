package day13_2;

// 建立咖啡規格
public interface Coffee {
	String getName(); // 取得咖啡名稱
	String getOrigin(); // 取得產地
	double getPrice(); // 取得價格
	int getStrength(); // 取得咖啡濃度(1~5)
	String getDescription(); // 取得咖啡描述
}

