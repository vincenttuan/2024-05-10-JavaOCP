package day25;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
    public static void main(String[] args) {
        // 收件者的電子郵件地址
        String to = "recipient@example.com";

        // 寄件者的電子郵件地址
        String from = "your-email@gmail.com";

        // 使用 Gmail SMTP 伺服器
        String host = "smtp.gmail.com";

        // 設定屬性
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");

        // 建立會話物件，並提供驗證資訊
        Session session = Session.getInstance(properties,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("your-email@gmail.com", "your-password");
                }
            });

        try {
            // 建立一個預設的 MimeMessage 物件
            Message message = new MimeMessage(session);

            // 設定寄件者
            message.setFrom(new InternetAddress(from));

            // 設定收件者
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));

            // 設定郵件標題
            message.setSubject("測試郵件標題");

            // 設定郵件內容
            message.setText("這是一封測試郵件，透過 Java 程式發送！");

            // 傳送郵件
            Transport.send(message);

            System.out.println("郵件發送成功！");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

