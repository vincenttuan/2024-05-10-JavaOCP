package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class SelectGuestbook {

	public static void main(String[] args) {
		// 查詢 mysql guestbook
		String username = "root";
		String password = "12345678";
		String dbUrl = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
		
		Connection conn = null; // 資料庫連線
		Statement stmt = null;  // 下達 sql 敘述
		ResultSet rs = null;    // 得到的結果
		
		try {
			conn = DriverManager.getConnection(dbUrl, username, password); // 建立連線
			stmt = conn.createStatement(); // 建立 sql 敘述物件
			String sql = "select id, name, message, create_time from guestbook";
			rs = stmt.executeQuery(sql);
			// 尋訪 rs 內的結果集
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String message = rs.getString("message");
				Timestamp createTime = rs.getTimestamp("create_time");
				System.out.printf("%d %s %s %s%n", id, name, message, createTime);
			}
			
		} catch (SQLException e) {
			System.err.println("連線失敗");
			System.err.println("失敗原因:" + e.getMessage());
		}
		
		
	}

}
