package top.catarina.base.email.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import top.catarina.base.email.EmailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Map;

/**
 * @author Civin
 * @create 2018-01-22 19:20
 */
@Service
public class EmailSenderImpl implements EmailSender {

	@Autowired
	private JavaMailSender sender;

	@Value("${spring.mail.username}")
	private String from;

	@Override
	public void sendTemplete(String address, String subject, String template, Map<String, Object> data) {
	}

	@Override
	public void sendText(String address, String subject, String content, boolean html) {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper message = null;
		try {
			message = new MimeMessageHelper(msg, true, "UTF-8");

		message.setFrom(from);
		message.setSubject(subject);
		message.setTo(address);
		message.setText(content, html);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		new Thread(() -> sender.send(msg)).start();
	}
}
